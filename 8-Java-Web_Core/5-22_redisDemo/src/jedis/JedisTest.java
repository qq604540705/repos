package jedis;


import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import utils.JedisPoolUtil;

import java.util.Map;
import java.util.Set;


public class JedisTest {


    @Test
    public void JedisString(){
        Jedis jedis =new Jedis("localhost",6379);
        jedis.set("name","zhangsan");
        String name = jedis.get("name");
        System.out.println("name = " + name);
        jedis.close();
    }
    @Test
    public void JedisHash(){
        Jedis jedis =new Jedis("localhost",6379);
        jedis.hset("user","name","zhangsna");
        String hget = jedis.hget("user", "name");
        System.out.println("hget = " + hget);
        jedis.close();
    }
    @Test
    public void JedosUtils(){
        JedisPoolUtil jedisPoolUtil=new JedisPoolUtil();
        Jedis jedis = jedisPoolUtil.getJedis();
        jedis.set("123","hahahah");
        String s = jedis.get("123");
        System.out.println("s = " + s);
        jedis.close();
    }
}
