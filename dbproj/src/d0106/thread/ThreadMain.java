package d0106.thread;

public class ThreadMain {

	public static void main(String[] args) {
		//작업 스레드 생성
		Thread t1 = new ChatThread();
		Thread t2 = new FileThread();
		//스레드 시작(스레드에게 일 시키기)
		t1.start();
		t2.start();

	}

}

class FileThread extends Thread {
	
	//스레드가 할일은 run() 메소드 재정의
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("파일 업로드 중입니다.");
			
			try {
				Thread.sleep(1000);    //현재 스레드를 1초(1000ms)동안 중지
			} catch (InterruptedException e) {}     
		}
	}
}
