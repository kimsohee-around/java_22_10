package koreait.day13;

public class Puppy extends Animal{
	private String type;
	
	//생성자 생략 가능합니다. -default 생성자 super() 호출합니다.부모클래스 생성자가 실행됩니다.
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void test() {		//Puppy 클래스의 인스턴스 메소드
		System.out.println("Puppy : 견종 - " + type);
	}
	
	@Override //@ 어노테이션은 명령실행에 도움을 주는 주석입니다.- 오버라이드는 부모의 인스턴스메소드 이름과 일치하지 않으면 오류
	public void sound() {
		System.out.println("🐶🐶🐶 멍멍 합니다.");
	}
}

class Frog extends Animal{
	
	public static void jump() {
		System.out.println("개구리 점프합니다.");
	}
}






