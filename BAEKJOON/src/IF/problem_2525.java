package IF;

import java.util.Scanner;

public class problem_2525 {
//입력한 시간에서 요리시간을 더한 조리 후 시간을 출력하는 프로그램을 만드시오
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			
			int H = sc.nextInt(); //현재 시
			int M = sc.nextInt(); //현재 분
			int cookingTime = sc.nextInt(); //요리 시간
			
			int time = H*60+M+cookingTime; //조리후 계산될 시간을 분단위로 합산
			
			int hour = (time/60)%24; // 최종 분을 시간단위로 구하고 24를 넘지않게 하기위해 24로 나눈 나머지로 표기
			int minute = time%60;
			
			System.out.println(hour + " " + minute);
			
	}
}