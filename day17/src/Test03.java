import java.util.HashMap;
import java.util.Map;

public class Test03 {

    /*
        3、元素查询的操作
        - V get(Object key)
        - boolean containsKey(Object key)
        - boolean containsValue(Object value)
        - boolean isEmpty()

        4、其他方法
        - int size()
     */
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");
        map.put(4,"dd");
        map.put(5,"ee");
        map.put(9,"ee");
        System.out.println(map);

        for (Integer integer : map.keySet()) {
            System.out.println(integer+map.get(integer));
        }

    }
}
