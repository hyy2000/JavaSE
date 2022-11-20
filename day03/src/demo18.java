import java.util.Scanner;

public class demo18 {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = 'C';
        char ch4 = 'D';

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入字符：");

            Scanner sc = new Scanner(System.in);
            char ach = sc.next().charAt(0);
            switch (ach){
                case 'A':
                    System.out.println("a");
                    break;
                case 'B':
                    System.out.println("b");
                    break;
                case 'C':
                    System.out.println("c");
                    break;
                case 'D':
                    System.out.println("d");
                    break;
                default:
                    System.out.println("重新输入");
                    break;
            }

        }



    }
}
