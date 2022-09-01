package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三13:33
 *
 * @author abc
 * <p>
 * 输入一个字符串和一个非负整数N，要求将字符串循环左移N次。
 * <p>
 * 输入格式：
 * 输入在第1行中给出一个不超过100个字符长度的、以回车结束的非空字符串；第2行给出非负整数N。
 * <p>
 * 输出格式：
 * 在一行中输出循环左移N次后的字符串。
 */
public class _31字符串循环左移 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str4=str1+str1+str1+str1+str1+str1;//暴力解法 XD
        str4+=str4.substring(0,scanner.nextInt());
        System.out.println(str4.substring(str4.length()-str1.length()));
    }
}
