package koreait.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		StringTokenizer stk = new StringTokenizer(temp);   //구분기호 생략 : 공백 과 줄바꿈
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
//		temp = "모모,90,88,79";
		temp = "모모,90(88)79";
//		stk = new StringTokenizer(temp,",");
		stk = new StringTokenizer(temp," ,()");		//구분기호 4가지 나열 공백 , ( )
		System.out.println("3.반복문 : 구분 기호는 공백,() ");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
		
		temp = "모모,90,88,79";
		stk = new StringTokenizer(temp,",");
		System.out.println("4.토크나이저 실행한 값으로 Score 객체 생성");
		Score momo=null;
		while(stk.hasMoreTokens()) {
			momo = new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken())); 
		}
			
		System.out.println("momo :" + momo);
		System.out.println("총점 : " + momo.sum() +", 평균 : " + String.format("%.1f", momo.average()));
		System.out.println("학점 : " + momo.getGrade());
		
		temp = "모모 [90,88,79]\n나나 [78,83,79]\n신비 [92,73,66]\n은하 [78,88,99]";
		List<Score> scores = new ArrayList<>();		// 토크나이저 활용 
		stk = new StringTokenizer(temp," ,[]\n");	//여러개 구분기호 사용할때 공백,줄바꿈 생략못함		
		System.out.println("5.토크나이저  Score 객체 생성 리스트에 추가");
		while(stk.hasMoreTokens()) {
			/*
			scores.add( new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()))); */
			Score s =  new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()));
			System.out.println(s);
			System.out.println("총점 : " + s.sum() +", 평균 : " + String.format("%.1f", s.average()));
			System.out.println("학점 : " + s.getGrade());
			scores.add(s);
		}
		
		System.out.println("리스트의 크기 : " + scores.size());
		
		System.out.println("\nreplaceAll , split 테스트-메소드는 인자가 정규표현식");
		//replaceAll 와 split 메소드는 인자가 정규표현식
//		temp=temp.replace("\n", "").replace(" ", "");
		temp=temp.replaceAll("[ \n]", "");		
		//위의 replace 2개 실행을 정규식으로 사용. [ \n]는 공백이거나 \n ("[정규식]")
		System.out.println(temp);
		String[] r = temp.split("[,\\[\\]]");   //구분기호 , [  ] 3가지로 지정
		for(String t : r) 
			System.out.println(t);
		
		//Score 리스트 만드는 것은 토크나이저 활용이 적합합니다.
		
	}

}
