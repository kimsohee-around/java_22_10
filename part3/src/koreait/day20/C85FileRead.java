package koreait.day20;

import java.io.File;  //java.io 패키지는 입출력 관련 기능 클래스들
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C85FileRead {
//파일에서 데이터 읽어옵니다. (파일입력)
//읽어온 내용 출력은 콘솔에 합니다.  [입력]파일 -> [출력]콘솔	
	public static void main(String[] args) {

		String filename = "D:\\iclass1020\\요약.txt";		//읽어올 파일명
		
		//파일객체 생성 - 파일내용 및 파일관련 정보를 객체로 생성합니다.
		File file = new File(filename);
		Scanner fsc =  null;   //new Scanner(file);  //Unhandled(처리되지 않은) exception type FileNotFoundException
											//반드시 Exception을 처리해야하는 명령문
		try {
			
			fsc = new Scanner(file);
			//java.util.Scanner.Scanner(File source) throws FileNotFoundException
			//								ㄴ FileNotFoundException 에 대해 try ~ catch 필수
/*			
			System.out.println(fsc.nextLine());
			System.out.println(fsc.nextLine());
			System.out.println(fsc.nextLine());
			System.out.println(fsc.nextLine());
*/	
			int cnt=0;
			while(fsc.hasNext()) {
				String temp = fsc.nextLine();
				System.out.println(temp);
				cnt++;
			}
			
			System.out.println("----파일 전체 읽기 완료했습니다.("+cnt+"라인)----");
			
		}catch (FileNotFoundException e) {
			System.out.println("파일 읽기에 문제가 있습니다.");
			System.out.println("원인 : " + e.getMessage());
		}
		
		
		fsc.close();
		
	}

}
