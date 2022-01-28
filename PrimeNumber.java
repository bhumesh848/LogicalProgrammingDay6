package com.bridge.logicalprogrammimg;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        isPrime(number);
    }

    private static void isPrime(int number) {
        int flag = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Number is Not Prime");
        }
        else
            System.out.println("Number is Prime");
    }
}
