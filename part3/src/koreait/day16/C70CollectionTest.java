package koreait.day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C70CollectionTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		
		list.add("hello");
		list.add("java");
		list.add("hello");
		list.add("python");
		list.add(new String("java"));
		
		set.add("hello");
		set.add("java");
		set.add("hello");
		set.add("python");
		set.add(new String("java"));		//비교(equals 메소드 결과) 결과가 true이면 중복된 값
		
		System.out.println("::리스트와 Set 비교::");
		System.out.println("중요한 차이점1 : 중복된 값이 없다.");
		System.out.println("리스트 크기 : " + list.size());
		System.out.println("Set 크기 : " + set.size());   
		
		System.out.println("\n::확인::");
		System.out.println("리스트" + list);			//add 한 순서대로 
		System.out.println("Set" + set);			//순서가 무작위 : 인덱스사용 for문 사용못하고 iterator 사용합니다.
		
		System.out.println("\n중요한 차이점2 : 인덱스(순서) 없다.");
		Iterator<String> it = set.iterator();		//반복자 :무작위로 데이터요소에 접근해서 가져오기
													// set으로 Iterator 인터페이스 구현체(객체)를 생성.
		System.out.println("반복자로 데이터요소 가져오기");
		while(it.hasNext()) {   //반복자가 가져올 데이터가 있으면 `참`
			System.out.println(it.next());    //반복자로 데이터 가져오기
		}
		
		//향상된 for문이 iterator 역할
		System.out.println("\n향상된 for문으로 Set 접근");
		for(String s : set)
			System.out.println(s);
		
	}

}





