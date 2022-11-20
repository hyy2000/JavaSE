import java.util.Scanner;
class demo03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("请输入成绩：");
		if (score >=90 && score <= 100) {
			System.out.println("优");
		}else if (score >= 70 && score <90) {
			System.out.println("良");
		}else if (score >= 60 && score < 70) {
			System.out.println("及格");
		}else if (score >= 0 && score <60) {
			System.out.println("不及格");
		}else {
			System.out.println("非法数据");
		}
		sc.close();

		//System.out.println();
	}
}
