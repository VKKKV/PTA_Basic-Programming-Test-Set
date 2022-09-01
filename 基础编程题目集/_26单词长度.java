package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/30星期二16:55
 *
 * @author abc
 * <p>
 * 你的程序要读入一行文本，其中以空格分隔为若干个单词，以.结束。你要输出每个单词的长度。
 * 这里的单词与语言无关，可以包括各种符号，比如it's算一个单词，长度为4。
 * 注意，行中可能出现连续的空格；最后的.不计算在内。
 * <p>
 * 输入格式：
 * 输入在一行中给出一行文本，以.结束
 * <p>
 * 提示：用scanf("%c",...);来读入一个字符，直到读到.为止。
 * <p>
 * 输出格式：
 * 在一行中输出这行文本对应的单词的长度，每个长度之间以空格隔开，行末没有最后的空格。
 */
public class _26单词长度 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().trim().replaceAll("\\.","").replaceAll(" +", " ").split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() != 0) {//排除空句子情况
                System.out.print(str[i].length());

                if (i != str.length - 1) {//排除行末空格
                    System.out.print(" ");
                }
            }
        }
    }
}
