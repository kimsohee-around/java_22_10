package koreait.day07;

import java.util.Scanner;

public class C40StringArray {

	public static void main(String[] args) {
		
		String message = "hi java";
		String[] english = {"continue","break","public","static","dynamic","break"};   //String 배열
		//**참조타입의 배열은 배열 요소에 객체의 참조값을 저장합니다.**
		System.out.println(message);	//문자열 "hi java" 출력
		System.out.println(english);		//[Ljava.lang.String@해시코드값
		
		System.out.println(message.length());	//문자열 "hi java" 길이
		System.out.println(english.length);		//배열의 크기(개수)
		
		System.out.println(english[0]);		//참조하는 문자열 continue 출력
		System.out.println(english[1]);
		System.out.println(english[2]);
		
		System.out.println(english[0].hashCode());	//배열 인덱스 0번이 참조하는 문자열 객체 해시코드값 출력
		System.out.println(english[1].hashCode());
		System.out.println(english[5].hashCode());
		
		//continue : 길이 8
		//break : 길이 5   
		//english 배열의 참조하는 모든 문자열과 길이 출력
		for(int i=0;i<english.length;i++)
			System.out.println(english[i] + ": 길이 " + english[i].length());
		
		String[] koreans = {"계속하다.","멈추다","공공의","정적인","동적인","멈추다"};
		
		for(int i=0;i<english.length;i++)
			System.out.println(english[i] + ":" + koreans[i]);
		
		
		System.out.println("\n::내가 입력한 문자열이 있나요?::");
		System.out.print("찾을 단어 입력 >>> ");
		Scanner sc = new Scanner(System.in);
		String find = sc.nextLine();
		boolean result = false;
		//입력받은 문자열이 english 에 있나요? - 참 또는 거짓으로 알려주세요.
		//A.equals(B) 로 문자열 비교 :  A,B 는 변수 
		int i;
		for(i=0;i<english.length;i++) { 
			if(english[i].equals(find)) {
				result = true;
				//System.out.println("한글 뜻 : " + koreans[i]);
				break;
			}	
		}
		System.out.println("검색 결과 : " + result);
		System.out.println("검색 결과 : " + (result? "있습니다.":"없습니다."));
		if(result)   //검색결과가 '참'일때만 i값 인덱스 사용이 가능. 검색결과가 '거짓'일때는 인덱스값 오류 
			System.out.println("한글 뜻 : " + koreans[i]);
	}
}








