package Exam02;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		int numA = scanner.nextInt();
		int numB = scanner.nextInt();

		if (numA > numB) {
			System.out.println(">");
		} else if (numA == numB) {
			System.out.println("==");
		} else
			System.out.println("<");
	}
}
