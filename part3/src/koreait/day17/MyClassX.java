package koreait.day17;

//InterfaceA의 구현체(구현클래스,실체)   : implements
public class MyClassX implements InterfaceA{

	//InterfaceA 의 추상메소드를 재정의 해야 합니다. : 하나로도 빠지면 오류
	@Override
	public void methodA() {
		System.out.println("MyClassX methodA");
		
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassX methodB :" + num);
		return 999;
	}
	
	
	//InterfaceA 의 디폴트메소드는 필요한 경우 재정의 합니다.

}
