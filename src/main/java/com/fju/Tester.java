package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adult adult = new Adult();
        Kid kid = new Kid();
        Elder elder =new Elder();

        System.out.println("購票規則:");
        System.out.println("身高150cm以下算小孩");
        System.out.println("老人票必須超過65歲");
        System.out.println("團體打九折活動須單次購買加總超過10張(不限票型)");
        System.out.println("請問您要幾張大人票?");
        int a = sc.nextInt();
        System.out.println("請問您要幾張孩童票?");
        int k = sc.nextInt();
        System.out.println("請問您要幾張敬老票?");
        int e = sc.nextInt();
        int total = a*adult.cost+k*kid.cost+e*elder.cost;
        float all =0;
        if(a+k+e>=10){
            all =((float) total*0.9f+1);
            total=(int)all;
            System.out.println("總金額為" + total);
        }else{
            System.out.println("總金額為" + total);
        }
        System.out.println("請投入紙鈔或硬幣1(1,5,10,50,100)");
        Money money = new Money();
        money.money();
        int sum = money.coin-total;
        System.out.println("找您 " + sum );
    }
}
