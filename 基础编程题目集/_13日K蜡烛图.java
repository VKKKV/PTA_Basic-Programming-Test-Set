package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六17:58
 *
 * @author abc
 * <p>
 * 如果Close<Open，表示为“BW-Solid”（即“实心蓝白蜡烛”）；
 * 如果Close>Open，表示为“R-Hollow”（即“空心红蜡烛”）；
 * 如果Open等于Close，则为“R-Cross”（即“十字红蜡烛”）。
 * 如果Low比Open和Close低，称为“Lower Shadow”（即“有下影线”），
 * 如果High比Open和Close高，称为“Upper Shadow”（即“有上影线”）。
 * <p>
 * 输入格式：
 * 输入在一行中给出4个   正实数 ，分别对应Open、High、Low、Close，其间以空格分隔。
 * <p>
 * 输出格式：
 * 在一行中输出日K蜡烛的类型。如果有上、下影线，则在类型后加上with 影线类型。
 * 如果两种影线都有，则输出with Lower Shadow and Upper Shadow。
 */
public class _13日K蜡烛图 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Open = scanner.nextFloat();
        float High = scanner.nextFloat();
        float Low = scanner.nextFloat();
        float Close = scanner.nextFloat();

        String str1;
        String str2=null;

        if (Close < Open) {
            str1 = "BW-Solid";
        } else if (Close > Open) {
            str1 = "R-Hollow";
        } else {
            str1 = "R-Cross";
        }

        if (Low < Open && Low < Close && High > Open && High > Close) {
            str2 = "with Lower Shadow and Upper Shadow";
        } else if (Low < Open && Low < Close) {
            str2 = "with Lower Shadow";
        } else if (High > Open && High > Close) {
            str2 = "with Upper Shadow";
        }
        if (str2!=null) {
            System.out.println(str1 + " " + str2);
        }else
            System.out.println(str1);
    }
}
