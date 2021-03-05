package solve100Problem;

import java.util.Scanner;
// 데이터 타입의 저장 가능 범위 - 잘 확인하기
public class No_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double num3 = sc.nextInt();
		double num4 = sc.nextInt();
		
		if (num1<=48000 && num2<=32 && num2%8 == 0 && num3<=5 && num4<=6000) {
			double mid = (num1*num2*num3*num4)/8;
			double middle = mid/1024/1024;
			System.out.printf("%.1f",middle);
			System.out.print(" "+"MB");	
		}		
	}
}
