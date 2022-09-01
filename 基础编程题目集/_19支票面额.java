package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/29星期一10:11
 *
 * @author abc
 * <p>
 * 一个采购员去银行兑换一张y元f分的支票，结果出纳员错给了f元y分。
 * 采购员用去了n分之后才发觉有错，于是清点了余额尚有2y元2f分，问该支票面额是多少？
 * <p>
 * 输入格式：
 * 输入在一行中给出小于100的正整数n。
 * <p>
 * 输出格式：
 * 在一行中按格式y.f输出该支票的原始面额。如果无解，则输出No Solution。
 */
public class _19支票面额 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y, f;
        boolean yes = true;
        for (y = 0; y <= 100; y++) {
            for (f = 0; f <= 100; f++) {
                if ((200 * y + 2 * f) == (100 * f + y - n)) {
                    System.out.println(y + "." + f);
                    yes = false;
                }
            }
        }
        if (yes)
            System.out.println("No Solution");
    }
}
