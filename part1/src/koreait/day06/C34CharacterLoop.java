package koreait.day06;

public class C34CharacterLoop {

	//문자형 데이터에 대한 반복
	public static void main(String[] args) {
		
		for(char ch='A';ch<='Z';ch++)
			System.out.println(ch);

		System.out.println("알파벳 개수 :" + ('Z'-'A'+1));   //개수:마지막값-처음값+1
		
		for(char ch='가';ch<='힣';ch++)
			System.out.println(ch);
		
		System.out.println("한글 UTF-8 문자 개수 :" + ('힣'-'가'+1));
		
		//한줄에 10개씩 출력하기
		System.out.println("::아스키코드값 출력문자 전체::");  //아스키코드는 출력문자 시작이 공백문자(코드값32) ,마지막은 ~ 문자(코드값 127)
		char start=' ';
		System.out.println("테스트 : " + ('~'-' '+1));
		for(int i=0;i<('~'-' '+1);i++) {
			if(i!=0 && i%10==0) System.out.println();
			System.out.print((char)(start+i) + " ");    //?
		}
		
		
		//한글문자 한줄에 10개씩
		System.out.println("::한글 문자 UTF-8 전체::"); 
		
		//한줄 10개씩 출력을 while 문으로도 해보세요.
		System.out.println("::아스키코드값 출력문자 전체::while"); 
		start='가';
		int i=0;
		while(i<('힣'-'가'+1)) {
			System.out.print((char)(start+i++) + " ");
			if(i%10==0) System.out.println();
		}
		
	}

}





