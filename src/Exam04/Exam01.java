package Exam04;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B;

		do {
			A = scanner.nextInt();
			B = scanner.nextInt();
			System.out.println(A + B);
		} while (A != 0 && B != 0);
	}
}