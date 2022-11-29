package koreait.day12;

public class ClassAA extends ClassA{

	double point;
	
	public void print() {
		//point 는 현재 클래스의 필드
		System.out.println("포인트 : " + point);
	}
	
	public void test() {
		//name 은 부모 클래스의 필드
		System.out.println("이름 : " + name);		//super 생략 가능
		System.out.println("제목 : " + super.title);
	//System.out.println("메시지 : " + msg);
	//		private 은 상속이 안됩니다.오류!	
		System.out.println(data());	//부모클래스 메소드 
	}
}
