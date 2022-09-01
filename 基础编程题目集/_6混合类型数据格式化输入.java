package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六16:47
 *
 * @author abc
 */
public class _6混合类型数据格式化输入 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f1 = scanner.nextFloat();
        int i = scanner.nextInt();
        String c = scanner.next();
        float f2 = scanner.nextFloat();

        System.out.print(c);
        System.out.print(" ");
        System.out.print(i);
        System.out.print(" ");
        System.out.printf("%.2f",f1);
        System.out.print(" ");
        System.out.printf("%.2f",f2);


    }


}
