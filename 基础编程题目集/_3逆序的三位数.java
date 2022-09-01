package com.pta.基础编程题目集;

import java.util.Scanner;
public class _3逆序的三位数 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuffer str = new StringBuffer(scanner.next());
        str.reverse();
        while (str.charAt(0)=='0'){
            str.delete(0,1);
        }

        System.out.println(str);

    }
}