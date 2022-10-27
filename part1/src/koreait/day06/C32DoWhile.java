package koreait.day06;

import java.util.Scanner;

public class C32DoWhile {

	public static void main(String[] args) {

		
		//사용자가 입력하는 정수를 모두 더하는 계산기입니다.
				//종료조건 입력값이 -1이면 입력을 끝내고 계산한 결과를 출력합니다.
				
				
		Scanner sc = new Scanner(System.in);
		int n=0,sum=0;
		System.out.println("::사용자가 입력하는 정수를 모두 더하는 계산기(1)::");
/*
		while(n!=-1) {		//조건을 먼저 검사하고 반복여부 결정
			System.out.print("덧셈한 정수 n 입력 >>> ");
			n=sc.nextInt();
			if(n!=-1) sum+=n;
		}
*/

		do {		//조건을 반복부분 실행하고 검사하기 때문에 n값과 상관없이 한번 실행
			sum+=n;
			System.out.print("덧셈한 정수 n 입력 >>> ");
			n=sc.nextInt();
		}while(n!=-1);
		
		System.out.println("sum(1) ="+sum);
		
		
		
	}

}
