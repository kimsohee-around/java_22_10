package koreait.day14;

public class C62ShapeTest {

	public static void main(String[] args) {

//		Circle cir = new Circle();   //오류
		Circle cir1 = new Circle("원",12,13,11);
		Circle cir2 = new Circle("원",15);
		System.out.println("원 넓이 : " + cir1.getArea());
		System.out.println("원 넓이 : " + cir2.getArea());
		
		Triangle tri = new Triangle();
		//같은 패키지 일때만 가능.
		tri.width = 23;
		tri.height=24;
		System.out.println("\n삼각형 넓이 : " + tri.getArea());

		Shape sh1 = new Shape();
		Shape sh2 = new Shape(12, 13);
		System.out.println("\n도형 넓이 : " + sh1.getArea());
		System.out.println("도형 넓이 : " + sh2.getArea());
		
		
		//문자열 생성자 확인 : 엄첨 많은 형식으로 오버로딩
		String str = new String();
		String str1 = new String("hello");
		
	
	}

}
