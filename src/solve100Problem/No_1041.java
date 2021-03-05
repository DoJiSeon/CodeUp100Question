package solve100Problem;

import java.util.Scanner;

public class No_1041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		byte[] buffers = A.getBytes();
		byte output = (byte) (buffers[0] + 1);

		char outputt = (char) output;

		System.out.println(outputt);
	}
}
