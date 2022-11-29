package koreait.day03;

import java.util.Scanner;

public class C20HomeWork {		// -> 과제 폴더에 올려놓으세요.!!
	public static void main(String[] args) {
		
		//정수값 아스키코드 소문자 : 97~122  대문자 :65~90 (소문자=대문자+32) 범위에서 입력받으면
		// 해당 문자가 무엇인지 출력해주기!!  ->  캐스팅이 필요합니다. 
		// 추가 처리 사항 : 영문자 범위가 아닌 값 일때는 '잘못된 입력' 메시지로 알려주기
		
		//조건식 참고 : 시험 점수는 0~100    jumsu >=0  &&   jumsu<=100
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 >> ");
		int a = sc.nextInt();
		
//		if(a >= 65 && a <= 90 || a >= 97 && a<=122)
		if(a >= 'A' && a <= 'Z' || a >= 'a' && a<='z')
			System.out.println("입력된 아스키코드값 문자는 '" + (char)a +"' 입니다.");
		else
			System.out.println("잘못 입력하셨습니다.");
		
		
		sc.close();
		
	}
}
