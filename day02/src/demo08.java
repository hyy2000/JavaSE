class demo08 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 100;i <= 999 ; i++) {
			int b = i/100;
			int s = (i/10)%10;
			int g = i%10;
			if (i ==b*b*b + s*s*s + g*g*g) {
				count++;
				System.out.println(i);

			}
		}
		System.out.println("水仙花数个数："+count);
	}


}
