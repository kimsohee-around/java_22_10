package koreait.day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C55NumberGameV2 {

	
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 5;
		int[] values = new int[max];
		int start=1,end=20;
		System.out.println("숫자 맞추기 게임 - 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너 휴먼은 맞춰보세요.(" + start + "~" + end +") ");
		int numComputer = GameValueV2.makeRandom(start, end);
		int numHuman;
		int i=0;
		
		// 기본생성자로 객체생성 사용하기
		GameValueV2 gv = new GameValueV2();   
		//gv.print();		//확인용
		
		while(true) {
			System.out.println("참가자 닉네임 (종료:end) >>> ");
		//	String name = sc.nextLine();     //sc.nextLine() 문자열 입력-메모리에저장-그 주소를 리턴-name변수가 주소저장
		//	gv.setGamer(name);		//this.gamer = gamer(매개변수);
			gv.setGamer(sc.nextLine());  //setter
			
		//	if(name.equals("end")) break;
			if(gv.getGamer().equals("end")) break;		//getter
			i=0;		//새로운 참가자를 위한 카운트 변수(배열 인덱스) 초기화
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
				if(numComputer != numHuman ) i++;	//시도회수 1번 사용했으므로 카운트변수 증가
				
			}while(numComputer!=numHuman || i != max);
			
			System.out.println(Arrays.toString(values));
			System.out.println("정답 : " + numComputer + " 시도 횟수 : " + (i+1));
			gv.setCount(i+1);//setter
			
			if(i==max) {
				System.out.println("실패!! 주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!!");
				gv.setSuccess(false);  //기본값이므로 생략가능
			}else {
				System.out.println("숫자 맞추기 성공!!"); 
				gv.setSuccess(true);
			}
			
			//1건의 게임기록 setter 메소드로 저장 완료
			
			System.out.println("\nGameValue 객체 확인");
			gv.print();
			
			sc.nextLine();
			
		}//while end
		System.out.println("::프로그램 종료::");
		
		
	}
}

//C50: 클래스의 필드를 직접 접근. 접근권한 default -> 웹개발 할때에는 이렇게 사용 안합니다.
//C54: 커스텀 생성자로 필드값 초기화
//C55: 기본생성자 와 setter 메소드 
