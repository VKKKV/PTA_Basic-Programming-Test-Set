package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六20:41
 *
 * @author abc
 */
public class _15计算圆周率 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        float pi = 0;
        float temp = 0;
        int n = 0;

        while (true) {
            temp = oop(n) / oop2(n);
            if (temp < f) {
                pi += temp;
                break;
            }

            pi += temp;
            n++;
        }

        System.out.printf("%.6f",pi * 2);
    }

    private static float oop2(int i) {
        if (i == 0) {
            return 1;
        }
        float sum = 1;
        int a = 2 * i + 1;
        for (int j = 3; j <= a; j += 2) {
            sum *= j;
        }
        return sum;

    }

    private static float oop(int i) {
        if (i == 0) {
            return 1;
        }
        float sum = 1;
        for (int j = 1; j <= i; j++) {
            sum *= j;
        }
        return sum;
    }
}










