package com.company;

public class YearAnalyzer {

    public boolean checkLeapYear(int n) {
        boolean isLeap = false;
        int l = n%4;

        if (((n%4) == 0) && (n%100 != 0)) {
                isLeap = true;
        }
        else {
                if (n%400==0)
                isLeap=true;
        }
        return isLeap;
    }
}
