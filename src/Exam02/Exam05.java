package Exam02;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (H == 0) {
			H = 24;
		}
		if (M > 45) {
			System.out.println(H + " " + (M - 45));
		} else {
			H--;
			M += 60;
			System.out.println(H + " " + (M - 45));
		}
	}
}
