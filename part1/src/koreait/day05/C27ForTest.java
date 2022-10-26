package koreait.day05;

public class C27ForTest {
	//for 형식 테스트
	public static void main(String[] args) {

		
		//for:같은 명령을 반복해서 실행할 경우. 복붙하지 않고 프로그램으로 제어합니다.
		//    조건식이 필요합니다. 조건식이 참인 동안 반복하도록 합니다.
		
		System.out.println("0.복붙으로 반복하기");
		System.out.println("hello~!");
		System.out.println("hello~!");
		System.out.println("hello~!");
		System.out.println("hello~!");
		System.out.println("hello~!");
		
		System.out.println("1.for문으로 반복하기");
		for(int i=0;i<5;i++)		//for에서 선언된 변수i는 for안에서만 사용.
			//형식: for(변수선언과초기화;조건식;증가 또는 감소수식)
			// for 시작할때 초기값으로 조건식 검사했을때 참이면 아래 명령실행
			System.out.println("hello~!");	
			// 그 후에는 i에대한 증감식 실행결과값으로 조건식이 참이면 실행 -> 조건식이 거짓일때 까지 반복
		
		System.out.println("첫번째 for 끝");
		//System.out.println("i="+i);		//컴파일 오류
		
		System.out.println("2.for문 안에서 변수 활용");
		int j;
		for(j=0;j<5;j++) {		//변수j는 for 끝나고도 사용 가능 
			System.out.println("j="+j);
			System.out.println("Hello!~("+j+")");
		}  // { } 블럭(실행영역) 
		
		System.out.println("두번째 for 끝");
		System.out.println("j="+j);		//j=5
		
		System.out.println("3.for문이 실행명령이 안되는 경우");
		for(int i=0;i>5;i++)
			System.out.println("헬로~!");
		System.out.println("세번째 for 끝");
		
		System.out.println("4.for문이 종료되지 못하는 '무한반복'");
		/*
		for(int i=0;i<5;i--)
			System.out.println("헬로~!!!!!!");
		System.out.println("네번째 for 끝");
		*/
		
		System.out.println("-----break 와 continue----");
		System.out.println("5.break");
		for(int i=1;i<100;i++) {
			//i=0~99 까지 100번 실행
			if(i%11 ==0) break;			//break는 for 탈출(멈춤) :for문 총실행횟수 11번
			System.out.println("i=" +i);
		}
		
		System.out.println("6.continue");
		for(int i=1;i<100;i++) {
			if(i%11==0) continue;		
			//continue는 for문의 증감식 실행으로 계속하기(아래 명령문 실행안함) : for문 총실행횟수 99번
			System.out.println("i=" +i);
		}
		
		System.out.println("-----증감식 테스트 -----");
		for(int i=1;i<=100;i+=3)
			System.out.println("i="+i);
		
		System.out.println();
		for(int i=1;i<=100;i*=3)
			System.out.println("i="+i);
		
		System.out.println("7.변수값이 작아지는 순서로");
		for(int i=10;i>0;i--)
			System.out.println("i="+i);
		
		System.out.println();
		for(int i=50;i>0;i-=5)
			System.out.println("i="+i);
	}

}





