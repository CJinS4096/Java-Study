package Exam03;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		for (int i = 0; i < 9; i++) {
			System.out.println(N + " * " + (i + 1) + " = " + (N * (i + 1)));
		}
	}
}
