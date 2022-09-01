package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三12:23
 *
 * @author abc
 * <p>
 * 我们已经知道了将N个整数按从小到大排序的冒泡排序法。
 * 本题要求将此方法用于字符串序列，并对任意给定的K（<N），输出扫描完第K遍后的中间结果序列。
 * <p>
 * 输入格式：
 * 输入在第1行中给出N和K（1≤K<N≤100），此后N行，每行包含一个长度不超过10的、仅由小写英文字母组成的非空字符串。
 * <p>
 * 输出格式：
 * 输出冒泡排序法扫描完第K遍后的中间结果序列，每行包含一个字符串。
 */
public class _30字符串的冒泡排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[scanner.nextInt()];
        int k = scanner.nextInt();
        String temp;
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    temp = str[j + 1];
                    str[j + 1] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
