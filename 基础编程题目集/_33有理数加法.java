package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三16:31
 *
 * @author abc
 * <p>
 * 本题要求编写程序，计算两个有理数的和。
 * <p>
 * 输入格式：
 * 输入在一行中按照a1/b1 a2/b2的格式给出两个分数形式的有理数，其中分子和分母全是整形范围内的正整数。
 * <p>
 * 输出格式：
 * 在一行中按照a/b的格式输出两个有理数的和。注意必须是该有理数的最简分数形式，若分母为1，则只输出分子。
 */
public class _33有理数加法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String[] strings1 = str1.split("/");
        int a1 = Integer.parseInt(strings1[0]);
        int b1 = Integer.parseInt(strings1[1]);

        String str2 = scanner.next();
        String[] strings2 = str2.split("/");
        int a2 = Integer.parseInt(strings2[0]);
        int b2 = Integer.parseInt(strings2[1]);

        float fenZi = a1 * b2 + a2 * b1;
        float fenMu = b1 * b2;


        int max = (int) (Math.max(fenZi, fenMu) / 2 + 1);

        for (int i = 2; i <= max; i++) {
            while ((fenZi % i == 0) && (fenMu % i == 0)) {
                fenZi /= i;
                fenMu /= i;
            }
        }
        if (fenMu != 1) {
            System.out.printf("%.0f/%.0f", fenZi, fenMu);

        } else System.out.printf("%.0f", fenZi);

    }
}
