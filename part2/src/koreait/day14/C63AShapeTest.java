package koreait.day14;

public class C63AShapeTest {

	public static void main(String[] args) {

//		Circle cir = new Circle();   //오류
		ACircle cir1 = new ACircle("원",12,13,11);
		ACircle cir2 = new ACircle("원",15);
		System.out.println("원 넓이 : " + cir1.getArea());
		System.out.println("원 넓이 : " + cir2.getArea());
		
		ATriangle tri = new ATriangle();
		//같은 패키지 일때만 가능.
		tri.width = 23;
		tri.height=24;
		System.out.println("\n삼각형 넓이 : " + tri.getArea());

		//추상클래스 : 객체를 직접생성하지 않는 형태의 클래스 입니다.
		//  자식클래스를 위한 추상메소드 선언하는 역할을 합니다.
		//AShape sh1 = new AShape();
		//AShape sh2 = new AShape(12, 13);
		//System.out.println("\n도형 넓이 : " + sh1.getArea());
		//System.out.println("도형 넓이 : " + sh2.getArea());
		
		
		//문자열 생성자 확인 : 엄첨 많은 형식으로 오버로딩
		String str = new String();
		String str1 = new String("hello");
		
	
	}

}
