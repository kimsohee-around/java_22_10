package koreait.day18;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C74MyDictionary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
		Map<String, String> mydic = new TreeMap<String, String>();	
		//이진 검색 가능한 구조로 Map 을 생성:정렬이되는 Map
		
		String sel, eng, kor;
		System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 단어장보기   4. 단어삭제  5.프로그램 끝내기");
		boolean run = true;
		while (run) {		//while 반복안에 switch 로 종료조건을 동작시킬때 break 로 못합니다.-> 변수 사용했습니다.
			System.out.print("선택 ✏->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		//switch문에서 case "문자열" 형식 가능.  if문에서는 sel.equals("1") 로 해야합니다.
				System.out.print("English -> ");
				eng = sc.nextLine();   
				
				System.out.print("한글 뜻 -> ");
				kor = sc.nextLine();
				if(mydic.containsKey(eng)) {
					System.out.println("이미 저장된 단어입니다.한글 뜻 추가합니다.");
					mydic.put(eng, mydic.get(eng)+"/"+kor);
				}else
					mydic.put(eng, kor);		//저장
				break;
			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과 =>" + mydic.get(eng));
				break;
			case "3":
				System.out.println("단어장 전체보기 :" + mydic);
				break;
			case "4":
				System.out.println("단어를 삭제합니다.");
				System.out.print("삭제 단어 English -> ");
				mydic.remove(sc.nextLine());
				break;
			case "5":
				run=false;	
				break;
			default:
				System.out.println("👁‍🗨잘못 입력된 선택입니다.1~5 입력입니다.");
				break;
			}
		}	//while end
		System.out.println("::::  너의 단어장 종료합니다. ::::");
		sc.close();
	}   	
}

//단어저장 : 현재 map 에 있는 단어는 한글뜻을 기존문자열(value)에서 연결하기
//단어삭제 : key 입력 받아 삭제



