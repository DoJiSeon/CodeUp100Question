package solve100Problem;

import java.util.Scanner;

public class No_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int sum = 0;
		int j = 0;
		for (int i = 0; sum < number; i++) {
			sum = sum + i;
			j = i;
		}
		System.out.println(j);
	}
}