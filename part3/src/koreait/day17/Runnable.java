package koreait.day17;


//인터페이스는 동작(행위) 기능이 핵심.
public interface Runnable {   //run : 달리다
	
	int run();			//추상메소드

}

//인터페이스의 구현체
class Dog implements Runnable {
	
	@Override
	public int run() {
		System.out.println("멍멍이는 달립니다.");
		return 50;
	}
}

class People implements Runnable, Thinkable {
	@Override
	public int run() {
		System.out.println("인간이 달립니다.");
		return 20;
	}
	
	@Override
	public int calculate(int a, int b) {
		
		if(a >1000 && b >1000) {
			System.out.println("숫자가 너무 커서 계산 못합니다.");
			return 0;
		}else {
			System.out.println("계산을 완료했습니다.");
			return a+b;	
		}
	}
	
	@Override
	public void think() {
		System.out.println("오늘 저녁에 뭐할까 생각중...");
		
	}
}
