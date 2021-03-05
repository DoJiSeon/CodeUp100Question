package solve100Problem;

import java.util.Scanner;

public class No_1084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < number1; i++) {
			for (int f = 0; f < number2; f++) {
				for (int j = 0; j < number3; j++) {
					System.out.print(i + " " + f + " " + j);
					System.out.println(" ");
					sum += 1;
				}
			}
		}
		System.out.println(sum);
	}
}
