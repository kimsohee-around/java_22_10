package koreait.day09;

public class Calculator {
	
	//정수 사칙연산을 하는 계산기 기능 클래스
	//사칙연산은 데이터가 2개 필요합니다. (필드)
	int val1;
	int val2;
	
	//인스턴스 메소드 4개: 인스턴스 필드값으로 각각 + - * / %
	public int add() {
		return val1+val2;
	}
	
	public int substract() {
		return val1-val2;
	}
	
	public int multiply() {
		return val1*val2;
	}
	
	public int divide() {
		return val1/val2;
	}
	
	public int mod() {
		return val1%val2;
	}
	
	
	public static int add(int val1,int val2) {		//static 메소드는 인스턴스 필드 사용 못합니다.
		return val1+val2;				//메소드에 필요한 값은 인자로 전달받음.
	}
	
	//static 메소드 4개 추가
	
	
	
}	
