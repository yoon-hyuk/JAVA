package repeat;

import java.util.Scanner;

public class problem_1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int A = sc.nextInt();
		int Cycle = 0;
		int Og = A;
	
		
		while(true) {
			
			if(Og == A/10*10 + A/10 + A%10) {
				
				//Cycle++ ;
				System.out.println(Cycle);
				break;
			}else {
				A = (A/10*10 + (A/10 + A%10)%10);
				Cycle ++;
			}
		
		}
	}
}