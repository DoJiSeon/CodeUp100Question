package solve100Problem;

import java.util.Scanner;

public class No_1023 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String massage = scan.next();
		
		String [] box = massage.split("\\.");
		
		String front = box[0];
		String back = box[1];
		
		System.out.println(front);
		System.out.println(back.substring(0,6));
	}
}
