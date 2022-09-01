package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六20:00
 *
 * @author abc
 * <p>
 * 给定两个整数A和B，输出从A到B的所有整数以及这些数的和。
 * <p>
 * 输入格式：
 * 输入在一行中给出2个整数A和B，其中−100≤A≤B≤100，其间以空格分隔。
 * <p>
 * 输出格式：
 * 首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。最后在一行中按Sum = X的格式输出全部数字的和
 */
public class _14求整数段和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        int sum = 0;
        String str;
        for (int i = a; i <= b; i++) {
            sum += i;
            str = "    " + i;
            System.out.print(str.substring(str.length() - 5));
            //注意输出满五个数就结束的情况
            if (++count == 5 && b!=i) {
                count = 0;
                System.out.println();
            }
        }

            System.out.println("\nSum = " + sum);
    }
}
