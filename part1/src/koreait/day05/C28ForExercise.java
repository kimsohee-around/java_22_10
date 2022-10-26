package koreait.day05;

import java.util.Scanner;

public class C28ForExercise {
	//문제 : 사용자가 입력한 정수값 만큼 별 ★ 출력하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count;
		
		System.out.print("★ 몇번 출력할까요? 정수입력 >>> ");
		count = sc.nextInt();
		
		for(int i=0;i<count;i++)
		  System.out.print("★");
		
		
		System.out.println("\n평점으로 별 출력하기 : 예시 - 3점이면 ★★★☆☆  , 4점이면 ★★★★☆");
		System.out.print("평점 입력 (0~5) >>> ");    //방법은 대략 3가지
		int jumsu = sc.nextInt();
		
		//★는 jumsu 만큼 출력하는 for, ☆ 은 5-jumsu 만큼 출력하는 for
		System.out.println("1.for 문 2개로 실행");
		if(jumsu>=0 && jumsu<=5) {		//사용자 입력값이 올바른지 검사
		    for(int i=0;i<jumsu;i++)		//i는 loop counter 변수
				System.out.print("★");
			
			for(int i=0;i<5-jumsu;i++)
				System.out.print("☆");
		} else {
			System.out.println("입력값이 잘못되었습니다.(0~5)");
		}
		//for문을 만점값 5만큼(횟수) 실행:  jumsu 보다 작을때는  ★ , 그렇지 않을때는 ☆ (if문) 
		System.out.println("\n\n2.for문 1개와 if문 1개로 실행");
		for(int i=0;i<5;i++)
			if(i<jumsu)
				System.out.print("★");
			else	
				System.out.print("☆");
		
		//for문의 반복횟수를 제어하는 변수 (loop counter 변수)를 활용 - 1번 변형
		System.out.println("\n\n3.loop counter 변수 활용");
		int k;
		for(k=0;k<jumsu;k++)
			System.out.print("★");
		
		//첫번째 for문이 끝나면 k 는 jumsu 와 같습니다.	
		System.out.println("k="+k);
		for(;k<5;k++)   //초기값 생략(k=jumsu)		
			System.out.print("☆");
		
		/*
		for(;;) {		
			//무한반복
		}
		*/
		//for(초기식;조건식;증감식)  -> 필요에 따라 안쓰고 for문 안에서 처리할수 있습니다.
		sc.close();
		
	}

}
