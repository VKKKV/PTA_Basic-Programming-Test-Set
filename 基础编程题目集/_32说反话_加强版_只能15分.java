package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三13:42
 *
 * @author abc
 * <p>
 * 字符串由若干单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用若干个空格分开。
 *
 * Hello World   Here I Come
 *
 *
 *
 */
public class _32说反话_加强版_只能15分 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine()+" ";
        char[] chars = str1.toCharArray();
        int len = chars.length;
        StringBuffer buffer = new StringBuffer();

        for (int i = len - 1, j = len - 1, k; i >= 0; i--) {

            if (chars[i] == 32 && i - 1 > -1 && chars[i - 1] != 32) {
                j = i;//指向空格
            }
            if (chars[i] >= 65 && chars[i] <= 90) {
                k=i;
                while (k<=j){
                    buffer.append(chars[k++]);
                }
            }
        }
        if (buffer.length()-1>0) {
            System.out.println(buffer.substring(0, buffer.length() - 1));
        }
    }
}
