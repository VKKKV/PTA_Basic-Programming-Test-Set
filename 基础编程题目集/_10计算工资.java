package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六17:16
 *
 * @author abc
 * 某公司员工的工资计算方法如下：
 * 一周内工作时间不超过40小时，按正常工作时间计酬；
 * 超出40小时的工作时间部分，按正常工作时间报酬的1.5倍计酬。
 * 员工按进公司时间分为新职工和老职工，进公司不少于5年的员工为老职工，5年以下的为新职工。
 * 新职工的正常工资为30元/小时，老职工的正常工资为50元/小时。请按该计酬方式计算员工的工资。
 *
 * 输入格式：
 * 输入在一行中给出2个正整数，分别为某员工入职年数和周工作时间，其间以空格分隔。
 *
 * 输出格式：
 * 在一行输出该员工的周薪，精确到小数点后2位。
 */
public class _10计算工资 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        int time = scanner.nextInt();
        int per = years>4?50:30;
        System.out.printf("%.2f",time>40?(40*per+(time-40)*1.5*per):(time*per));
    }
}
