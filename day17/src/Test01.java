import java.util.Comparator;
import java.util.TreeSet;

public class Test01 {
    /*请使用TreeSet编写程序,将字符串"helloatguigu"进行排序,顺序为: aegghillotuu*/
    public static void main(String[] args) {
        TreeSet<Character> ts =  new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int n = o1- o2;
                return (n ==0)?1:n;
            }
        });


        String s = "helloatguigu";
        char[] chars = s.toCharArray();

        for (Character t : chars) {
            ts.add(t);
        }

        System.out.println(ts);


    }
}
