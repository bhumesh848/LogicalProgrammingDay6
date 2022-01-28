package com.bridge.logicalprogrammimg;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length= sc.nextInt();
        int number1=0,number2=1;
        System.out.println("Fibonacci Series : ");
        System.out.print(number1+" "+number2);
        for(int i=2;i<length;i++){
            int result = number1 + number2;
            System.out.print(" "+result);
            number1=number2;
            number2=result;
        }
    }
}
