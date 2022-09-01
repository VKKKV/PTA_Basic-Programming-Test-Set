package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/30星期二16:43
 *
 * @author abc
 * <p>
 * 0: ling
 * 1: yi
 * 2: er
 * 3: san
 * 4: si
 * 5: wu
 * 6: liu
 * 7: qi
 * 8: ba
 * 9: jiu
 * <p>
 * 输入格式：
 * 输入在一行中给出一个整数，如：1234。
 * <p>
 * 提示：整数包括负数、零和正数。
 * <p>
 * 输出格式：
 * 在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如
 * yi er san si。
 */
public class _25念数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] str = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String temp = "" + num;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '-') {
                System.out.print("fu");
            } else
                System.out.print(str[Integer.parseInt(String.valueOf(temp.charAt(i)))]);
            if (i != temp.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
