package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/9/1星期四20:39
 *
 * @author ayc
 * <p>
 * 本题要求编写程序，计算2个复数的和、差、积、商。
 * <p>
 * 输入格式：
 * 输入在一行中按照a1 b1 a2 b2的格式给出2个复数C1=a1+b1i和C2=a2+b2i的实部和虚部。题目保证C2不为0。
 * <p>
 * 输出格式：
 * 分别在4行中按照(a1+b1i) 运算符 (a2+b2i) = 结果的格式顺序输出
 * 2个复数的和、差、积、商，数字精确到小数点后1位。如果结果的实部或者虚部为0，则不输出。
 * 如果结果为0，则输出0.0。
 * <p>
 * 2 3.08 -2.04 5.06
 * (2.0+3.1i) + (-2.0+5.1i) = 8.1i
 * (2.0+3.1i) - (-2.0+5.1i) = 4.0-2.0i
 * (2.0+3.1i) * (-2.0+5.1i) = -19.7+3.8i
 * (2.0+3.1i) / (-2.0+5.1i) = 0.4-0.6i
 * <p>
 * from     https://blog.51cto.com/u_15296180/3012906
 */
public class _36复数四则运算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        //加法
        printSame(a1, b1, a2, b2, '+');
        printResult(myRound(a1 + a2), myRound(b1 + b2));

        //减法
        printSame(a1, b1, a2, b2, '-');
        printResult(myRound(a1 - a2), myRound(b1 - b2));

        //乘法
        printSame(a1, b1, a2, b2, '*');
        printResult(myRound(a1 * a2 - b1 * b2), myRound(a1 * b2 + a2 * b1));

        //除法
        printSame(a1, b1, a2, b2, '/');
        printResult(myRound((a1 * a2 + b1 * b2) / (a2 * a2 + b2 * b2)), myRound((a2 * b1 - a1 * b2) / (a2 * a2 + b2 * b2)));
    }
    //打印相同的部分
    static void printSame(double a1, double b1, double a2, double b2, char c) {
        if (b1 < 0 && b2 < 0) {
            System.out.printf("(%.1f%.1fi) %c (%.1f%.1fi) = ",a1, b1, c, a2, b2);
        } else if (b1 < 0) {
            System.out.printf("(%.1f%.1fi) %c (%.1f+%.1fi) = ",a1, b1, c, a2, b2);
        } else if (b2 < 0) {
            System.out.printf("(%.1f+%.1fi) %c (%.1f%.1fi) = ",a1, b1, c, a2, b2);
        } else {
            System.out.printf("(%.1f+%.1fi) %c (%.1f+%.1fi) = ",a1, b1, c, a2, b2);
        }
    }
    //打印结果
    static void printResult(double a3, double b3) {
        if (a3 == 0 && b3 == 0) {
            System.out.print(0.0 + "\n");
        } else if (a3 == 0) {
            System.out.printf("%.1fi\n", b3);
        } else if (b3 == 0) {
            System.out.printf("%.1f\n", a3);
        } else if (b3 < 0) {
            System.out.printf("%.1f%.1fi\n", a3, b3);
        } else {
            System.out.printf("%.1f+%.1fi\n", a3, b3);
        }
    }
    //定义数字的四舍五入,考虑到.1f对第二位数字是四舍五入，有些数字舍之后会变成0被输出，不合要求，需要先进行判断，再进行输出
    //不能用自带的round是因为其自动舍入到整数，而其他的函数会返回string类型
    static double myRound(double num) {

        return Math.round(num*10)/10.0;
    }
}
