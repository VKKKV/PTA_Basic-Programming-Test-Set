package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六17:29
 *
 * @author abc
 * <p>
 * 为鼓励居民节约用水，自来水公司采取按用水量阶梯式计价的办法，
 * 居民应交水费y（元）与月用水量x（吨）相关：当x不超过15吨时，y=4x/3；
 * 超过后，y=2.5x−17.5。请编写程序实现水费的计算。
 * <p>
 * 输入格式：
 * 输入在一行中给出非负实数x。
 * <p>
 * 输出格式：
 * 在一行输出应交的水费，精确到小数点后2位。
 */
public class _11分段计算居民水费 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.printf("%.2f",((x <= 15) ? (4 * x / 3.0) : (2.5 * x - 17.5)));
    }
}
