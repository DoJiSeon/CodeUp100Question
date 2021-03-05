package solve100Problem;

import java.util.Scanner;

public class No_1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] Array = new int[19][19];

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				int borrow = sc.nextInt();
				if (borrow == 0) {
					Array[i][j] = 0;

				} else if (borrow == 1) {
					Array[i][j] = 1;
				}
			}
		}
		// 값 변환
		int num = sc.nextInt();

		if (num <= 10) {
			for (int i = 0; i < num; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;

				for (int k = 0; k < 19; k++) {
					if (Array[a][k] == 1) {
						Array[a][k] = 0;
					} else if (Array[a][k] == 0) {
						Array[a][k] = 1;
					}
					for (int f = 0; f < 19; f++) {
						if (Array[f][b] == 1) {
							Array[f][b] = 0;
						} else if (Array[f][b] == 0) {
							Array[f][b] = 1;
						}
					}
				}

			}

			// 출력
			for (int i1 = 0; i1 < 19; i1++) {
				for (int j = 0; j < 19; j++) {
					System.out.print(Array[i1][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
