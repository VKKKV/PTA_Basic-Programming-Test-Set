package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六17:10
 *
 * @author abc
 */

//三个球A、B、C，大小形状相同且其中有一个球与其他球重量不同。要求找出这个不一样的球。
//
//输入格式：
//输入在一行中给出3个正整数，顺序对应球A、B、C的重量。
//
//输出格式：
//在一行中输出唯一的那个不一样的球。
public class _9用天平找小球 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println((i = scanner.nextInt())==scanner.nextInt()?"C":(i==scanner.nextInt()?"B":"A"));
    }
}
