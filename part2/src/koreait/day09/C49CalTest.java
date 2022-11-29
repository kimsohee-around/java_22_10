package koreait.day09;

public class C49CalTest {

	public static void main(String[] args) {

		//Calculator 클래스의 계산기 기능을 객체생성해서 실행하기
		Calculator cal1= new Calculator();
		Calculator cal2= new Calculator();
		
		System.out.println("cal1 객체 필드값 저장하기 전 : " + cal1.val1 + "," + cal1.val2);
		System.out.println("덧셈 결과 :" + cal1.add());
		System.out.println("뺄셈 결과 :" + cal1.substract());
		System.out.println("곱셈 결과 :" + cal1.multiply());
		//System.out.println("나눗셈 몫 결과 :" + cal1.divide());  //0으로 나누면 오류
		
		
		cal1.val1=123;   cal1.val2=29;
		cal2.val1=89;   cal2.val2=11;
		
		System.out.println("cal1 객체 필드 : " + cal1.val1 + "," + cal1.val2);
		System.out.println("덧셈 결과 :" + cal1.add());
		System.out.println("뺄셈 결과 :" + cal1.substract());
		System.out.println("곱셈 결과 :" + cal1.multiply());
		System.out.println("나눗셈 몫 결과 :" + cal1.divide());
		System.out.println("나눗셈 나머지 결과 :" + cal1.mod());
		
		
		System.out.println("cal2 객체 필드 : " + cal2.val1 + "," + cal2.val2);
		System.out.println("덧셈 결과 :" + cal2.add());
		System.out.println("뺄셈 결과 :" + cal2.substract());
		System.out.println("곱셈 결과 :" + cal2.multiply());
		System.out.println("나눗셈 몫 결과 :" + cal2.divide());
		System.out.println("나눗셈 나머지 결과 :" + cal2.mod());
		
		System.out.println("\n덧셈 add 를 static 메소드로 실행");
		System.out.println("static add : " + Calculator.add(123, 29));
		System.out.println("static add : " + Calculator.add(89, 11));
		
	}

}












