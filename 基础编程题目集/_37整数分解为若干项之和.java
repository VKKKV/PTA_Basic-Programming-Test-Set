package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/9/1星期四22:22
 *
 * @author abc
 * <p>
 * 7=1+1+1+1+1+1+1;7=1+1+1+1+1+2;7=1+1+1+1+3;7=1+1+1+2+2
 * 7=1+1+1+4;7=1+1+2+3;7=1+1+5;7=1+2+2+2
 * 7=1+2+4;7=1+3+3;7=1+6;7=2+2+3
 * 7=2+5;7=3+4;7=7
 */
public class _37整数分解为若干项之和 {
    // Define global variable
    static int sum = 0;  // The sum of number
    static int pos = -1;  // Point
    static int N = 0;  // Initialize N as 0
    static int count = 0;  // Get solution number
    static int[] result = new int[30];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        DFS(1);
    }

    private static void DFS(int x) {
        if(sum>N) {
            return;
        }
        if(sum==N) {
            count++;
            System.out.print(N+"=");
            for(int i=0;i<pos;i++) {
                System.out.print(result[i]+"+");
            }
            if(count%4==0||result[pos]==N) {
                System.out.println(result[pos]);
            } else {
                System.out.print(result[pos]+";");
            }
        }

        for(int i=x;i<N+1;i++) {
            if(sum<N) {
                result[++pos] = i;
                sum = sum + i;
                DFS(i);
                sum = sum - i;
                pos--;
            }
        }
    }
}
