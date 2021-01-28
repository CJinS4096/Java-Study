package Exam04;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B;

		while (true) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			System.out.println(A + B);
			if (A == 0 && B == 0) {
				break;
			}
		}
	}
}