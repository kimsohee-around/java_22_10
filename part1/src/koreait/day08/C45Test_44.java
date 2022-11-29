package koreait.day08;

public class C45Test_44 {

	public static void main(String[] args) {
		
//C44 클래스의 static(정적인) 변수를 사용해 봅시다.
// ㄴ 다른 클래스의 메소드,변수이므로 클래스명.메소드 , 클래스명.변수 형식으로 사용		
		
//static은 객체를 생성하지 않고 사용할 수 있습니다.
		C44GlobalVar.testMethod();		//static 메소드
		C44GlobalVar.val=99999;			//static 변수
		C44GlobalVar.testMethod();
		//C44GlobalVar.num=123;	//오류: 상수입니다.

//static이 아니므로 객체 생성(new 연산)이 필요하여 오류
//		C44GlobalVar.count = 234;  
//		C44GlobalVar.test2();
		
	}
	
}
