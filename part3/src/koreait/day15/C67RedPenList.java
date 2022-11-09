package koreait.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C67RedPenList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<RedPen> probs = new ArrayList<>();	//리스트의 사이즈는 동적(배열은 정적 크기)
		
		//5개의 객체 생성
		for(int i=0;i<5;i++) 
			probs.add(new RedPen('/'));
		
		//5개의 문제를 만들어서 출력하기
		for(int i=0;i<probs.size();i++) {
			//probs.get(i) 리턴 타입은 RedPen
			RedPen red = probs.get(i);
			//probs.get(i).make();//난수 생성으로 필드값 저장
			red.make();
			System.out.println(red.problem());
			System.out.print("답 입력 >>> ");
			int answer = Integer.parseInt(sc.nextLine());
			if(answer == red.answer() )
				System.out.println("정답입니다.");
			else
				System.out.println("오답입니다.");
		}
		
		
		//위의 2개 for문 합쳐서
		List<RedPen> probs2 = new ArrayList<>();
		System.out.println("\n새로운 뺄셈 문제 5개");
		for(int i=0;i<5;i++) {
			RedPen temp = new RedPen('-');
			temp.make();
			probs2.add(temp);
			System.out.print(temp.problem() + " 답 입력 >>> ");
			int answer = Integer.parseInt(sc.nextLine());
			if(answer == temp.answer())
				temp.setCorrect(true);
		}
		
		//toString 메소드 재정의 해서 출력
		System.out.println(probs2);
		
	}

}




















