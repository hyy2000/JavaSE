public class demo17 {
    public static void main(String[] args) {
        int a = 20;
        int b = 3000000;
        int c = 30;
        if (a > b) {
            if (a>c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }

        } else {
            if (b>c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}
