package com.pta.基础编程题目集;

import java.util.Scanner;
public class _1厘米换算英尺英寸 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cm = scanner.nextInt();
        int foot,inch;
        foot= (int) (cm / 30.48);
        inch= (int) (12 * (cm / 30.48 - foot));
        System.out.println(foot+" "+inch);

    }
}
