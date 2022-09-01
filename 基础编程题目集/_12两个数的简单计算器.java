package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六17:35
 *
 * @author abc
 * <p>
 * 本题要求编写一个简单计算器程序，可根据输入的运算符，对2个整数进行加、减、乘、除或求余运算。
 * 题目保证输入和输出均不超过整型范围。
 * <p>
 * 输入格式：
 * 输入在一行中依次输入操作数1、运算符、操作数2，其间以1个空格分隔。
 * 操作数的数据类型为整型，且保证除法和求余的分母非零。
 * <p>
 * 输出格式：
 * 当运算符为+、-、*、/、%时，在一行输出相应的运算结果。
 * 若输入是非法符号（即除了加、减、乘、除和求余五种运算符以外的其他符号）则输出ERROR。
 */
public class _12两个数的简单计算器 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        char str = scanner.next().charAt(0);
        int i2 = scanner.nextInt();
        switch (str) {
            case '+':
                System.out.println(i1 + i2);
                break;
            case '-':
                System.out.println(i1 - i2);
                break;
            case '*':
                System.out.println(i1 * i2);
                break;
            case '/':
                System.out.println(i1 / i2);
                break;
            case '%':
                System.out.println(i1 % i2);
                break;
            default:
                System.out.println("ERROR");
        }


    }
}
