package koreait.day10;

public class C51MyClass1Test {
	//접근 : 읽기(메모리에서 가져오기)와 쓰기(메모리에 저장)
	public static void main(String[] args) {
		
		//인스턴스 필드는 객체를 생성하고 데이터를 저장
		MyClass1 my1 = new MyClass1();
		System.out.println("객체 생성 후 필드값 : " + my1.fields());
		//my1.age = 12;		//private 필드 접근 못함
		my1.name ="모모";
		my1.point = 12.3;
		//System.out.println("my1 age : " + my1.age);
		MyClass1.etc = 123;
		//MyClass1.msg = "테스트";		//final 상수이므로 오류 
		System.out.println("객체 생성 후 필드값 저장 : " + my1.fields());
		System.out.println("static 필드 확인----");
		System.out.println(MyClass1.etc);
		System.out.println(MyClass1.msg);
		
		
		String abc = "hello";
		System.out.println(abc.hashCode());
	}

}
