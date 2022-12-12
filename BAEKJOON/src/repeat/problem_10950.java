package repeat;

import java.util.Scanner;

public class problem_10950 {
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	for( int i = 0 ; i < num ; i++) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A+B);
	}
	}
}