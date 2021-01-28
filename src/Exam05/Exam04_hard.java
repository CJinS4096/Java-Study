package Exam05;

// 이해가 살짝 안되는 문제 다시 풀어보기 ★★☆☆☆

import java.util.Scanner;

public class Exam04_hard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0; // 중복없는 값 갯수
		int over = 0; // 중복값 개수
		int division[] = new int[10];

		for (int i = 0; i < division.length; i++) {
			division[i] = scanner.nextInt() % 42;
		}

		for (int j = 0; j < division.length; j++) {
			over = 0;
			for (int k = j + 1; k < division.length; k++) {
				if (division[j] == division[k]) {
					over++;
				}
			}
			if (over == 0) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}