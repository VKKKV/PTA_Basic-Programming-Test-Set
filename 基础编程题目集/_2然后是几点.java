package com.pta.基础编程题目集;

import java.util.Scanner;
public class _2然后是几点 {
    public static void main(String[] args) {
        //
        //读不满4位，进位分钟正好是0
        Scanner scanner = new Scanner(System.in);
        int init = scanner.nextInt();
        int time = scanner.nextInt();

        int initMinutes = init / 100*60+init % 100;

        int res = initMinutes+time;

        int resHour = res /60;
        int resMinutes = res % 60;

        System.out.println(resHour+""+(resMinutes==0?"00":resMinutes));

    }
}