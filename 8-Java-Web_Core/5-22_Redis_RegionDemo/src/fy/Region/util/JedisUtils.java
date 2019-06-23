package fy.Region.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Jedis的工具类
 *      加载配置文件
 *     连接redis数据库,创建连接池
 *     提供一个Jedisd的连接对象
 */
public class JedisUtils {
    private static JedisPool jedisPool;
    static {
        InputStream is = JedisUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        Properties pop=new Properties();
        try {
            pop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(pop.getProperty("maxTotal")));
        config.setMaxIdle(Integer.parseInt(pop.getProperty("maxIdle")));
        jedisPool=new JedisPool(config,pop.getProperty("host"), Integer.parseInt(pop.getProperty("port")));
    }

    public  Jedis getJedis(){
        Jedis jedis = jedisPool.getResource();
        return jedis;
    }
}
