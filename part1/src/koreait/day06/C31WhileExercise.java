package koreait.day06;

import java.util.Scanner;

public class C31WhileExercise {

	public static void main(String[] args) {
		//while 문으로 적합한 예시 :
		//사용자가 입력하는 정수를 모두 더하는 계산기입니다.
		//종료조건 입력값이 -1이면 입력을 끝내고 계산한 결과를 출력합니다.
		
		
		Scanner sc = new Scanner(System.in);
		int n=0,sum=0;
		System.out.println("::사용자가 입력하는 정수를 모두 더하는 계산기(1)::");
		while(n!=-1) {
			System.out.print("덧셈한 정수 n 입력 >>> ");
			n=sc.nextInt();
			if(n!=-1) sum+=n;
		}
		System.out.println("sum(1) ="+sum);
		
		n=0;sum=0;		//변수 초기화
		System.out.println("::사용자가 입력하는 정수를 모두 더하는 계산기(2)::");
		while(true) {
			System.out.print("덧셈한 정수 n 입력 >>> ");
			n=sc.nextInt();
			if(n==-1) break;
			sum+=n;
		}
		System.out.println("sum(2) ="+sum);
		
		
		n=0;sum=0;		//변수 초기화
		System.out.println("::사용자가 입력하는 정수를 모두 더하는 계산기(3)::");
		boolean state=true;
		while(state) {
			System.out.print("덧셈한 정수 n 입력 >>> ");
			n=sc.nextInt();
			if(n==-1) state=false;
			else sum+=n;
		}
		System.out.println("sum(3) ="+sum);
		
		
		System.out.println("*** 끝 ***");

	}  //결론 : loop counter 의 연속적인 범위가 있다면 for
		//                  실행횟수를 알수 없다면 while

}
