package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/29星期一13:57
 *
 * @author abc
 * <p>
 * 输入一个整数（位数不超过9位）代表一个人民币值（单位为元），请转换成财务要求的大写中文格式。
 * 如23108元，转换后变成“贰万叁仟壹百零捌”元。
 * 为了简化输出，用小写英文字母a-j顺序代表大写数字0-9，用S、B、Q、W、Y分别代表拾、百、仟、万、亿。
 * 于是23108元应被转换输出为“cWdQbBai”元。
 * <p>
 * 输入格式：
 * 输入在一行中给出一个不超过9位的非负整数。
 * <p>
 * 输出格式：
 * 在一行中输出转换后的结果。注意“零”的用法必须符合中文习惯。
 *
 * change to java
 *  source code from hello!world!
 *  https://blog.csdn.net/gwgw0621?type=blog
 */
public class _23币值转换_unsolved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        char[] number = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] word = {'S', 'B', 'Q', 'W', 'S', 'B', 'Q', 'Y'};
        
        int digit = -1;
        int temp = n;
         
        while (temp != 0) {
            temp /= 10;
            digit++;  // 获取位数
        }
        
        int j = (int) Math.pow(10, digit);
        int num;
        int conZero = 0;  // 记录0是否连续
        
        if (n == 0) {  // 考虑0的情况
            System.out.print("a");
        }
        
        while (n != 0) {
            num = n / j;//get one number

            if (num != 0) {
                System.out.printf("%s%s", number[num], word[digit - 1]);//word数组需要减
                conZero = 0;
            } else {
                if (conZero != 1) {  // 不连续时
                    if (digit == 3) {  // 处于万位时只输出万
                        System.out.print("W");
                    } else {
                        System.out.print("a");  // 正常情况输出0即可
                        conZero = 1;
                    }
                }
            }


            n = n % j;
            j /= 10;
            digit--;
            if (j == 1) {
                if (n == 0) {
                    break;
                }
                System.out.printf("%s", number[n]);
                break;
            }
        }
        
    }
}
