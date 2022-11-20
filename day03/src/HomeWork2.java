import java.util.Scanner;

public class HomeWork2 {
//    从键盘输入一个字符，判断它是字母还是数字，还是其他字符
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);//charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1
    if(ch >= '0'&& ch <= '9' ){
        System.out.println(ch + "是数字");

    }else if (ch >= 'A'&& ch <= 'Z' || ch >= 'a'&& ch<='z'){
        System.out.println(ch + "是字母");

    }else {
        System.out.println(ch + "是其他字符");
    }

}
}
