package koreait.day09;

//이 클래스는 객체를 생성하기 위한 것으로 프로그램 실행하는 main 메소드는 없습니다.
//이 클래스의 목적은 데이터 저장입니다.그 데이터에 대한 동작.
public class Sample {

	//필드 
		//인스턴스 필드
		int a;				
		String b;
		//static 필드
		static int c;
		static final String d="sample";
		
	//생성자
		public Sample() {		//인자가 없는 형식이 기본 생성자(기본생성자 1개만 있을때는 생략 가능)
		
		}
		
	//메소드
		//인스턴스 메소드 : 객체마다 다른 인스턴스필드값을 사용합니다.
		public void m1() {
			System.out.println("::인스턴스 메소드 m1::");
			System.out.println("a="+a +",b="+b);
		}
		//static 메소드
		public static void m2() {
			System.out.println("::static 메소드 m2::");
			//System.out.println("a="+a +",b="+b);
			System.out.println("c="+c +",d="+d);
		}
	
	
	
}
