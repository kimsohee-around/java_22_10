package koreait.day09;

import java.util.Random;

public class GameValue {
	
	String gamer;			//참가자 닉네임
	int count;				//시도 횟수
	boolean success;		//맞추기 성공여부
	
	public void print() {
		System.out.println("gamer : " + gamer + ",시도횟수 : " + count + ",성공여부:" + success);
	}
	
	public static int makeRandom(int start,int end) {
		Random r = new Random();
		return r.nextInt(end-start+1)+start;
	}
	
}
