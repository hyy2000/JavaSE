import java.util.Scanner;
class demo01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num = sc.nextInt();
		System.out.println("请输入第二个数：");
		int num1 = sc.nextInt();

		sc.close();

		//int max = num > num1 ? num : num1;
		int min = num > num1 ? num1 : num;


		System.out.println(min);
	}
}
