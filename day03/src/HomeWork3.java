import java.util.Scanner;

//从键盘输入订单总价格totalPrice（总价格必须>=0），根据优惠政策计算打折后的总价格。
//编写步骤：
//1. 判断当`totalPrice >=500` ,discount赋值为0.8
//2. 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.85
//3. 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.9
//4. 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.95
//5. 判断当`totalPrice >=0` 且`<200`时,不打折，即discount赋值为1
//6. 判断当`totalPrice<0`时，显示输入有误
//7. 输出结果
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int totalPrice = sc.nextInt();
        double totalPrice = sc.nextDouble();
        if (totalPrice >= 500){
           double sum = 0.8 * totalPrice;
            System.out.println(sum);
        } else if (totalPrice >= 400) {
            System.out.println(0.85*totalPrice);

        } else if (totalPrice>=300){
            System.out.println(0.9*totalPrice);
        } else if (totalPrice>=200){
            System.out.println(0.95*totalPrice);
        } else if (totalPrice>=0){
            System.out.println(totalPrice);
        } else {
            System.out.println("输入错误");
        }

    }

}
