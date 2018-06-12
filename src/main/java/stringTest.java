import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class stringTest {

    public static void main(String[] args) {

        /*JedisPoolConfig  poolConfig = new JedisPoolConfig();
        //最大连接数
        poolConfig.setMaxTotal(1);
        //最大空闲数
        poolConfig.setMaxIdle(1);
        //最大允许等待时间
        poolConfig.setMaxWaitMillis(1000);

        Set<HostAndPort> nodes =  new LinkedHashSet<HostAndPort>();
        nodes.add(new HostAndPort("192.168.198.21",7000));
        nodes.add(new HostAndPort("192.168.198.21",7001));
        nodes.add(new HostAndPort("192.168.198.21",7002));
        nodes.add(new HostAndPort("192.168.198.21",7003));
        nodes.add(new HostAndPort("192.168.198.21",7004));
        nodes.add(new HostAndPort("192.168.198.21",7005));

        JedisCluster cluster = new JedisCluster(nodes,poolConfig);*/

        Jedis jedis = new Jedis("192.168.198.21", 7000);

        //增加  查询  修改
       /* jedis.set("key1","hello");
        String  k =jedis.get("key1");
        System.out.println(k);*/

        //删除
        /*jedis.del("key3");
        String k = jedis.get("key3");
        System.out.println(k);*/





       /* try {
            cluster.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }


}
