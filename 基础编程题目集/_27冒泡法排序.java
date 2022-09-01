package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/30星期二17:40
 *
 * @author abc
 * <p>
 * 输入格式：
 * 输入在第1行中给出N和K（1≤K<N≤100），在第2行中给出N个待排序的整数，数字间以空格分隔。
 * <p>
 * 输出格式：
 * 在一行中输出冒泡排序法扫描完第K遍后的中间结果数列，数字间以空格分隔，但末尾不得有多余空格。
 */
public class _27冒泡法排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[scanner.nextInt()];
        int k = scanner.nextInt();
        int temp;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < ints.length - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != ints.length - 1) {
                System.out.print(" ");
            }

        }
    }
}
