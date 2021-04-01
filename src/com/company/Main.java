package com.company;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		double b = 7;
		double divider = 7;
		int year = 2020;

		Calculator calc = new Calculator();
		YearAnalyzer ya = new YearAnalyzer();

		System.out.println(a + calc.checkOddEven(a));
		System.out.println(a + "! gives " + calc.factorial(a));
		System.out.println(a + " based sequence gives " + calc.sequence_1overN(a));
		System.out.println(a + " Division returns " + calc.div(a, divider));
		System.out.println("formula result "+ calc.formula(a, b));

		if (!ya.checkLeapYear(year)) {
			System.out.println(year + " is NOT a Leap year");
		} else {
			System.out.println(year + " IS a Leap year");
		}

		calc.primeToHundred();

	}
}

