package com.company;

import java.util.Arrays;

public class Calculator {

    public String checkOddEven(int n) {
        String msg;

        if (n % 2 == 0)
            msg = " is <<even>>";
        else
            msg = " is <<odd>>";

        return msg;
    }


    public int factorial(int n) {
        int res = 1;

        for (int i = n; i >= 2; i--) {
            res = res * i;
        }
        return res;
    }

    public double sequence_1overN(int n) {
        double res = 0.0;
        int i = 1;

        do {
            res += ((double) 1 / i);
            i++;
        } while (i <= n);

        return res;
    }

    public double div(double num, double divider) {
        double res;

        if (divider == 0) {
            System.out.println("divider with zero value is invalid");
        }

        return res = ((double) num / divider);
    }

    public void primeToHundred() {
        int[] primeNums = new int[100/2];
        System.out.println("PrimeNumbers list:");
        int i=2;
        int index=0;

        do  {
            if (i%2 == 0) {
                primeNums[index++]=i;
            }
            i++;
        }while (i<=100);
        System.out.println(Arrays.toString(primeNums));
    }

    public double formula(double a, double b){
          a = b*((double)a/b) + (a%b);
          return a;

    }
}
