import redis.clients.jedis.Jedis;

public class setTest {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.198.21",7000);

        //增加   查询
        /*jedis.sadd("set1","hadoop","is","good");
        System.out.println(jedis.smembers("set1"));*/

        //删除
        /*jedis.srem("set1","is");
        System.out.println(jedis.smembers("set1"));*/


    }
}
