package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六17:04
 *
 * @author abc
 */
public class _8超速判断 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        System.out.println("Speed: "+speed+" - "+(speed > 60 ? "Speeding" : "OK"));
    }
}
