package IF;

import java.util.Scanner;

public class problem_1330 {
//두 정수 A와 B가 주어졌을 때 A와 B의 비교하는 프로그램을 작성하시오
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if (A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		//Hi this is hyuk's girlfriend. (krystal).
	}
	
}
