package koreait.day14;

public class Child extends Parent {
//자식클래스 커스텀 생성자
	public Child(int test) {
//2-1)부모생성자를 명시적으로 지정.
//기본으로는 super() 생성자 호출
		super(test);
//위 코딩 없으면 오류.부모에 기본생성자 없으므로.
		System.out.println("Child 커스텀 생성자");	
	}

//자식클래스 기본생성자 - 인자가 없는 형식
	public Child() {
//2-2)부모생성자를 명시적으로 지정.		
		super(3);  //부모의 필드값을 무조건 3으로
//위 코딩 없으면 오류.부모에 기본생성자 없으므로.		
		System.out.println("Child 기본 생성자");
	}
}
