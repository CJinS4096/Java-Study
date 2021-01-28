package Exam03;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int sum[] = new int[N];
		for (int i = 0; i < N; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			sum[i] = A + B;
		}
		for (int j = 0; j < N; j++) {
			System.out.println("Case #" + (j + 1) + ": " + sum[j]);
		}
	}
}