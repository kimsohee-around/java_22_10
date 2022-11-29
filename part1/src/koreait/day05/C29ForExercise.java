package koreait.day05;

import java.util.Scanner;

public class C29ForExercise {
	
	public static void main(String[] args) {

		
		//1부터 100까지 한 줄에 숫자 10개씩 출력하기  	printf("%5d",i)
		//						ㄴ 힌트: 10의 배수일때 줄바꿈 출력
		System.out.println("1부터 100까지 한 줄에 숫자 10개씩 출력---------------");
		for(int i=1;i<=100;i++){
			System.out.printf("%5d",i);
			if(i%10==0) System.out.println();
		}
		
		
//1~100 값 중에서 5(n=?)의 배수만 한줄에 10개씩 출력하기 - 어려울것 같아요.(변수가 추가로 필요합니다.-출력개수 카운트)
//				   ㄴ (5로 나누어서 나머지가 0인 값)	힌트: 출력갯수를 카운트해서 그 값이 10의 배수일때 줄바꿈.
		System.out.println("5의 배수만 한줄에 10개씩 출력------------");
		int count=0;
		for(int i=1;i<=100;i++){
			if(i%5==0) {
				System.out.printf("%5d",i);
				count++;
				if(count%10==0) System.out.println();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n::n의 배수 출력하기:: 정수 n 입력 >>> ");
		int n= sc.nextInt();
		System.out.print("라인당 몇개씩 찍을까요? >>> ");
		int cols = sc.nextInt();		//column : 칸,열
		
		count=0;
		for(int i=1;i<=100;i++){
			if(i%n==0) {
				System.out.printf("%5d",i);
				count++;
				if(count%cols==0) System.out.println();
			}
			
		}
		System.out.println("\n\n::카운트 변수 없이 해보기::");
		for(int i=1;i<=100/n;i++){
			System.out.printf("%5d",i*n);
			if(i%cols==0) System.out.println();
			
		}
		
		
	}//main end

} //class end
