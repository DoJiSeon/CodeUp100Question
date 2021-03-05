package solve100Problem;

import java.util.Scanner;

public class No_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int number=0;
		int box [] = new int [num];
		
		for (int i = 0; i < num; i++) {
			number = sc.nextInt();
			box[i]=number;
		}
		for (int i = num-1; i >=0; i--) {
			System.out.print(box[i]+" ");
		}
	}
}