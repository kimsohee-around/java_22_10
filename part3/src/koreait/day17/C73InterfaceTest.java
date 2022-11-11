package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class C73InterfaceTest {

	public static void main(String[] args) {
		Runnable runs = new Dog();		
		//인터페이스 구현체는 기능이 핵심이므로 인터페이스 타입으로 선언 -> 메소드의 매개변수 또는 리턴 타입 (다형성)
		
		Dog dog = new Dog();
		People peo = new People();
		
		Runnable run2 = peo;
		
		System.out.println(runs.run());
		System.out.println(run2.run());
		
		System.out.println("Thinkable 구현체 생성 - AI 객체");
		Thinkable ai = new AI();
		System.out.println(ai.calculate(2222222, 3333333));
		ai.think();
		
		System.out.println("\nThinkable 구현체 생성 - People 객체");
		Thinkable peo2 = new People();
		peo2.calculate(2222222, 3333333);
		peo2.calculate(2, 3);
		peo2.think();
		
	}
	
	
	public static void test(List<String> list) {		//매개변수 타입이 인터페이스
		//구현체는 다양하고 그에 따라서 동일한 메소드이지만 처리 내용이 다르기도 합니다.- 다형성
	}
	
	public static List<String> list(){				//리턴 타입이 인터페이스
		
		return new ArrayList<>();
	}

}
