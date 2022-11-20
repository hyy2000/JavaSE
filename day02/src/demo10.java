class demo10 {

	public static void main(String[] args) {

		int i = 100;
		
		while (i <= 999) {
			int b = i/100;
			int s = i/10%10;
			int g = i%10;

			if (i == b*b*b + s*s*s + g*g*g) {
				System.out.println(i);
				
		}
		i++;

					}
	}
}
