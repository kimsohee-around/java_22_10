package koreait.day19;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C82StringSplit {
//split : 쪼개다.분열시키다.  -> String 클래스 메소드
	public static void main(String[] args) {

		//참고 : "abc" =>char[] 배열로 {'a','b','c}  toCharArray() 메소드
		
		String temp = "모모 90 88 79";	//특정문자열을 중심(기준)으로 분리하기
		
		String[] result = temp.split(" ");
		System.out.println("temp 문자열 분리 결과 : " + Arrays.toString(result));
		for(String t : result)
			System.out.println(t);
		
		temp = "모모xy90xy88xy79";
		result = temp.split("xy");
		System.out.println("temp 문자열 분리 결과 : " + Arrays.toString(result));
		for(String t : result)
			System.out.println(t);
		
//tokenizer : 토큰화시키는 기능		(토큰 : 작은단위의 값)
		System.out.println("\nStringTokenizer");
		temp = "모모 90 88 79";
		StringTokenizer stk = new StringTokenizer(temp);   //구분기호 생략 : 공백
		System.out.println("1.nextToken");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());	//오류 : next로 가져올 데이터 없음.
		
		stk = new StringTokenizer(temp);
		System.out.println("2.반복문 : hasMoreTokens");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
		
		System.out.println("여기까지는 구분기호가 기본값이 공백이었습니다.");
		temp = "모모,90,88,79";
		stk = new StringTokenizer(temp,",");
		System.out.println("3.반복문 : 구분 기호 ,");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
		
		
		
		
	}

}
