package koreait.day01;

public class C02PrintTest {

	public static void main(String[] args) {
		System.out.println();			// 이 기호는 주석입니다.- 설명
		System.out.println("오늘 두번째 출력예제");	//문자열 데이터 - 기호 "" 사용
		System.out.println(3.14);		//실수 데이터
		System.out.println(100);		//정수 데이터
		System.out.println(true);		//논리(boolean) 데이터 : true, false
		//+,-,*,/ 연산자를 사용하는 수식
		System.out.println("나의 영타 속도는 " + 40 + " WPM!!");  //문자열과 정수의 + 는 연결연산
		System.out.println(35+67);		//정수와 정수의 + : 덧셈연산
		System.out.println(57+2.3);
		System.out.println(67-11);
		
	// 이스케이프문자(escape sequence) : 백슬래쉬(\) 뒤에 특정기호 또는 출력기능을 갖는 문자를 표현하는 방법
		System.out.println("123456789012345678901234567890");
		System.out.println("-\ta\tb\tc\td\n");	//\t: 탭키, \n : 줄바꿈
		System.out.println("\\ - \" - \'");		//기호문자 역슬래쉬,큰따옴표,작은따옴표 등을 출력하는 방법
		System.out.println("end");
	}
//리터럴(literal) 은 데이터 값 자체 : 3.14, true,100, "오늘"
}
