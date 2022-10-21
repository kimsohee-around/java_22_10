package koreait.day02;

public class C05IntegerData {
	//정수데이터의 형식 알아보기
	public static void main(String[] args) {

		System.out.println("Byte 정수데이터 --------------");
		System.out.println("메모리 크기 : " + Byte.BYTES + " 바이트");   //
		System.out.println("Byte 정수의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값 : " + Byte.MAX_VALUE);
		
		System.out.println("Short 정수데이터 --------------");
		System.out.println("메모리 크기 : " + Short.BYTES + " 바이트");   //
		System.out.println("Short 정수의 최소값 : " + Short.MIN_VALUE);
		System.out.println("Short 정수의 최대값 : " + Short.MAX_VALUE);
		
		System.out.println("Integer 정수데이터 --------------");
		System.out.println("메모리 크기 : " + Integer.BYTES + " 바이트");   //
		System.out.println("메모리 크기 : " + Integer.SIZE+ " 비트 (bits)");   //
		
		System.out.println("Integer 정수의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("Integer 정수의 최대값 : " + Integer.MAX_VALUE);

		System.out.println("Long 정수데이터 --------------");
		System.out.println("메모리 크기 : " + Long.BYTES + " 바이트");   //
		System.out.println("Long 정수의 최소값 : " + Long.MIN_VALUE);
		System.out.println("Long 정수의 최대값 : " + Long.MAX_VALUE);
		
		System.out.println("\n2진수 값으로 출력하기");
		System.out.println(Integer.toBinaryString(314));
		
	}
}
/*
 *  정수 데이터 기본 형식은  byte, short, int, long 4가지 이며 
 *  			ㄴ 변수를 선언할 때 사용할 키워드 입니다.(예약어. 용도가 정해진 단어)
 * 				ㄴ 각각 메모리에 할당받는 크기(바이트 단위)에 따라 값의 표현 범위가 결정됩니다.
 *  
 * Byte, Short, Integer, Long 클래스는 정수 데이터 형식를 다루는 특징과 메소드를 갖는 클래스입니다.(Wrapper 래퍼 클래스)
 *		ㄴ BYTES, MIN_VALUE, MAX_VALUE :  위 클래스들의 구성요소인 특징(필드/속성/프로퍼티)들 중 변하지 않는값(상수) 입니다.


*/