package IF;

import java.util.Scanner;

public class problem_2753 {
//윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%4 == 0 &&( num%100 != 0 || num%400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}
	
}
