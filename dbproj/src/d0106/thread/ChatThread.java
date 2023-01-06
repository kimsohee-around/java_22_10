package d0106.thread;
//Thread 클래스 : 스레드 생성,관리,동작 등을 제공
public class ChatThread extends Thread{
	
	
	//스레드가 할일은 run() 메소드 재정의
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
				System.out.println("채팅중입니다.");
				try {
					Thread.sleep(500);    //현재 스레드를 0.5초(500ms)동안 중지
				} catch (InterruptedException e) {}  
		
		}
		
	}
}
