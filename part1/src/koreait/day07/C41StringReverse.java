package koreait.day07;

import java.util.Scanner;

//예제 : 입력한 문자열을 거꾸로 만들기  hello 를 olleh 
public class C41StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 >>> ");
		String test = sc.nextLine();
		
		//1. 배열 사용하지 않기
		String reverse="";
		System.out.println("\n::배열 사용하지 않고 reverse");
		for(int i=test.length()-1;i>=0;i--) {
			reverse += test.charAt(i);
		}
		
		System.out.println("reverse : " + reverse);
		
		System.out.println("\n::배열 사용하여 reverse");
		char[] result = new char[10];
		for(int i=0;i<test.length();i++) {
			int index= test.length()-1-i;  //?	"h(0)e(1)l(2)l(3)o(4)"  'o' -> result[0]
			result[i]=test.charAt(index);
		}
		System.out.print("reverse : ");
		System.out.println(result);		//출력할때는 자동으로 char 배열이 문자열로 변환
		System.out.print("reverse : " + String.valueOf(result));
							//문자열과 + 로 연결될 때는 직접 문자열로 변환해야합니다.
		
		
		//프로그래머스 : 시저암호
		/*
		hello    3
		khoor   암호메시지를 아군에게
		        받은사람은 -3
		*/
	}

}




