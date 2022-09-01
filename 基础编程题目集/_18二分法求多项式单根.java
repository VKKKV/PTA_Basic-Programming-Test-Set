package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六22:49
 *
 * @author abc
 * <p>
 * 检查区间长度，如果小于给定阈值，则停止，输出区间中点(a+b)/2；否则
 * 如果f(a)f(b)<0，则计算中点的值f((a+b)/2)；
 * 如果f((a+b)/2)正好为0，则(a+b)/2就是要求的根；否则
 * 如果f((a+b)/2)与f(a)同号，则说明根在区间[(a+b)/2,b]，令a=(a+b)/2，重复循环；
 * 如果f((a+b)/2)与f(b)同号，则说明根在区间[a,(a+b)/2]，令b=(a+b)/2，重复循环。
 * 本题目要求编写程序，计算给定3阶多项式f(x)=a
 * <p>
 * 在给定区间[a,b]内的根。
 *
 * from hetangx
 */
public class _18二分法求多项式单根 {

    static double a3, a2, a1, a0;

    public static void main(String[] args) {


        boolean ok = true;
        double a, b;
        Scanner scanner = new Scanner(System.in);

        a3 = scanner.nextFloat();
        a2 = scanner.nextFloat();
        a1 = scanner.nextFloat();
        a0 = scanner.nextFloat();
        a = scanner.nextFloat();
        b = scanner.nextFloat();

        while ((b - a) > 0.001) {
            if (f((a + b) / 2) == 0) {
                System.out.printf("%.2f\n", (a + b) / 2);
                ok = false;
                break;
            } else if (f((a + b) / 2) * f(a) > 0) {
                a = (a + b) / 2;
            } else {
                b = (a + b) / 2;
            }
        }
        if (ok) {
            System.out.printf("%.2f\n", (a + b) / 2);
        }


    }

    public static double f(double a) {
        return a3 * Math.pow(a, 3) + a2 * Math.pow(a, 2) + a1 * a + a0;
    }
}