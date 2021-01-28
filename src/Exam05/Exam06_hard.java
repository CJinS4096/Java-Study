package Exam05;

import java.util.Scanner;

public class Exam06_hard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str[] = new String[5];

		for (int i = 0; i < str.length; i++) {
			str[i] = scanner.nextLine();
		}

		for (int i = 0; i < str.length; i++) {
			int count = 0;
			int sum = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}

//		Scanner scanner = new Scanner(System.in);
//
//		String str[] = new String[5];
//
//		for (int i = 0; i < str.length; i++) {
//			str[i] = scanner.nextLine();
//		}
//
//		for (int i = 0; i < str.length; i++) {
//			int count = 0;
//			int sum = 0;
//			for (int j = 0; j < str[i].length(); j++) {
//				if (str[i].charAt(j) == 'O') {
//					count++;
//				} else {
//					count = 0;
//				}
//				sum += count;
//			}
//			System.out.println(sum);
//		}
//		scanner.close();
	}
}