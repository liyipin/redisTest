import redis.clients.jedis.Jedis;

import java.util.List;

public class listTest {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.198.21", 7001);

        /*//增加  查询
        jedis.lpush("list1", "hadoop", "is", "good");
        List<String> list = jedis.lrange("list1", 0, -1);
        for (String string : list) {
            System.out.println(string);
        }*/

        //修改
       /* jedis.lset("list1",0,"hive");
        List<String> list1 = jedis.lrange("list1", 0, -1);
        for (String string : list1) {
            System.out.println(string);
        }*/

        //删除
        /*jedis.lrem("list1", 0, "hive");
        List<String> list2 = jedis.lrange("list1", 0, -1);
        for (String string : list2) {
            System.out.println(string);
        }*/


    }

}

