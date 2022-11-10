package koreait.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C72TodayVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//오늘의 저녁메뉴 투표 
		// 투표할 메뉴 : 치킨, 곱창, 떡볶이, 불고기, 햄버거 
		String foods = "치킨, 곱창, 떡볶이, 불고기, 햄버거";
		Map<String,Integer> map = new HashMap<>();
		//초기화 : key는 메뉴이름 value 는 투표수는 0 
		map.put("치킨", 0);
		map.put("곱창", 0);
		map.put("떡볶이", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		
		while(true) {
			System.out.println("\n아래 메뉴 중 투표해 주세요. - " + foods);
			System.out.print("입력 (종료는 end) >>> ");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;
			 //없는 메뉴입력하면 방법1) 다시입력하도록 함.  2)투표 항목(key)에 추가하기
			if(!map.containsKey(menu)) {	//containsKey메소드 key값이 존재하면 `참`
				//System.out.println("없는 메뉴입니다. 다시 입력하세요.");	//방법1)
				System.out.println("없는 메뉴입니다.투표항목에 추가합니다.");		//방법2)
				map.put(menu, 1);  foods += "," + menu;
				continue;
			}
			//menu의 현재 투표수value를 key값으로 가져와서 +1한 값으로 변경   
			//int cnt = map.get(menu);	//value 가져오기
			//cnt++;
			map.put(menu, map.get(menu)+1);
			
			System.out.println("=투표 중간 결과=");
			System.out.println(map);
		}
		
		System.out.println("투표를 종료합니다!!!.");
		System.out.println("=투표 최종 결과=");
		System.out.println(map);
		
	}

}
