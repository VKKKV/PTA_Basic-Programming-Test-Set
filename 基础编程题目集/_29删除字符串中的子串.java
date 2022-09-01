package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三11:24
 *
 * @author abc
 *
 * 输入2个字符串S1和S2，要求删除字符串S1中出现的所有子串S2，即结果字符串中不能包含S2。
 *
 * 输入格式：
 * 输入在2行中分别给出不超过80个字符长度的、以回车结束的2个非空字符串，对应S1和S2。
 *
 * 输出格式：
 * 在一行中输出删除字符串S1中出现的所有子串S2后的结果字符串。
 *
 */
public class _29删除字符串中的子串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1= scanner.nextLine();
        String str2= scanner.nextLine();
        do{
            str1 = str1.replaceAll(str2, "");
        }while (str1.contains(str2));

        System.out.println(str1);
    }
}
