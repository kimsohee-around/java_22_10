package koreait.day14;

public class C61ParentChild {

	public static void main(String[] args) {
		//1. 부모클래스에 기본생성자만 동작할때
		//Child ch1 = new Child();		  
		//super() 실행하고 Child() 순서로 생성자 메소드를 실행.
		
		//2. 부모클래스에 커스텀생성자만 정의했을때(기본생성자는 동작 안하므로)
		Child ch2 = new Child(13);
		System.out.println("Child 객체 생성 완료!");
		System.out.println("test 필드 값 : " + ch2.getTest());
	}

}
