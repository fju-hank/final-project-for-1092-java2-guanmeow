package com.fju;

public class Tester {
    public static void main(String[] args) {
        System.out.println("購票規則:");
        System.out.println("身高150cm以下算小孩");
        System.out.println("老人票逼須超過65歲");
        System.out.println("團體票須單次購買加總超過10張(不限票型)");
        System.out.println("Hello,please insert the money(1,5,10,50,100)");
        Money money = new Money();
        money.money();
    }
}
