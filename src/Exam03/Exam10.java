package Exam03;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // 정수 N개
		int X = scanner.nextInt(); // 특정 정수

		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt(); // 수열
		}
		for (int j = 0; j < N; j++) {
			if (X > A[j]) {
				System.out.print(A[j] + " ");
			}
		}
	}
}
