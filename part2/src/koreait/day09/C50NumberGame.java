package koreait.day09;

import java.util.Arrays;	//배열과 관련된 기능을 제공하는 클래스
import java.util.Random;
import java.util.Scanner;

public class C50NumberGame {

	public static void main(String[] args) {
		// start~end 난수를 컴퓨터가 정하면 사람이 알아맞추기
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max =5;		//시도 제한 횟수
		int[] values = new int[max];		//사용자가 입력한 값 저장하기
		int start=1, end=20;
		System.out.println("숫자 맞추기 게임 - 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너 휴먼은 맞춰보세요.(" + start + "~" + end +") ");
		
		//컴퓨터 난수 만들기
		int numComputer = r.nextInt(end-start+1)+start;
		int numHuman;
		int i=0;		//반복 카운트 변수 i가 max이거나 숫자를 맞출때까지 반복하기
		GameValue gv = new GameValue();
		System.out.println("참가자 닉네임 (종료:end) >>> ");
		gv.gamer = sc.nextLine();
		
		do {
			System.out.print("너 휴먼 생각한 숫자 입력 (남은 기회 : " + (max-i) + " ) >>> ");
			numHuman = sc.nextInt();
			values[i]=numHuman;		//마지막 인덱스는 max-1
			
			if(numComputer > numHuman) 
				System.out.println("아닙니다. 더 큰값입니다.");
			else if(numComputer < numHuman) 
				System.out.println("아닙니다. 더 작은값입니다.");
			else
				System.out.println("딩동댕!! 정답입니다.");
			
			if(numComputer != numHuman ) i++;			//숫자를 맞추지 못했을때만 증가
			if(i==max) break;
		}while(numComputer != numHuman);		//숫자를 맞출때까지 반복
		
		// 배열의 값을 모두 출력해주는 static 메소드
		System.out.println(Arrays.toString(values));
		System.out.println("정답 : " + numComputer + " 시도 횟수 : " + (i+1));
		gv.count=i+1;
		if(i==max) {
			System.out.println("실패!! 주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!!");
			//gv.success = false;
		}else {
			System.out.println("숫자 맞추기 성공!!");
			gv.success = true;
		}	
	
		System.out.println("\nGameValue 객체 확인");
		gv.print();
		
	}
// 숫자 맞추기 게임이 여러번 실행되고 게임기록을 남기고 싶다 어떤 데이터? 게임참가자이름, 성공여부, 시도횟수 , start,end,max
}




















