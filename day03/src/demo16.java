import java.util.Scanner;

public class demo16 {
    public static void main(String[] args) {
       /* int i = 0;
        while (i < 10) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入字符串：");
            String str = sc.nextLine();
            System.out.println(str);
            i++;

        }*/
        int i = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.printf("第%s次输入",i);
            String str = sc.nextLine();
            System.out.println(str);
            i++;
        }

        while (i < 5);
    }
}
