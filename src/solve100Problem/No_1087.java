package solve100Problem;

import java.util.Scanner;

public class No_1087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (sum + i < num) {
				sum = sum + i;
			} else if (sum + i >= num) {
				sum += i;
				break;
			}
		}
		System.out.println(sum);
	}
}