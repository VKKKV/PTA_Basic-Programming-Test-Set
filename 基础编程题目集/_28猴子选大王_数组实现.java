package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/30星期二18:03
 *
 * @author abc
 * <p>
 * 一群猴子要选新猴王。新猴王的选择方法是：让N只候选猴子围成一圈，从某位置起顺序编号为1~N号。
 * 从第1号开始报数，每轮从1报到3，凡报到3的猴子即退出圈子，接着又从紧邻的下一只猴子开始同样的报数。
 * 如此不断循环，最后剩下的一只猴子就选为猴王。请问是原来第几号猴子当选猴王？
 * <p>
 * 输入格式：
 * 输入在一行中给一个正整数N（≤1000）。
 * <p>
 * 输出格式：
 * 在一行中输出当选猴王的编号。
 *
 * 使用数组
 *
 */
public class _28猴子选大王_数组实现 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        int sum = n;
        int count = 0;
        int i = -1;
        do {
            count++;
            i++;
            if (i > n - 1) {
                i = 0;
            }
            if (ints[i] == 1) {
                count--;
            }
            if (count == 3) {

                ints[i] = 1;
                count = 0;
                sum--;
                if (sum==0){
                    System.out.println(i+1);
                }
            }
        } while (sum != 0);
    }
}
