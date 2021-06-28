package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adult adult = new Adult();
        Kid kid = new Kid();
        Elder elder = new Elder();
        Ticket ticket = new Ticket();

            System.out.println("歡迎光臨本售票機，進入新竹市親山步道前必須購買入場券");
            System.out.println("請問您要購買入場券還是閱讀親山步道資訊?");
            System.out.println("按a開啟步道資訊再開始購票;按b直接開始購票");
            String s = sc.next();
            if (s.equals("a")) {
                ticket.rule();

            } else if (s.equals("b")) {
            }
            System.out.println("購票規則:");
            System.out.println("身高150cm以下算小孩");
            System.out.println("老人票必須超過65歲");
            System.out.println("團體打九折活動須單次購買加總超過10張(不限票型)");
            System.out.println("請問您要幾張大人票(" + adult.cost + "元/張)?");
            int a = sc.nextInt();
            System.out.println("請問您要幾張孩童票(" + kid.cost + "元/張)");
            int k = sc.nextInt();
            System.out.println("請問您要幾張敬老票(" + elder.cost + "元/張)");
            int e = sc.nextInt();
            int total = a * adult.cost + k * kid.cost + e * elder.cost;
            float all = 0;
            if (a + k + e >= 10) {
                all = ((float) total * 0.9f + 1);
                total = (int) all;
                System.out.println("總金額為" + total);
            } else {
                System.out.println("總金額為" + total);
            }

            Money money = new Money();
            money.money();
            int sum = money.coin - total;

            System.out.println("找您一共 " + sum + "元");
            int hundred = sum / 100;
            int h = sum % 100;
            int fiveTen = h / 50;
            int ft = h % 50;
            int ten = ft / 10;
            int t = ft % 10;
            int five = t / 5;
            int f = t % 5;
            int one = f / 1;
            System.out.println(hundred + "張100元, " + fiveTen + "枚50元, "
                    + ten + "枚10元, " + five + "枚5元, " + one + "枚1元");
            System.out.println("謝謝購買");
        }

}
