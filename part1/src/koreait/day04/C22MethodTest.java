package koreait.day04;

public class C22MethodTest {

	public static void main(String[] args) {  //main 메소드 실행되기 위해 필요한 메소드
		
			methodA();			//3) 메소드 호출(call) : 사용자가 정의한 메소드 실행
		  //methodB();			//4)번 메소드 실행 오류
		  //methodB(13);
		  //methodB(1.34, 56.7);
		  //결론 : 메소드 인자는 데이터 타입과 개수가 메소드의 형식매개변수와 일치해야 합니다.
			methodB(13,45);		//4)번 메소드 정상 실행 : 13,45값은 실인자값 (인자:argument,전달해야하는 값)
			int a=56,b=98;
			methodB(a,b);		//a,b는 실매개변수(매개변수:parameter)
			//실인자값 또는 실매개변수값이 methodB의 형식매개변수 n1,n2로 전달됩니다.
			
			methodC();			//5)번 메소드 호출(실행) - 리턴값이 있는 메소드는 아래와 같이 사용하게 됩니다.
			System.out.println("methodC 메소드 리턴값 : " + methodC());
			int result = methodC();
			System.out.println("methodC 메소드 리턴값 : " + result);
			
			//6)번 실행 : 실인자값은 임의로 주세요.
			System.out.println("methodD 메소드 실행 : " + methodD(3.14, 12));
			//7)번 실행
			char ch = methodE('가',1);
			System.out.println("methodE 메소드 실행 : " + ch);
			System.out.println("methodE 메소드 실행 : " + methodE('힣', -2));
	}
	

	//새로운 메소드를 만들어봅니다. - 메소드의 형식 알아보기
	public static void methodA() {		//1)메소드이름은 개발자(사용자) 정의 : methodA
		//2)실행할 내용 작성.
		System.out.println("##첫번째 메소드 정의 연습입니다.##");
	}
	
	public static void methodB(int n1, int n2) {		
		//4) 데이터를 전달해서 메소드 실행 내용을 다르게 할수 있습니다. n1,n2는 형식매개변수(값은 아직 없는상태)
		System.out.println("##두번째 메소드 정의 연습입니다.##");
		System.out.println("n1 ="+ n1 + ",n2=" + n2);
		System.out.println("n1+n2=" + (n1+n2));
	}
	// 위 2개 메소드 void : 리턴값이 없다.
	
	//5) 메소드 실행 결과값을 발생시킵니다. -> 결과값은 호출한 곳으로 되돌려줍니다.(return)
	public static int methodC() {		//리턴값의 형식은 int
		System.out.println("##세번째 메소드 정의 연습입니다.- 항상 999를 리턴합니다.##");
		return 999;
	}
	
	//6) 문제 : 실수1개 , 정수1개를 순서대로 인자값 전달받아 곱한 실수 결과값을 리턴해주세요. :methodD
	public static double methodD(double a ,int b) {
		System.out.println("##네번째 메소드 정의 연습입니다.- 계산결과를 리턴합니다.##");
		System.out.println("인자값 a ="+ a + ",b=" + b);
		return a*b;
	}
	
	
	//7) 문제 : 문자형(char) 1개, 정수 1를 순서대로 인자값 전달받아 문자+정수 한 결과의 문자를 리턴해주세요. : methodE
	public static char methodE(char c, int i) {
		System.out.println("##5번째 메소드 정의 연습입니다.- char 타입 계산결과를 리턴합니다.##");
		System.out.println("인자값 c ='"+ c + "',i=" + i);
		return (char)(c+i);
	}
//리턴값 타입이 참조형(클래스 이름,배열)이 될수도 있습니다.
	
	
}
