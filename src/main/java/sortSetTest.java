import redis.clients.jedis.Jedis;

public class sortSetTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.198.21", 7002);

        //增加  查询
        /*jedis.zadd("sset1",1,"hadoop");
        jedis.zadd("sset1",2,"is");
        jedis.zadd("sset1",3,"good");
        System.out.println( jedis.zrange("sset1",0,-1));*/

        //修改
        /*jedis.zadd("sset1", 1, "good");
        System.out.println(jedis.zrange("sset1", 0, -1));*/

        //删除
        /*jedis.zrem("sset1", "good","is");
        System.out.println(jedis.zrange("sset1", 0, -1));*/
    }
}
