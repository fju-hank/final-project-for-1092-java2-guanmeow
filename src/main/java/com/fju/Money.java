package com.fju;

import java.util.Scanner;

public class Money<s> {
    int coin = 0;
    int c = -1;

    public void money() {
        while (c != 0) {
            Scanner scan = new Scanner(System.in);
            c = scan.nextInt();
            coin = coin + c;
            System.out.println("Total :" + coin + "  停止投入請按0");
        }
    }
}


