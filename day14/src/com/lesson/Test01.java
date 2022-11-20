package com.lesson;

public class Test01 {
    /*`java.lang.Math` 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
    类似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。

    public static double abs(double a) ` ：返回 double 值的绝对值。
    public static double ceil(double a)` ：返回大于等于参数的最小的整数。(天花板,向上取整)
    public static double floor(double a) ` ：返回小于等于参数最大的整数。(地板,向下取整)
    public static long round(double a)` ：返回最接近参数的 long。(类似于四舍五入方法)
    public static double pow(double a,double b)：返回a的b幂次方
    public static double sqrt(double a)：返回a的平方根(开平方)
    public static double random()：返回[0,1)的随机值
    public static final double PI：返回圆周率
    public static double max(double x, double y)：返回x,y中的最大值
    public static double min(double x, double y)：返回x,y中的最小值*/
    public static void main(String[] args) {

       /* System.out.println(Math.abs(9));
        System.out.println(Math.abs(-9));
        System.out.println(Math.abs(-8.9));*/

        System.out.println(Math.ceil(8.9));
        System.out.println(Math.ceil(-6.1));


    }
}
