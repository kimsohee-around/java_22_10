package koreait.day19;

import java.util.Random;

public class C81FunctionTest {

	public static void main(String[] args) {
//1. 익명클래스 구현 
		FunctionEx fex = new FunctionEx() {
			
			@Override
			public int methodR(int a, int b) {
				//System.out.print("a*b=");
				System.out.print(String.format("%d * %d = ", a,b));
				return a*b;
			}
			
		};
		
		System.out.println(fex.methodR(11, 33));

//2. 람다식으로 메소드 구현 : 인터페이스의 추상메소드가 1개일 때만
		fex = (int a,int b) -> {
			System.out.print(String.format("%d + %d = ", a,b));
			return a+b;
		};
		
		System.out.println(fex.methodR(234, 987));
		
		// 퀴즈 : a~b (a<b)사이의 랜덤값(난수)를 리턴하도록 람다식으로 메소드 구현.
		fex = (int a, int b) -> {
			System.out.print(String.format("%d ~ %d 난수 발생 : ", a,b));
			Random r = new Random();
			return  r.nextInt(b-a+1)+a;
		};
		
		System.out.println(fex.methodR(11, 66));
		System.out.println(fex.methodR(31, 7));
		
	}

}
