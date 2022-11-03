package koreait.day10;

import java.util.Random;

public class GameValueV2 {  //완료되면 구글폴더에 올려주세요 
	
	private String gamer;			//참가자 닉네임
	private int count;				//시도 횟수
	private boolean success;		//맞추기 성공여부
	public static final int MAX=5;		//객체 상관없는(모든객체에 동일한 값) 상수
	//public final String test;		//객체마다 다른값.한번 저장한 값을 변경은 못함.
	
	//1. 모든 필드는 private
	//2. 커스텀 생성자를 추가하기 : 모든 필드 초기화
	//3. getter/setter 메소드 만들기
	//4. public 상수 MAX을 값 5로 선언하기
	
	//커스텀생성자 있으면 기본생성자 사용여부를 직접 정의합니다.기본생성자 정의안하면 사용 못합니다.
	public GameValueV2() {
	}
	
	
	//커스텀 생성자
	public GameValueV2(String gamer,int count,boolean success) {
		this.gamer = gamer;
		this.count=count;
		this.success = success;
	}
	
		
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {    //매개변수가 기본형 : 데이터를 매개변수에 복사(전달)
		this.count = count;
	}
	
	
	public String getGamer() {
		return gamer;
	}
	
	public void setGamer(String gamer) {  //매개변수가 참조형 : 객체의 주소를 매개변수에 복사(전달)
		this.gamer = gamer;
	}
	
	
	public void print() {
		System.out.println("gamer : " + gamer + ",시도횟수 : " + count + ",성공여부:" + success);
	}
	
	public static int makeRandom(int start,int end) {
		Random r = new Random();
		return r.nextInt(end-start+1)+start;
	}
	
}
