package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C38RefTypeTest {

	public static void main(String[] args) {

		//아래는 모두 참조타입 변수입니다.
		//1.배열 객체
		byte[] b= new byte[5];
		short[] s= new short[5];
		int[] i= new int[5];
		long[] lo= new long[5];
		float[] f= new float[5];
		double[] d= new double[5];
		char[] c = new char[5];			//char배열은 모으면 문자열 
		
		//2.클래스로 만든 객체
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String str="";
		String[] st = new String[5];		//문자열 5개의 참조값 저장하는 배열
		Random[] rs = new Random[5];		//모든 클래스 타입으로 배열 생성 가능
		
		//참조타입 변수를 출력해봅시다.
		System.out.println(b);			//@뒤의 해시코드는 32bit - 16진수 8자리
		System.out.println(s);
		System.out.println(i);
		System.out.println(lo);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);	//문자열 형태로 출력
		System.out.println(r);	//클래스타입 변수는 @앞에 패키지명.클래스명
		System.out.println(sc);   //Scanner클래스는 다른정보를 추가로 제공하는 문자열로 변형된 것.
		System.out.println(str); //문자열 형태로 출력
		System.out.println(st); // [L로 시작하면 클래스타입의 배열
		
		c[0]='a';
		c[1]='b';
		System.out.println(c);
		
		
		
	}

}
