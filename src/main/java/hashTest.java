import redis.clients.jedis.Jedis;

public class hashTest {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.198.21",7001);

        //增加  查询
        /*jedis.hset("h1","uid1","12345");
        jedis.hset("h1","uid2","67890");*/

        //查询所有key
       /* System.out.println(jedis.hkeys("h1"));*/

        //查询所有value
        /*System.out.println(jedis.hvals("h1"));*/

        //查询所有的key和value
        /*System.out.println(jedis.hgetAll("h1"));*/

        //修改key为uid1的值
        /*jedis.hset("h1","uid1","11111");
        System.out.println(jedis.hgetAll("h1"));*/

        //删除key为uid1的键值对
       /* jedis.hdel("h1","uid1");
        System.out.println(jedis.hgetAll("h1"));*/

    }
}
