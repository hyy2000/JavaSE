package com.lesson.review2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Test02 {
    /*不可变的、任意精度的有符号十进制数。
由于在运算的时候，float类型和double很容易丢失精度。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal

构造方法
	- public BigDecimal(String val)
成员方法
	- BigDecimal(String val)
	- BigDecimal add(BigDecimal val)
	- BigDecimal subtract(BigDecimal val)
	- BigDecimal multiply(BigDecimal val)
	- BigDecimal divide(BigDecimal val)
	- BigDecimal divide(BigDecimal divisor, int roundingMode)
	- BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	- BigDecimal remainder(BigDecimal val)
	- ....*/

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("9.43545358688683535");
        BigDecimal bigDecimal1 = new BigDecimal("3.134783979847297492874");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.remainder(bigDecimal1));
        //System.out.println(bigDecimal.divide(bigDecimal1));


        //System.out.println(bigDecimal.divide(bigDecimal1));
        /*java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        *  非终止小数扩展；没有精确可表示的十进制结果(除不尽)*/
        System.out.println(bigDecimal.divide(bigDecimal1, 3, RoundingMode.CEILING));

        System.out.println(bigDecimal.divide(bigDecimal1, 3, RoundingMode.FLOOR));

        System.out.println(bigDecimal.divide(bigDecimal1,3,RoundingMode.DOWN));
        /*
            CEILING ：向正无限大方向舍入的舍入模式。

            DOWN ：向零方向舍入的舍入模式。

            FLOOR：向负无限大方向舍入的舍入模式。

            HALF_DOWN ：向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向下舍入。

            HALF_EVEN：向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向相邻的偶数舍入。

            HALF_UP：向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向上舍入。

            UNNECESSARY：用于断言请求的操作具有精确结果的舍入模式，因此不需要舍入。

            UP：远离零方向舍入的舍入模式。 */

    }
}

