package koreait.day18;

import koreait.day17.InterfaceA;
import koreait.day17.MyClassX;

public class C75Anonymous {   //Anonymous : 익명의 (이름이 없는)
//인터페이스의 구현 클래스가 이름이 없는 경우 (1회용)
	public static void main(String[] args) {
		
		//new InterfaceA() 하면서 inner type 내부 타입의 구현 클래스를 정의
		//   -> 객체 생성. ia는 객체를 참조하는 변수명.
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("InterfaceA 의 익명 클래스 구현 methodB");
				return 777+num;
			}
			
			@Override
			public void methodA() {
				System.out.println("InterfaceA 의 익명 클래스 구현 methodA");
				
			}
		};
		
		InterfaceA clx = new MyClassX();		//MyClassX 구현클래스로 객체 생성
		
		
		ia.methodA();
		ia.methodB(111);
		
		clx.methodA();
		clx.methodB(111);
		
	}

}
