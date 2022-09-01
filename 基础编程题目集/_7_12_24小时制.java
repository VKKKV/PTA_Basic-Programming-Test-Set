package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六16:55
 *
 * @author abc
 */
public class _7_12_24小时制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] str2 = str.split(":");
        int hours = Integer.parseInt(str2[0]);
        int minutes = Integer.parseInt(str2[1]);
        String s;

        if (hours == 24) {
            hours = 0;
            s = "AM";
        } else if (hours > 12) {
            hours -= 12;
            s = "PM";
        } else if (hours == 12) {
            s = "PM";
        }else {
            s="AM";
        }
//9:11 PM
        System.out.println(hours+":"+minutes+" "+s);


    }
}
