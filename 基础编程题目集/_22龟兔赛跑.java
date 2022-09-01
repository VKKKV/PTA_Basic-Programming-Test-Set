package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/29星期一13:24
 *
 * @author abc
 *
 * 在一行中输出比赛的结果：乌龟赢输出@_@，兔子赢输出^_^，平局则输出-_-；后跟1空格，再输出胜利者跑完的距离。
 *
 */
public class _22龟兔赛跑 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m1=0,m2=0;
        int rest=0;

        for (int i = 0; i < t; i++) {
            m1+=3;
            if (i%10==0&&m2>m1&&rest==0){
                rest=30;
            }
            if (rest!=0){
                rest-=1;
            }else m2+=9;
        }

        if (m1>m2){
            System.out.println("@_@ "+m1);
        } else if (m2>m1) {
            System.out.println("^_^ "+m2);

        }else{
            System.out.println("-_- "+m1);
        }


    }
}
