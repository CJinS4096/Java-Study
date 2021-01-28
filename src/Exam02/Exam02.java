package Exam02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();

		switch (score / 10) {
		case 10:
			System.out.println('A');
			break;
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
			break;
		}
	}
}
