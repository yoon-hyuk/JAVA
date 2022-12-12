package inputoutput;

import java.util.Scanner;

public class problem_2588 {
//세자리수 * 세자리수의 과정을 출력하시오
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in); 
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10)); //472*1의 자리
		System.out.println(A*(B%100/10)); //472*10의 자리
		System.out.println(A*(B/100)); ////472*100의 자리
		System.out.println(A*B);
	}
}
