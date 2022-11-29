package koreait.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C71MapTest {

	public static void main(String[] args) {
		//Map을 사용하지 않을 경우 - 식당의 메뉴판을 저장(2개의 배열이 순서가 맞도록 합니다.)
		String[] title = {"스테이크","백반","김밥","스파게티","삼계탕"};    //메뉴는 문자열이 같은 것이 없도록 합니다.
		int[] price = {12000,8000,4000,11000,10000};
		
		System.out.println("::우리 식당 가격표::");
		for(int i=0;i<title.length;i++)
			System.out.println(title[i] + " - " + price[i] + " 원");
		
		
		System.out.println("\n::Map으로 만든 우리 식당 가격표::");
		Map<String,Integer> menus = new HashMap<>();
		
		menus.put("스테이크", 12000);		//데이터 추가 메소드 : put(key,value)
		menus.put("백반", 8000);
		menus.put("김밥", 4000);
		menus.put("스파게티", 11000);
		menus.put("삼계탕", 10000);
		menus.put("백반", 9900);			//key 값의 중복이 없어야함. value가 변경(덮어쓰기)
		
		System.out.println(menus);
		System.out.println("메뉴 개수 : "+menus.size());
		
		System.out.println("\n1.Map 장점 : key를 이용한 검색이 됩니다.");
		System.out.println("'스테이크'의 가격은?" + menus.get("스테이크"));    //데이터 가져오기 - get(key)
		System.out.println("'삼계탕'의 가격은?" + menus.get("삼계탕"));
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 입력하세요. >>> ");
		String key = sc.nextLine();
		System.out.println("가격 : " + menus.get(key) +"원 입니다.");		//key 를 알아야 value 를 가져올수 있습니다.
													//get(key) : key가 존재하지 않는 값이면 value는 null
		System.out.println("\n2.Map에 저장된 전체 데이터 요소 출력");
		//1. key-value 한쌍을 Entry 라고 합니다.Entry로 Set 만들기    2. key 값만 추출해서 Set을 만들어서 합니다.
		//map의 key는 Set과 동일한 특징-중복값이 없다.
		System.out.println("\n1)key값으로 Set 생성하기");
		Set<String> keySet = menus.keySet();			//2.Set의 제너릭타입은 key의 타입과 동일하게 합니다.
		for(String menu : keySet)			//순서는 없다.(랜덤)
			System.out.println( menu + " : " + menus.get(menu) + " 원");
		
		System.out.println("\n2)Entry Set 생성하기-천천히 이해해도 됩니다.");	
		//map 의 Key-Value 한쌍의 Entry로 Set 생성 메소드 : entrySet()
		for(Map.Entry<String, Integer> entry : menus.entrySet()) 
			System.out.println(entry + ", key:" + entry.getKey() + ", value:" + entry.getValue());
		//getKey,getValue메소드는 Entry 타입일때만 사용할 수 있는 메소드입니다.
		
		System.out.println("\n3)Map의 values 는 중복값이 가능하므로 set으로 변경하는 메소드 없습니다.");
		System.out.println(menus.values());
		
		System.out.println("\nMap 의 데이터 요소 삭제");
		System.out.println("-key 값 일치하는 것 삭제");
		menus.remove("김밥");
		menus.remove("피자");		//없는 key값은 결과에 변화가 없음.
		System.out.println("결과 확인 : " + menus);
		
		System.out.println("-key와 value 값 모두 일치하는 것 삭제");
		menus.remove("스파게티",10000);
		menus.remove("삼계탕",10000);
		System.out.println("결과 확인 : " + menus);
		
	}

}











