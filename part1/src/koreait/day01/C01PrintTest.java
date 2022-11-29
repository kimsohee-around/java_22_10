package koreait.day01;

public class C01PrintTest {		//우리가 만든 클래스
     public static void main(String[] args) {		//main 이라는 이름의 메소드 : 실행프로그램의 메소드
		System.out.println("첫번째 출력문");
	//  System은 클래스 , out은 System클래스의 구성요소, println은 out의 메소드-뒤에 ()	
	//  클래스는 대문자로 시작, 메소드는 소문자로 시작하기	
     
		myinfo();
     }
     
     public static void myinfo() {			//myinfo라는 이름의 메소드: 개발자가 정한 이름
    	 System.out.println("나의 영타수는 40 WPM!!");
     }
}

/*
단축키 : 
저장 : Ctrl+s  , 실행 : Ctrl + F11 , 
한줄 복사 : Ctrl+Alt+위/아래방향키 , 한줄 삭제 : Ctrl+d 
자동 완성 : Ctrl+스페이스바
라인 이동 : Alt + 위/아래방향키

표준 출력 : 프로그램이 처리한 결과를 콘솔(화면)에 출력한다.
표준 입력 : 프로그램이 처리할 데이터를 콘솔(키보드)로 입력받는다.
데이터 입력    ------>     메모리(주기억장치)   --> 결과 출력
           						↑
           						↓
                           CPU(제어,연산)  
주요 입력장치/출력장치 : 콘솔,파일시스템(하드디스크/외부기억장치),네트워크(인터넷)
*/