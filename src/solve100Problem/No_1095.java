package solve100Problem;

import java.util.Scanner;

public class No_1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int number = 0;
		int count = 0;
		int box[] = new int[num];

		for (int i = 0; i < num; i++) {
			number = sc.nextInt();
			box[i] = number;
		}
		count = box[0];
		for (int i = 0; i < num; i++) {
			if (count >= box[i]) {
				count = box[i];
			} else {
				count = count;
			}
		}
		System.out.println(count);
	}
}