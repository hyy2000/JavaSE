import java.util.Scanner;

public class HomeWork1 {
    //从键盘输入一个整数，判断它是否是5的倍数
    public static void main(String[] args) {

        for (;;){
            System.out.print("请输入一个整数： ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num % 5 == 0 && num !=0) {//不为零的整数
                System.out.println("是5的倍数");

            } else {
                System.out.println("不是5的倍数");
            }

        }


    }
}
