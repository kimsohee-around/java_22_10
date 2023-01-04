package koreait.day04;

public class C21StringTest {
	//문자열 데이터 처리 테스트
	public static void main(String[] args) {
		//변수 선언
		String message ="hello java!";
		String name="kim";
		String name2="kim";
		String name3="lee";
		String name4=new String("kim");		//새로운 문자열 객체를 생성합니다.: new 연산
		
		System.out.println("문자열 변수는 참조형 : == 비교는 참조값(주소) 비교입니다.");
		System.out.println("name == name2 ? " + (name==name2));    //true
		System.out.println("name == name4 ? " + (name==name4));		//false
		System.out.println("name2 == name4 ? " + (name2==name4));	//false
		
		System.out.println("문자열 변수는 참조형 : 문자열 자체를 비교하려면 메소드로 합니다.");
		System.out.println("name과 name2 문자열 비교?" + name.equals(name2));  //true
		System.out.println("name과 name4 문자열 비교?" + name.equals(name4));  //true
		System.out.println("name2과 name4 문자열 비교?" + name2.equals(name4));   //true
		
		String name5=name3;
		name3="momo";
		System.out.println("\nString 클래스의 메소드 맛보기");
		System.out.println("name 문자열 길이 : " + name.length());			//3
		System.out.println("name2 문자열 길이 : " + name2.length());		//3
		System.out.println("변경된 name3 문자열 : " + name3);
		System.out.println("name3 문자열 길이 : " + name3.length());		//4
		System.out.println("name4 문자열 길이 : " + name4.length());		//3
		System.out.println("message 문자열 길이 : " + message.length());	//11
		
		String name6="lee";				//방법1)
		name6= new String("lee");		//방법2)
		System.out.println("name5=" + name5);		//
		System.out.println("name6=" + name6);		//
		System.out.println("name5 == name6 ? " + (name5==name6));		//1) true  2)false
		
		
	}

}
