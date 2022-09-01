package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六21:21
 *
 * @author abc
 * <p>
 * 给定不超过6的正整数A，考虑从A开始的连续4个数字。请输出所有由它们组成的无重复数字的3位数。
 * <p>
 * 输入格式：
 * 输入在一行中给出A。
 * <p>
 * 输出格式：
 * 输出满足条件的的3位数，要求从小到大，每行6个整数。整数间以空格分隔，但行末不能有多余空格。
 */
public class _16求符合给定条件的整数集 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int i, j, k;
        char c;
        int count = 0;
        for (i = a; i <= a + 3; i++)
            for (j = a; j <= a + 3; j++)
                for (k = a; k <= a + 3; k++) {
                    if (i != j && i != k && j != k) {
                        count++;
                        System.out.printf("%d%c", i * 100 + j * 10 + k, count % 6 == 0 ? '\n' : ' ');
                    }
                }

    }
}
