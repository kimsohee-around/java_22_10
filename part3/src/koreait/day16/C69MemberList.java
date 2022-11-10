package koreait.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C69MemberList {

	public static void main(String[] args) {

		List<Member> list = new ArrayList<>();
		
		Member test = new Member(1, "사나", 23);
		Member temp = test;			//복습 : temp 와 test가 같은 객체를 참조합니다.
		
		list.add(test);						//Member 객체를 리스트에 추가
		list.add(new Member(2,"모모",24));   //          "
		
		System.out.println("::현재 회원현황::");
		for(Member m : list)
			System.out.print(m);
		System.out.println("(" + list.size() + " 명)");
		
		System.out.println("\n::새로운 회원 등록::");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("id 입력 >>> ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("name 입력 >>> ");
			String name = sc.nextLine();
			System.out.print("age 입력 >>> ");
			int age = Integer.parseInt(sc.nextLine());
			
			temp = new Member(id, name, age);
			list.add(temp);		//temp 와 list에 추가된 객체(인덱스 list.size()-1) 가 동일합니다.
			temp.setMoney(100+list.size());
			
			System.out.print("계속 할까요? (y or n) >>> ");
			
		}while(sc.nextLine().toLowerCase().charAt(0)=='y');	//lowercase : 소문자, uppercase : 대문자
		//yes,Yes,YES,y,Y 등 첫글자가 y 또는 Y 이면 참이 되도록 메소드 활용.
		
		System.out.println("새로운 회원 등록을 완료했습니다.");
		
		System.out.println("::현재 회원현황::");
		for(Member m : list)
			System.out.print(m);
		System.out.println("(" + list.size() + " 명)");
		
		System.out.println("\n::고객을 검색합니다.::");
		
		
	}

}



