package koreait.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C86FileWrite {
//파일에 데이터를 저장합니다. (파일출력)
//나중에 해보기 :  [입력]키보드 -> [출력]파일	
	public static void main(String[] args) {
		String filename = "D:\\iclass1020\\파일테스트.txt";	
		File file = new File(filename);
		
		PrintWriter pw = null;
		try {
			pw =new PrintWriter(file);
			pw.println("hello");
			pw.println("자바");
			pw.print(123);
			pw.print("\t456");
		}catch (FileNotFoundException e) {
			System.out.println("파일 출력에 오류가 발생했습니다.");
			System.out.println("원일 : " + e.getMessage());
		}
	
		pw.close();
	}

}
