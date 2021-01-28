package Exam05;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = -1;
		int index = 0;
		int n[] = new int[9];

		for (int i = 0; i < n.length; i++) {
			n[i] = scanner.nextInt();
			if (n[i] >= max) {
				max = n[i];
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
