package koreait.day17;

public interface Thinkable {		//think : 생각하다.

	void think();
	int calculate(int a, int b);
}

class AI implements Thinkable {
	
	@Override
	public int calculate(int a, int b) {
		System.out.println("계산을 완료했습니다.");
		
		return a+b;
	}
	
	@Override
	public void think() {
		System.out.println("지시한 내용만 생각합니다.");
	}
}