package Exam05;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 1000000;
		int max = -1000000;

		int num[] = new int[scanner.nextInt()];

		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.print(min + " " + max);
	}
}