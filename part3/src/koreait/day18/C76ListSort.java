package koreait.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C76ListSort {
//List 에 sort 메소드가 있어서 List 의 데이터요소를 정렬할 수 있습니다.
//Member 타입의 List 를 정렬 -> 인터페이스 와 익명 구현 클래스	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("twice");
		list.add("wondergirls");
		list.add("bravegirls");
		list.add("ohmygirls");
		list.add("nujeans");
		list.add("viviz");
		
		System.out.println("리스트 정렬하기 전-인덱스 순서대로 나열");
		System.out.println(list);
		//list에 저장된 문자열 데이터요소를 사전순서대로(오름차순) 정렬
		list.sort(null);    
		list.sort(Comparator.reverseOrder());   //내림차순 : 비교자를 역순으로 만들어서 전달.
		System.out.println("리스트 정렬한 후");
		System.out.println(list);
		
		//리스트.sort(null) 메소드의 인자가 null 일떄 : Integer,Double,.., String 
		
		List<Member> mlist = new ArrayList<Member>();
		
		mlist.add(new Member(1, "사나", 23));
		mlist.add(new Member(2, "나연", 25));
		mlist.add(new Member(3, "모모", 27));
		mlist.add(new Member(4, "다현", 24));
		mlist.add(new Member(5, "쯔위", 26));
		System.out.println("\n리스트 정렬하기 전-인덱스 순서대로 나열");
		System.out.println(mlist.toString()); 
		
//		mlist.sort(null);   //mlist 의 데이터요소는 타입이 Member - 정렬 기준이 필요.(오류)
 
		//Member 타입 리스트를 정렬하기 위한 Comparator(비교자) 구현 : 정렬 기준 필드를 지정.
		//sort 의 비교 기준을 알려주면 sort 메소드가 그에 따라 데이터요소를 교환하여 순서 정렬합니다.
		//       비교 기준을 전달하기 위한 인터페이스가 Comparator 입니다.
		Comparator<Member> ascName = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {  //리스트에 인접한 2개의 요소 o1,o2를 비교
				return o1.getName().compareTo(o2.getName());   //o1 < o2 : 오름차순
			}
			
		};
		
		Comparator<Member> decName = new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o2.getName().compareTo(o1.getName());    //o1 > o2 : 내림차순
			}
		};
		
		System.out.println("Comparator 익명 구현 클래스로 sort");
		mlist.sort(ascName);
		System.out.println("\n리스트 정렬한 후 - 이름 오름차순");
		System.out.println(mlist.toString()); 
		mlist.sort(decName);
		System.out.println("\n리스트 정렬한 후 - 이름 내림차순");
		System.out.println(mlist.toString()); 
		
		//나이 내림차순 decAge , id 오름차순 ascId 를 구현해서 정렬하기.
		
		Comparator<Member> decAge = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				
				return o2.getAge()-o1.getAge();   //기본형 타입은 뺄셈으로 해도 됩니다.
			}
		};
		mlist.sort(decAge);
		System.out.println("\n리스트 정렬한 후 - 나이 내림차순");
		System.out.println(mlist.toString()); 
		
		Comparator<Member> ascId = new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {
			//	Integer id1 = o1.getId(); Integer id2 = o2.getId();
			//	return id1.compareTo(id2);
				return o1.getId()-o2.getId();   //기본형 타입은 뺄셈으로 해도 됩니다.
			}
		};
		
		mlist.sort(ascId);
		System.out.println("\n리스트 정렬한 후 - id 오름차순");
		System.out.println(mlist.toString()); 
		
		mlist.sort(new Comparator<Member>() {
			
			@Override
			public int compare(Member o1, Member o2) {
				Integer id1 = o1.getId(); Integer id2 = o2.getId();
				return id2.compareTo(id1);
				
			}
		});
		
		System.out.println("\n리스트 정렬한 후 - id 내림차순");
		System.out.println(mlist.toString()); 
	}

}







