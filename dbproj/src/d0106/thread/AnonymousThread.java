package d0106.thread;

public class AnonymousThread {
	
	public static void main(String[] args) {
		
		
		
		//class Thread implements Runnable  에서 Runnable의 추상메소드 run() 을 재정의 합니다.
		Thread t1 = new Thread("uploader") {		//익명 .  스레드 이름변경1)
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("스레드이름 "+this.getName()+" : 파일 업로드 중입니다.");
					
					try {
						Thread.sleep(1000);    //현재 스레드를 1초(1000ms)동안 중지
					} catch (InterruptedException e) {}     
				}
			}
			
		};
		
		Thread t2 = new Thread(new Runnable() {   
			
			@Override
			public void run() {			//Runnable 인터페이스 익명 구현체 안에서는 this.getName() 사용 못함.
				for(int i=0;i<10;i++) {
					System.out.println("스레드이름 "+Thread.currentThread().getName() +" : 채팅중입니다.");
					try {
						Thread.sleep(500);    //현재 스레드를 0.5초(500ms)동안 중지
					} catch (InterruptedException e) {}  
			
				}
			}
		},"chatter");   //스레드 이름변경2)
		
		long start = System.currentTimeMillis();		//시작시간
			t1.start();
			t2.start();
			try {		//main 스레드가 t1,t2 스레드 끝날때까지 기다리게 합니다.
				t1.join();
				t2.join();
			} catch (InterruptedException e) {	}
		
		long end = System.currentTimeMillis();			//종료시간
		System.out.println("총실행시간 : " + (end-start) + " ms");
	}
	
}
