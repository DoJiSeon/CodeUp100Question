package solve100Problem;

import java.util.Scanner;

public class No_1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int number = 0;
		int box[] = new int[24];

		for (int i = 0; i < num; i++) {
			number = sc.nextInt();
			box[number] += 1;
		}
		for (int i = 1; i < 24; i++) {
			System.out.print(box[i] + " ");
		}
	}
}