package utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisPoolUtil {
    private static JedisPool jedisPool;

    //首先加载配置文件
    static {
        InputStream is = JedisPoolUtil.class.getClassLoader().getResourceAsStream("jedis.properties");
        Properties pop=new Properties();
        try {
            pop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(pop.getProperty("maxTotal")));
        config.setMaxIdle(Integer.parseInt(pop.getProperty("maxIdle")));
        jedisPool=new JedisPool(pop.getProperty("host"), Integer.parseInt(pop.getProperty("port")));
    }

    //返回一个jedis对象
    public Jedis getJedis(){
       Jedis jedis = jedisPool.getResource();
        return jedis;
    }
}
