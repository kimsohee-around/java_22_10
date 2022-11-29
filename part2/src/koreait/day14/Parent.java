package koreait.day14;

public class Parent {
	
	private int test;
	
	//부모클래스에서 커스텀생성자만 있는 예시
	public Parent(int test) {
		System.out.println("Parent 커스텀 생성자");
		this.test = test;
	}
	
	
	public int getTest() {
		return test;
	}
	
	public void setTest(int test) {
		this.test = test;
	}
}
