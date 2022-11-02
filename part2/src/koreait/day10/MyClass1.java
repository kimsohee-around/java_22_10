package koreait.day10;

public class MyClass1 {
	
	//인스턴스 필드
	private int age;		//MyClass1 클래스 안에서만 사용
	String name;		//default 접근한정자 
	public double point;		//모든 클래스에서 사용
	
	//static 필드
	static int etc;		//default 접근 , static
	public static final String msg="myclass1";		//심볼릭 symbolic 상수

	public String fields() {
		return "나이 : " + age +",이름 : " + name + ",포인트 : " + point;
	}
	
}

class Test {  //default 접근 한정자
	MyClass1 my = new MyClass1();
	//my.age = 12;  //private 이므로 오류
}

final class Test2 {
	
}

abstract class Test3 {
	
}
