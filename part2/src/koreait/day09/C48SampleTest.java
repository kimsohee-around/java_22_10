package koreait.day09;

public class C48SampleTest {

	public static void main(String[] args) {
		// Sample 클래스의 객체를 사용하는 테스트
		
		//2개의 객체(인스턴스)를 생성
		Sample sam1 = new Sample();   //Sample()는 생성자메소드 실행
		Sample sam2 = new Sample();
		
		//각 객체의 데이터(인스턴스 필드)를 저장합니다.
		sam1.a = 10;    sam1.b="java";
		sam2.a = 20;	sam2.b="python";
		
		//각 객체의 필드를 이용하는 인스턴스 메소드를 실행합니다.
		sam1.m1();
		sam2.m1();
		
		//static 메소드는 객체의 데이터는 사용하지 않는 객체와는 상관이없는 메소드 입니다.
		//static 메소드가 사용하는 전역변수는 객체와 상관없는 static 변수만 가능합니다.
		sam1.m2();			//static 메소드에는 적합하지 않은 실행 형식
		sam2.m2();
		Sample.m2();		//static 메소드는 클래스 이름으로 실행합니다.
		
		
	}

}
