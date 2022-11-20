import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test02 {
    /*
    需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
测试数据:
张三,66,88,99
李四,66,88,99
王五,77,88,99
赵六,99,99,99
钱七,66,66,88*/
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1,Student s2) {
               int n = s2.getScore()- s1.getScore();
                return (n == 0)?1:n;
            }
        });
        Scanner sc = new Scanner(System.in);




       while (ts.size()<5){
           String s = sc.nextLine();
           String[] arr = s.split(",");
           Integer Chinese = Integer.valueOf(arr[1]);
           Integer math = Integer.valueOf(arr[2]);
           Integer eng = Integer.valueOf(arr[3]);
           ts.add(new Student(arr[0],Chinese,math,eng));
       }

        System.out.println(ts);


    }
}
