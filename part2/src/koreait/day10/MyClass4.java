package koreait.day10;

public class MyClass4 {

	private int age;
	private String name;
	private double point;
	
	//기본생성자가 없습니다.
	
	
	//커스텀 생성자 : 
	public MyClass4(int age, String name) {
		this.age=age;
		this.name=name;
		this.point = 12.3;
	}
	

	
	public String fields() {
		return "이름: " + name + ",나이 : " + age + ",포인트 : " + point;
	}
	
}

/*
 * 생성자
 –인스턴스(객채)를 생성할 때 호출하는 특수한 목적의 메서드. Ramdom r = new Random() 에서 Random() 생성자 메소드 
–보통 객체를 생성할 때 필드 등 변수를 초기화하거나 필요한 다른 객체를 생성하는 등 작업을 처리. : 주로 커스텀 생성자
–반드시 클래스 이름과 동일하게 작성
–모든 클래스는 생성자가 반드시 존재하며 하나 이상 정의될 수 있다. 그 하나가 기본생성자
–생성자 선언을 생략하면 컴파일러는 **인자가 없는 기본 생성자**를 실행한다.
 * 
 */
