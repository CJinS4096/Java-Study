package Exam03;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}