/*
隐式转换(自动转换):
	取值小--->取值大
	1> byte short char 运算时会自动提升为int
	1> 取值范围小和取值范围大的一起运算时,小--->大

显式转换(强制转换)
	取值大--->取值小
	格式:
	目标类型 变量名 = (目标类型)(需要转换的值);
*/
class  demo02{

	public static void main(String[] args) {

		byte b = 88;
		int i = 99;

		//i = b + 2;
		b = (byte)(i + 2);

		short s = 66;
		long l = s + 3;
		System.out.println(l);

		double d = 4;
		
		System.out.println(d);


	}
}
