class demo11 {
	/*
	一张A4纸厚度是1毫米,珠穆朗玛峰的高度8848米,请问:将纸对折多少次可以达到珠穆朗玛峰的高度?
	*/

	public static void main(String[] args) {

		int zh = 1;
		int sh = 8848*100*10;
		int count = 0;

		while (zh < sh) {
			//zh = zh *2;
			zh*=2;
			count++;


		}
		System.out.println("折叠 "+count+" 次");

	}
}
