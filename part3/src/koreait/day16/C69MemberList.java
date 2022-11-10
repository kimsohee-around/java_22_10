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
		
		list.add(new Member(11,"나연",26)); 	//인덱스 3
		list.add(new Member(12,"다현",29));  //4
		list.add(new Member(13,"쯔위",23));  //5
		list.add(new Member(14,"다현",27));  //6
		
		System.out.println("새로운 회원 등록을 완료했습니다.");
		
		System.out.println("::현재 회원현황::");
		for(Member m : list)
			System.out.print(m);
		System.out.println("(" + list.size() + " 명)");
		
		System.out.println("\n::고객을 검색합니다.::");
		System.out.print("고객명 입력 >>> ");
		String find = sc.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(find)) {
				System.out.println("찾는 고객의 인덱스 : " + i);
				System.out.println("찾는 고객의 다른 정보 : " + list.get(i).toString());	//toString() 생략가능
			}
		}
		//모든 참조타입의 변수가 생략하고 사용하는 메소드가 toString
		System.out.print("\n::고객의 나이가 24세 이하 검색합니다.:: ");
		int age = 24;
		for(int i=0;i<list.size();i++) {
			Member member = list.get(i);
			if(member.getAge() <= 24)
				System.out.println("찾는 고객의 인덱스 : " + i + ",고객정보 : " + member);
			
		}
		
		//배열의 크기는 배열.length (length는 필드)
		//문자열의 길이  문자열.length()     (length는 메소드)
		//리스트의 크기는 리스트.size()
		
		System.out.println("\n:: 고객의 나이가 24세 이하면 money 값을 1000으로 설정::");
		for(int i=0;i<list.size();i++) {
			Member member = list.get(i);
			if(member.getAge() == 24)  member.setMoney(1000);
		}
		
		System.out.println("::현재 회원현황::");
		for(Member m : list)
			System.out.print(m);
		System.out.println("(" + list.size() + " 명)");
	}

}



