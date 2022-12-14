package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/27星期六22:18
 *
 * @author abc
 * <p>
 * 一条蠕虫长1寸，在一口深为N寸的井的底部。
 * 已知蠕虫每1分钟可以向上爬U寸，但必须休息1分钟才能接着往上爬。
 * 在休息的过程中，蠕虫又下滑了D寸。就这样，上爬和下滑重复进行。
 * 请问，蠕虫需要多长时间才能爬出井？
 * <p>
 * 这里要求不足1分钟按1分钟计，并且假定只要在某次上爬过程中蠕虫的头部到达了井的顶部，那么蠕虫就完成任务了。
 * 初始时，蠕虫是趴在井底的（即高度为0）。
 * <p>
 * 输入格式：
 * 输入在一行中顺序给出3个正整数N、U、D，其中D<U，N不超过100。
 * <p>
 * 输出格式：
 * 在一行中输出蠕虫爬出井的时间，以分钟为单位。
 */
public class _17爬动的蠕虫 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  //深度
        int U = scanner.nextInt();  //distancePerMinutes
        int D = scanner.nextInt();  //下滑

        int time = 0;
        while (true) {
            if ((N - U) <= 0) {
                time++;
                break;
            }
            N-=U-D;
            time+=2;
        }
        System.out.println(time);
    }
}
