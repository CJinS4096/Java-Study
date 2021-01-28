package Exam03;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int sum[] = new int[N];
		int A, B;

		for (int i = 0; i < N; i++) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			sum[i] = A + B;
			System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + sum[i]);
		}
	}
}
