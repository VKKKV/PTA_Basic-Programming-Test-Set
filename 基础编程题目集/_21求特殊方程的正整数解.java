package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/29星期一12:45
 *
 * @author abc
 * <p>
 * 本题要求对任意给定的正整数N，求方程X
 * 2
 * +Y
 * 2
 * =N的全部正整数解。
 * <p>
 * 输入格式：
 * 输入在一行中给出正整数N（≤10000）。
 * <p>
 * 输出格式：
 * 输出方程全部正整数解，其中X≤Y。每组解占1行，两数字间以1空格分隔，按X的递增顺序输出。如果没有解，则输出No Solution。
 */
public class _21求特殊方程的正整数解 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int middle = (int) Math.sqrt(n);
        boolean isTrue = true;
        for (int i = 1; i <= middle; i++) {
            for (int j = i; j <=middle; j++) {
                if ((i * i + j * j) == n) {
                    System.out.println(i + " " + j);
                    isTrue = false;
                }
            }
        }
        if (isTrue)
            System.out.println("No Solution");
    }
}
