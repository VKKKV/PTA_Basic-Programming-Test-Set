package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/29星期一11:23
 *
 * @author abc
 * <p>
 * 1*1=1
 * 1*2=2   2*2=4
 * 1*3=3   2*3=6   3*3=9
 */
public class _20打印九九口诀表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                str = i * j + "    ";
                System.out.print(j + "*" + i + "=" + str.substring(0, 4));
            }
            System.out.println();
        }

    }
}
