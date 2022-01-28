package com.bridge.logicalprogrammimg;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number= sc.nextInt();
        int out=0;
        while(number>0){
            int tmp=number%10;
            out=out*10+tmp;
            number/=10;
        }
        System.out.println("The reverse number is : "+out);
    }
}
