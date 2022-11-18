package koreait.day20;

import java.util.Scanner;

public class C84TryCatchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	try {
		System.out.print("정수 입력 >>> ");
		int cnt = Integer.parseInt(sc.nextLine());
//사용자가 처리할 수 없는 문자열 입력하면 프로그램 비정상 종료. -> try ~ catch 로 이 문제를 처리합니다.	
		
		System.out.println("1부터 cnt까지 더한 결과 : ");
		int sum=0;
		for(int i=0;i<=cnt;i++)
				sum+=i;
		System.out.println("sum = " + sum);
//	}catch (Exception e) {				//부모 클래스 Exception 타입 매개변수 - 모든 Exception 처리
//	}catch (NullPointerException e) {   //NullPointerException 타입 매개변수 - 지정된 타입 Exception만 처리
	}catch (NumberFormatException e) {
		//Exception이 발생했을 때 처리할 명령문들을 작성합니다.
		//catch (매개변수 Exception 타입은 '발생원인과 관련 정보를 객체로 생성'한 참조변수 e) 
		System.out.println("잘못된 문자열 입력했습니다.");
		System.out.println("원인 : " + e.getMessage());
	}catch (NullPointerException e) {
		System.out.println("객체가 null 이므로 실행할 수 었습니다.");
	}
	
		
	}

}
