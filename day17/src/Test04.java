import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("许仙", "白娘子");
        map.put("董永", "七仙女");
        map.put("牛郎", "织女");
        map.put("法海", "小青");

        System.out.println("所有的key:");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        System.out.println("所有的value：");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("所有的映射关系");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry : entrySet) {
//			System.out.println(entry);
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}