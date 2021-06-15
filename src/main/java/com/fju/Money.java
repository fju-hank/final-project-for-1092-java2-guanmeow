package com.fju;

import java.util.Scanner;

public class Money {
    public void money(){
        int coin = 0;
        int c= -1;
        while ( c != 0) {
            Scanner scan = new Scanner(System.in);
            c = scan.nextInt();
            coin = coin + c;
            System.out.println("Total :" + coin);
        }
    }
}
