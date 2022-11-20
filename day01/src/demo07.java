class demo07 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int temp;
		int max;

		temp = (a > b) ? a : b;
		max = (temp > c) ? temp : c;

		System.out.println(max);
	}
}
