package koreait.day12a;

import koreait.day12.ClassA;

public class ClassAB extends ClassA{

	double point;
	
	public void print() {
		//point 는 현재 클래스의 필드
		System.out.println("포인트 : " + point);
	}
	
	public void test() {
		//name 은 부모 클래스의 필드
		//System.out.println("이름 : " + name);		//super 생략 가능
		System.out.println("제목 : " + super.title);
		family();
	//System.out.println("메시지 : " + msg);
	//		private 은 상속이 안됩니다.오류!	
		System.out.println(data());	//부모클래스 메소드 
	}
}
//다른패키지에서 사용할수 있는 접근권한은 public
//protected 는 자식이 아닌 다른 패키지 클래스는 사용못함.
//            다른 패키지의 자식 클래스는 사용할 수 있음. title필드
//default 필드 name 은 오류

class Test{
	
	public void t() {
	//	ClassA.dfamily();
		ClassA.pfamily();   //public만 실행 가능   
	//	ClassA.family();
	}
}