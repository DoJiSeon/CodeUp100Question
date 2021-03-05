package solve100Problem;

import java.util.Scanner;

public class No_1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Arrayh = sc.nextInt();
		int Arrayw = sc.nextInt();
		int num = sc.nextInt();
		int[][] Array = new int[Arrayh][Arrayw];

		if (num >= 1 && num <= 10) {
			for (int i = 0; i < num; i++) {
				int length = sc.nextInt();
				int d = sc.nextInt();
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;

				for (int j = 0; j < length; j++) {
					if (d == 0) {
						Array[a][b + j] = 1;
					} else if (d == 1) {
						Array[a + j][b] = 1;
					}
				}
			}
		}

		// 출력
		for (int i1 = 0; i1 < Arrayh; i1++) {
			for (int j = 0; j < Arrayw; j++) {
				System.out.print(Array[i1][j] + " ");
			}
			System.out.println();
		}
	}
}