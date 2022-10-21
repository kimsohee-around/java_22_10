package koreait.day02;

public class C06IntegerVar {
	//int 와 long : 출력형식문자는 정수는 모두 %d
	public static void main(String[] args) {

		//변수 사용하기 위한 선언
		int iVal;
		long longVal;
		
		//선언 + 초기화
		int inum=900;
		
		// 리터럴 123 ,999 는 기본적으로 int 4바이트 입니다.
		long lnum=999;		//*1)4바이트보다 작은 값은 자동으로 long으로 변환(캐스팅 casting)
		
		//출력 : 메모리에 저장된 값 읽어오기
		//System.out.println("iVal : " + iVal);		//컴파일 오류 : 값이 없는 변수는 사용못합니다.
		longVal = 314;		//대입문 : 값 저장하기			
		System.out.println("longVal : " + longVal);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		
		// 리터럴 123 ,999 는 기본적으로 int 4바이트 입니다.
		//longVal = 2147483648;  //*2)오류 : 4바이트보다 큰 값은 long 리터럴 사용해야함.
		longVal = 2147483648L;		//long 타입 리터럴 L (소문자 가능) 사용
		longVal = 2147483647;
	}

}
