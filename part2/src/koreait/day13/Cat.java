package koreait.day13;

public class Cat extends Animal{
	
	public Cat() {
		//생략된 실행명령은? super() 입니다.부모클래스 생성자가 실행됩니다.
		System.out.println("냐용이가 생성되었습니다.");
	}
	
	@Override
	public void sound() {		//부모클래스의 인스턴스 메소드를 재정의(오버라이드) 
		System.out.println("😺😺😺😺야옹야옹 웁니다." + getName());   //private 필드 name 값 가져오는 getter
		System.out.println("color : " + getColor());
	} 
	
}
