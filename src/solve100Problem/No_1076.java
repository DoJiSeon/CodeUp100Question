package solve100Problem;

import java.util.Scanner;

public class No_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		byte spell = sc.nextByte();
		byte i = 97;
		while (spell >= 97 && spell <= 122 && i <= spell) {

			char spelling = (char) i;
			i = (byte) (i + 1);
			System.out.print(spelling);
			System.out.print(" ");
		}

	}
}
