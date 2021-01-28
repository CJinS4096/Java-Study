package Exam05;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int C = scanner.nextInt();
		int sum, count;
		double average;

		for (int i = 0; i < C; i++) {
			int n = scanner.nextInt();
			sum = 0;
			count = 0;
			int score[] = new int[n];

			for (int j = 0; j < n; j++) {
				score[j] = scanner.nextInt();
				sum += score[j];
			}
			average = (double) sum / n;

			for (int k = 0; k < score.length; k++) {
				if (score[k] > average) {
					count++;
				}
			}
			System.out.println(String.format("%.3f%%", ((double) count / score.length) * 100));
		}
	}
}