package koreait.day03;

import java.util.Scanner;

public class C13ConditionOp2 {
	//논리 연산 : and (&&) , or (||) , not(!)
	public static void main(String[] args) {
		
		//and 연산 : true && bval 는 bval , false && bval 은 false
		System.out.println("논리연산 and 테스트---------------");
		System.out.println("and 그리고 연산은 값 \"2개가 모두 참\"일때 결과값이 '참' 입니다.");
		System.out.println("true and true =" + (true && true));
		System.out.println("true and false =" + (true && false));
		System.out.println("false and true =" + (false && true));
		System.out.println("false and false =" + (false && false));
		
		
		//or 연산 : true || bval 는 true , false || bval 은 bval
		System.out.println("논리연산 or 테스트---------------");
		System.out.println("or 또는 연산은 값 \"2개 중 최소 하나가 참\"일때 결과값이 '참' 입니다.");
		System.out.println("true or true =" + (true || true));
		System.out.println("true or false =" + (true || false));
		System.out.println("false or true =" + (false || true));
		System.out.println("false or false =" + (false || false));
		
		//not 연산
		System.out.println("논리연산 not 테스트---------------");
		System.out.println("not 연산은 true는 false, false 는 true 로 변환합니다.");
		System.out.println("not true =" + !true);
		System.out.println("not false =" + !false);
		
		//and,or 연산 특징 테스트
		boolean bval;
		System.out.println("\nand,or 연산 특징 테스트-----------------");
		Scanner sc = new Scanner(System.in);		//리소스 : 하드웨어 등 물리적 자원 -> 사용종료되면 닫기필요
		System.out.print("boolean 값 하나 입력하세요. >> ");
		bval = sc.nextBoolean();		//true 또는 false 입력
		
		System.out.println("and 연산 : true && bval 는 bval , false && bval 은 false");
		System.out.println("true && bval="+(true && bval));
		System.out.println("false && bval="+(false && bval));
		
		System.out.println("\nor 연산 : true || bval 는 true , false || bval 은 bval");
		System.out.println("true || bval="+(true || bval));
		System.out.println("false || bval="+(false || bval));
		
		sc.close();		//콘솔 입력 종료
	}
}


