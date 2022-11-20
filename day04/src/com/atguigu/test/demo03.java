/*分析：
	- 九九乘法表中的每一个公式当做一个*,结构和上面的案例中直角三角形相似
	- 尝试先完成9层直角三角形的图案的输出
  	- 将*用实际公式代替
  	*
  	**
  	***

  	1 * 1 = 1
  	1 * 2 = 2   2 * 2 = 4
  	1 * 3 = 3   2 * 3 = 6 3 * 3 = 9
  	...
* */
package com.atguigu.test;

public class demo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j< i+1 ;j++) {
                System.out.print(j +"*"+ i + "=" + i*j + "\t");
                //System.out.print("\t");
            }
            System.out.println();

        }

    }
}
