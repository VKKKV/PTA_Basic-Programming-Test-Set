package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三19:17
 *
 * @author abc
 * <p>
 * 本题要求编写程序，计算N个有理数的平均值。
 * <p>
 * 输入格式：
 * 输入第一行给出正整数N（≤100）；第二行中按照a1/b1 a2/b2 …的格式给出N个分数形式的有理数，
 * 其中分子和分母全是整形范围内的整数；如果是负数，则负号一定出现在最前面。
 * <p>
 * 4
 * 1/2 1/6 3/6 -5/10
 * <p>
 * 输出格式：
 * 在一行中按照a/b的格式输出N个有理数的平均值。注意必须是该有理数的最简分数形式，若分母为1，则只输出分子。
 * 1/6
 */
public class _35有理数均值 {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());

        String str1 = scanner.nextLine();
        int[] ints = new int[n * 2];
        int i, j, count;

        for (i = 0, j = 0, count = 0; i < str1.length(); i++) {
            if (i != str1.length() - 1) {
                if (str1.charAt(i) == '/' || str1.charAt(i) == ' ') {
                    ints[count++] = Integer.parseInt(str1.substring(j, i));
                    j = i + 1;
                }
            } else {
                ints[count] = Integer.parseInt(str1.substring(j, i + 1));
            }
        }

        int[] f = sum(ints);

        if (f[1] != 1) {
            System.out.println(f[0] + "/" + f[1]);
        } else {
            System.out.println(f[0]);
        }
    }

    private static int[] huaJian(int fenZi, int fenMu) {
        int a = fenZi;
        int b = fenMu;
        int r;
        while (b != 0) {//这里化简分数使用 欧几里得法（辗转相除法）很重要
            r = a % b;
            a = b;
            b = r;
        }
        return new int[]{fenZi / a, fenMu / a};
    }


    private static int[] sum(int[] ints) {
        int[] floats = new int[2];
        floats[0] = ints[0];
        floats[1] = ints[1];
        for (int i = 2; i < ints.length - 1; i += 2) {
            floats[0] = ints[i] * floats[1] + floats[0] * ints[i + 1];
            floats[1] *= ints[i + 1];
            floats = huaJian(floats[0], floats[1]);
        }
        return huaJian(floats[0], floats[1] * n);
    }
}
