package solve100Problem;

import java.util.Scanner;

public class No_1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] Array = new int[19][19];

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			Array[a][b] = 1;

		}

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}
}