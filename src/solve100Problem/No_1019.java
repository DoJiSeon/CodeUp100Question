package solve100Problem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No_1019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String massage = scan.nextLine();
		StringTokenizer stn = new StringTokenizer(massage, ".");
		int [] box = new int [3];
		
		int i = 0; // hasMoreTokens() = 토큰이 남아있는지 알려줌
		while(stn.hasMoreTokens()) {
			box[i] = Integer.parseInt(stn.nextToken()); 
		// nextToken = 다음 토큰을 반환, Integer.parseInt = "숫자형"의 문자열을 값으로 받으면 10진수의 Integer 형으로 반환
			i+=1;
		}
		
		String yyyy = String.format("%04d", box[0]);
		String mm = String.format("%02d", box[1]);
		String dd = String.format("%02d", box[2]);
		
		System.out.println(yyyy+"."+mm+"."+dd);
		
		//hasMoreTokens = 토큰이 남아있는지 알려줌, 
	}
}
