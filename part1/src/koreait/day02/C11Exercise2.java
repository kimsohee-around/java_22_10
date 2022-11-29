package koreait.day02;

import java.util.Scanner;

public class C11Exercise2 {
	//변수,대입문,연산자 활용 연습문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width = 23;		//너비(가로)   ㎝ ㎠ 
		int height = 19;	//높이(세로)
		int area;			//사각형 넓이 저장
		double tri_area;	//삼각형 넓이 = 너비*높이 / 2
		double round;		//원의 둘레 = 2*3.14*반지름 
		
		System.out.print("도형 너비 입력 -> ");
		width = sc.nextInt();
		System.out.print("도형 높이 입력 -> ");
		height = sc.nextInt();
		System.out.printf("입력값 : 너비 %d , 높이 %d \n",width,height);
		System.out.println("[[사각형 도형 넓이 구하기]]");
		area = width*height;  //수식
		System.out.println("넓이 : " + area + "㎠");//출력
		System.out.println("너비+높이 : " +(width+height) + "㎝");//출력
		
		System.out.println("[[삼각형 도형 넓이 구하기]]");
		tri_area = (double)width*height/2;		//나눗셈결과 실수값으로 구하기 위해 정수를 임의로 강제 캐스팅.
		System.out.println("넓이 : " + tri_area + "㎠");
		System.out.println("넓이(정수) : " + (int)tri_area + "㎠");
		
		System.out.println("[[원 도형 둘레 구하기]]");
		double radius ;		//원의 반지름
		final double pi = 3.14;			//final 키워드 : 값을 변경할수 없다. 즉 상수(constant)
		System.out.print("원의 반지름 입력 -> ");
		radius = sc.nextDouble();
		System.out.printf("입력값 : 반지름 %f\n" , radius);
		round = 2*pi*radius;
		System.out.println("원의 둘레 : " + round + "㎝ (반지름 : " + radius +")" );
	}

}

/*
 * 대입문 기호 =(등호) : 오른쪽 값(리터럴)/수식/변수가 왼쪽 변수로 대입. 수식에 사용되는 연산은 다음과 같습니다. 
 * 산술연산 + , - , * , /(나눗셈 몫) , %(나눗셈 나머지,정수연산에서만) 
 * 관계연산 ==(동등,같다.) , != (같지 않다.) , > , < , >= , <=
 * 논리연산 && (and,그리고) , || (or, 또는) , !(not) 
 * 
 * 참고 : ++ ,-- , += , -= , *=, /= 는 연산결과를 대입하는 축약연산 입니다.
 */
