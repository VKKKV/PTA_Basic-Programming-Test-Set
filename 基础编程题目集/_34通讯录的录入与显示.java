package com.pta.基础编程题目集;

import java.util.Scanner;

/**
 * Created on 2022/8/31星期三16:45
 *
 * @author abc
 * <p>
 * <p>
 * <p>
 * 输入在第一行给出正整数N（≤10）；随后N行，每行按照格式姓名 生日 性别 固话 手机给出一条记录。
 * 其中姓名是不超过10个字符、不包含空格的非空字符串；生日按yyyy/mm/dd的格式给出年月日；
 * 性别用M表示“男”、F表示“女”；固话和手机均为不超过15位的连续数字，前面有可能出现+。
 * <p>
 * 在通讯录记录输入完成后，最后一行给出正整数K，并且随后给出K个整数，表示要查询的记录编号（从0到N−1顺序编号）。数字间以空格分隔。
 * <p>
 * 输出格式：
 * 对每一条要查询的记录编号，在一行中按照姓名 固话 手机 性别 生日的格式输出该记录。若要查询的记录不存在，则输出Not Found。
 * <p>
 * 3
 * Chris 1984/03/10 F +86181779452 13707010007
 * LaoLao 1967/11/30 F 057187951100 +8618618623333
 * QiaoLin 1980/01/01 M 84172333 10086
 * 2 1 7
 */

public class _34通讯录的录入与显示 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        info[] list = new info[Integer.parseInt(scanner.nextLine())];

        for (int i = 0; i < list.length; i++) {
            String[] strings = scanner.nextLine().split(" ");
            list[i] = new info(strings[0], strings[1], strings[2], strings[3], strings[4]);
        }
        String[] strings = scanner.nextLine().split(" ");
        int k = Integer.parseInt(strings[0]);

        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i] = Integer.parseInt(strings[i + 1]);
        }


        int temp;
        for (int anInt : ints) {
            temp = anInt;
            if (temp < list.length && temp >= 0) {
                System.out.println(list[temp]);
            } else System.out.println("Not Found");

        }
    }
}
//LaoLao 1967/11/30 F 057187951100 +8618618623333

class info {
    private String name;
    private String birth;
    private String sex;
    private String fixPhone;
    private String phone;

    public info(String name, String birth, String sex, String fixPhone, String phone) {
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.fixPhone = fixPhone;
        this.phone = phone;
    }

    //LaoLao 057187951100 +8618618623333 F 1967/11/30
    @Override
    public String toString() {
        return name + ' ' + fixPhone + ' ' + phone + ' ' + sex + " " + birth;
    }
}