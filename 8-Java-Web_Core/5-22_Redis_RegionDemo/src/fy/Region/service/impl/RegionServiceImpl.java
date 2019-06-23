package fy.Region.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fy.Region.dao.RegionDao;
import fy.Region.dao.impl.RegionDaoImpl;
import fy.Region.service.RegionService;
import fy.Region.util.JedisUtils;
import redis.clients.jedis.Jedis;

import java.util.List;

/** 数据查询业务逻辑
 *  如果第一次查询,连接数据库,如果不是第一次查询,直接从缓存里面读取
 */
public class RegionServiceImpl implements RegionService {
    private static RegionDao region=new RegionDaoImpl();
    @Override
    public String findAll() throws JsonProcessingException {
        JedisUtils jedisUtils=new JedisUtils();
        Jedis jedis = jedisUtils.getJedis();
        String region = jedis.get("region");
        if (region!=null||region.length()!=0){
            System.out.println("redis中有数据");
            return region;
        }else {
            System.out.println("缓存中没有数据,正在加载数据");
            List all = this.region.findALL();
            for (Object o : all) {
                jedisUtils.getJedis().rpush("region", (String) o);
            }
            ObjectMapper mapper=new ObjectMapper();
            String json = mapper.writeValueAsString(all);
            return json;
        }
    }
}
