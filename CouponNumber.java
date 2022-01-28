package com.bridge.logicalprogrammimg;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Max range : ");
        int max = sc.nextInt();
        System.out.print("Enter the how may Distinct Number you want : ");
        int number = sc.nextInt();
        int lenght = number;
        int distNumber[] = new int[number];
        //   int rand= (int) (Math.random() * max+1);
        int counter = 0;
        while (lenght > 0) {

            boolean check = true;
            int rand = (int) (Math.random() * max + 1);
            //System.out.println(rand);
            for (int i : distNumber) {
                if (i == rand) {
                    check = false;
                    break;
                }
            }
            if (check) {
                distNumber[counter] = rand;
                lenght--;
                counter += 1;
            }

        }

        for (int i = 0; i < number; i++) {
            System.out.print(" " + distNumber[i]);
        }


    }
}
