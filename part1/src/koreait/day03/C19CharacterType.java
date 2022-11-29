package koreait.day03;

public class C19CharacterType {

	public static void main(String[] args) {

		char c1='a';
		char c2 =97;
		char c3='5';		//정수가 아닙니다. 문자입니다.
		char c4='D';
		char c5=' ';
		System.out.println("문자형 char 은 출력하면 문자가 보입니다.");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println("문자형 char을 int로 캐스팅하면 ASCII 아스키코드값이 됩니다.");
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);
		
		// 아스키코드값 소문자 : 97~122  대문자 :65~91 (소문자=대문자+32)
		//           숫자0~9 : 48 ~ 57 기호 : 32~47 ,58~64 ,91~96 ,123~126 
		
		char h1='가';
		char h2='\uac00';    //u로 시작하면 u 는 유니코드 약자 (UTF-8도 유니코드의 종류)
		char h3='힣';
		char h4='\ud7a3';
		System.out.println("\n한글테스트----");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		
		System.out.printf("%d - %x \n",(int)h1,(int)h1);
		System.out.println((int)h2);
		System.out.printf("%d - %x \n",(int)h3,(int)h3);
		System.out.println((int)h4);  //한글표현 문자 갯수 11172개
		
		System.out.println("char 덧셈");
		//char 형으로  덧셈,뺄셈 연산
		//c1 = c1+1;		//오류 : 1은 int 이므로 덧셈결과가 int , c1은 char 이므로 오류
		c1 = (char)(c1+1);	//  ㄴ 강제 캐스팅이 필요합니다.
		System.out.println(c1);
		System.out.println((int)c1);
		c1++;		//c1의 값을 1증가 시킵니다.
		System.out.println(c1);
		System.out.println((int)c1);
		
		
	}

}
