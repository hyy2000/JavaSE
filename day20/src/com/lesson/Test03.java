package com.lesson;
/*
        生产者与消费者问题
        案例：餐馆有个取餐口工作台(Workbench)供厨师放餐和服务员取餐,比较小，
        厨师做完快餐放在取餐口的工作台上，服务员从这个工作台取出快餐给顾客。
        其中送餐和取餐的执行顺序必须为:厨师生产一份快餐后,服务员取一份快餐
        分析:
            需要一个指挥者 flag  1为厨师放餐, 2为服务员取餐
            当flag为1时,
                厨师放餐 (服务员等待),放餐完毕后flat = 2,并且 呼喊服务员取餐
            当flag为2时,
                服务员取餐 (厨师等待),取餐完毕后flat = 1,并且 呼喊厨师放餐
             ...
     */

public class Test03 {

}

class workbench {
//     需要一个指挥者 flag  1为厨师放餐, 2为服务员取餐
    int flag = 1;



}
class cook extends Thread{
    @Override
    public void run() {

    }
}
class waiter extends Thread{
    @Override
    public void run() {
        super.run();
    }
}