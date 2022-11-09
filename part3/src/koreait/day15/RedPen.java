package koreait.day15;

import java.util.Random;

//초등학교 2학년을 위한 + , - , * , / (arithmetic 산술연산) 문제 생성하기 위한 클래스   
public class RedPen {
	private int n1;		//랜덤
	private int n2;		//랜덤
	private char op;     //  + , - , * , / 중 하나를 저장
	private boolean isCorrect;		//기본값 false. 정답여부
	
	public RedPen(char op) {
		this.op = op;		//op 필드(연산자)만 초기화하는 생성자
	}
	
	public boolean isCorrect() {  
		return isCorrect;
	}
	
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	public void make() {		//n1,n2 필드값을 난수로 생성
		
		Random r = new Random();
		//난수범위 n1은 min1~max1  , n2는 min2~max2  
		int max1=0,min1=0,max2=0,min2=0;
		
		//연산자에 따라 n1,n2 난수 범위를 다르게 합시다.
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11;
			break;
		case '-':    //n1>n2 (요구사항)  
			max1=99;max2=39;min1=50;min2=11;  
			break;
		case '*':   //n2 곱해지는 값을 작게
			max1=77;max2=11;min1=11;min2=3;
			break;
		case '/':   //n1 나눠지는 값을 크게 , n2 값은 작게  
			max1=99;max2=30;min1=50;min2=11;
			break;	
		}	
		n1 = r.nextInt(max1-min1+1)+min1;
		n2 = r.nextInt(max2-min2+1)+min2;
		
	}
	
	public String problem() {		//문제를 문자열로 리턴.
		return n1 + " " + op + " " + n2 + " = ";
	}
	
	public int answer() {		//연산결과 int 리턴
		int result;
		
		switch (op) {
		case '+':
			result = n1+n2;
			break;
		case '-':
			result = n1-n2;
			break;
		case '*':
			result = n1*n2;
			break;
		case '/':
			result = n1/n2;
			break;	
		default:
			result = 99999999;		//잘못된 연산자 result
			System.out.println("잘못된 연산자이므로 처리 못합니다.");
			break;
		}
		return result;
	}
	
}
