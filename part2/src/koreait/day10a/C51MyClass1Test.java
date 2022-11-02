package koreait.day10a;

import koreait.day10.MyClass1;

public class C51MyClass1Test {
//접근 : 읽기와 쓰기
	public static void main(String[] args) {
		
		//인스턴스 필드는 객체를 생성하고 데이터를 저장
		MyClass1 my1 = new MyClass1();		//**다른패키지 클래스는 import 필요합니다.**
		System.out.println("객체 생성 후 필드값 : " + my1.fields());
		
		//my1.age = 12;		//private 필드 접근 못함
		//my1.name ="모모";		//MyClass1 은 다른 패키지에 있고 필드/메소드 중 default 한정자는 접근못함.오류!!
		my1.point = 12.3;
		//MyClass1.etc = 123;  //오류!!
		//MyClass1.msg = "테스트";		//final 상수이므로 오류 
		System.out.println("객체 생성 후 필드값 저장 : " + my1.fields());
		System.out.println("static 필드 확인----");
		//System.out.println(MyClass1.etc);
		System.out.println(MyClass1.msg);
		
	}

}
