package koreait.day07;

import java.util.Scanner;

//프로그래머스 코딩문제 테스트는 이렇게 하세요.
public class C42Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 >>> ");
		String test = sc.nextLine();	//"message"
		
		System.out.println("입력한 문자열 :" + test);
		System.out.println("reverse : " + reverse1(test));		//메소드 실행 : String타입 인자는 참조값(주소)
		
	}	
	//프로그래머스 문제 풀때 다음과 같이 메소드는 static으로 하세요.
	public static String reverse1(String s) {   //매개변수에 문자열의 참조값 전달받습니다.
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse += s.charAt(i);
		}
		return reverse;		//문자열의 참조값을 리턴
	}
	
	//프로그래머스 문제 풀때 다음과 같이 메소드는 static으로 하세요.	-> 프로그래머스에 답안 제출은 메소드 안의 내용만 복붙해서 제출
	public static String solution(String s, int n) {   
		//문제에서 주어진 인자값 개수와 타입, 리턴타입은 그대로 합니다.
	        String answer = "";
	        return answer;
	}
		
		
}
