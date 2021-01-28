package Exam02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();

		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			System.out.println("1");
		} else
			System.out.println("0");
	}
}
