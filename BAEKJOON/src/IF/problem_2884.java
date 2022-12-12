package IF;

import java.util.Scanner;

public class problem_2884 {
//입력한 시간보다 45분 일찍 출력되는 프로그램을 작성하시오
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(B < 45) {
			if(A == 0) {
				System.out.println(23 + " " + (B+15));
			}else {
			System.out.println((A-1)+" " + (B+15));
			}
		}else {
			System.out.println(A + " " + (B-45));
		}
	}
	
}
