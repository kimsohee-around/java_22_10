package koreait.day02;

public class C07DoubleData {
	//실수 데이터의 형식 알아보기
	public static void main(String[] args) {

		System.out.println("Float 실수데이터 --------------");
		System.out.println("메모리 크기 : " + Float.BYTES + " 바이트");   //
		System.out.println("Float 실수의 최소값 : " + Float.MIN_VALUE);  //1.4E-45 는 1.4x10의 -45승
		System.out.println("Float 실수의 최대값 : " + Float.MAX_VALUE);
		
		System.out.println("Double 실수데이터 --------------");
		System.out.println("메모리 크기 : " + Double.BYTES + " 바이트");   //
		System.out.println("Double 실수의 최소값 : " + Double.MIN_VALUE);
		System.out.println("Double 실수의 최대값 : " + Double.MAX_VALUE);
		
		
	}
}
/*
 *  실수 데이터 기본 형식은  float, double 2 가지 이며 
 *  			ㄴ 변수를 선언할 때 사용할 키워드 입니다.(예약어. 용도가 정해진 단어)
 * 				ㄴ 각각 메모리에 할당받는 크기(바이트 단위)에 따라 값의 표현 범위가 결정됩니다.
 *  
 * Float, Double 클래스는 실수 데이터 형식를 다루는 특징과 메소드를 갖는 클래스입니다.(Wrapper 래퍼 클래스)
 *		ㄴ BYTES, MIN_VALUE, MAX_VALUE :  위 클래스들의 구성요소인 특징(필드/속성/프로퍼티)들 중 변하지 않는값(상수) 입니다.
 *
 * * * 실수데이터는 컴퓨터 구조에서 부동소수점 형식으로 다룹니다. * * *  
 *  예를 들면 1.23 x 10의 23승  에서 1.23(가수) 과 23(지수) 을 각각 어떤 크기(비트수)만큼 할당하는냐에 따라
 *  값의 표현범위와 정밀도(소수점 이하 자리수가 많을 수록 정밀도가 높아집니다.)가 결정됩니다.

*/

