import java.util.HashMap;
import java.util.Map;

public class Test05 {
    public static void main(String[] args) {
        HashMap<Integer,String> hsmp = new HashMap<>();
        hsmp.put(1,"aa");
        hsmp.put(2,"cc");
        hsmp.put(3,"bb");
        hsmp.put(6,"aa");
        hsmp.put(1,"dd");
        hsmp.put(5,"aa");
      /*  System.out.println(hsmp.put(6, "hh"));
        System.out.println(hsmp);*/

        for (Integer i :hsmp.keySet()
             ) {
            System.out.println(i+"---"+hsmp.get(i));

        }

        System.out.println(hsmp.entrySet());


        for (Map.Entry<Integer, String> integerStringEntry : hsmp.entrySet()) {
            System.out.println(integerStringEntry);
        }

    }
}
