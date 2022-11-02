package koreait.day10;

import java.util.Random;

public class GameValueV2 {  //완료되면 구글폴더에 올려주세요 
	
	private String gamer;			//참가자 닉네임
	int count;				//시도 횟수
	boolean success;		//맞추기 성공여부
	
	//1. 모든 필드는 private
	//2. 커스텀 생성자를 추가하기 : 모든 필드 초기화
	//3. getter/setter 메소드 만들기
	//4. public 상수 MAX을 값 5로 선언하기
	
	public String getGamer() {
		return gamer;
	}
	
	public void setGamer(String gamer) {
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
