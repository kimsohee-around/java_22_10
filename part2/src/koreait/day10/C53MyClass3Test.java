package koreait.day10;

public class C53MyClass3Test {

//생성자 테스트 : 생성자는 필드값 초기화 하기 위해 사용합니다.	
	public static void main(String[] args) {
		//2.커스텀와 기본생성자 모두 사용하는 경우
		//기본생성자로 객체 생성
		MyClass3 myA = new MyClass3();
		System.out.println("myA : " + myA.fields());
		
		//커스텀생성자로 객체 생성
		MyClass3 myB = new MyClass3(25, "쯔위");
		System.out.println("myB : " + myB.fields());
		
		//3.커스텀 생성자만 사용하는 경우
		MyClass4 my = new MyClass4(27, "나연");
		//MyClass4 myC = new MyClass4();  
		//오류 : 기본생성자 정의가 없어 사용 못함.
		
		
		MyClass2 myy = new MyClass2();
		//1.생성자 정의가 없을 때에는 기본생성자가 컴파일할때 자동으로 포함됩니다.
		
	}

}
