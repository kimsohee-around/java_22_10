package koreait.test2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
//작성자 : 김땡땡
//문제와 관련 없는것은 지우세요. 
//코드 옆에 몇번 답인지 작성하세요.(주석)
public class PersonContact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택 기능 👉 [n]새연락처 저장  [s]연락처 찾기   [g]그룹 선택 보기  [a]전체보기  [e]프로그램 끝내기");
		boolean run=true;
		List<Person> contacts = new ArrayList<>();
		System.out.println("내 연락처 프로그램 입니다.");
		//파일 내용을 Person객체 List 로 합니다.
		fileRead(contacts,"D:\\iclass1020\\내연락처.txt");	//저장된 데이터 파일에서 읽어오기
		
		while(run) {
			System.out.print("선택 ✏ ->  ");
			String sel = sc.nextLine();
			String name,mobile; int group;
			switch (sel) {
			case "n":		//1.새 연락처 저장    
				System.out.print("이름 입력 >>> ");
				name = sc.nextLine();
				System.out.print("휴대전화 입력 >>> ");
				mobile = sc.nextLine();
				System.out.print("그룹(1:친구,2:가족,3:비지니스) 선택 >>> ");
				group = Integer.parseInt(sc.nextLine());
				contacts.add(new Person(name, mobile, group));
				break;
				
			case "s":		//연락처 찾기
				System.out.print("검색 이름 >> ");
				name = sc.nextLine();
				int cnt = 0;
				for(Person ps : contacts) 
				  if(name.contains(ps.getName())){
						System.out.println(ps);
						cnt++;
				}
				System.out.println(cnt+"건이 검색되었습니다.");
			case "g":		//그룹 선택보기 -> group 메소드
				System.out.print("찾으실 그룹(1:친구, 2:가족, 3:비지니스) 선택: ");
				int findGroup = Integer.parseInt(sc.nextLine());
				for(Person p : contacts) {
					if(p.getGroup() == findGroup)
						System.out.print(p);
				}
				break;
			case "g2": 
				System.out.print("찾으실 그룹(1:친구, 2:가족, 3:비지니스) 선택: ");
				findGroup = Integer.parseInt(sc.nextLine());
				group(contacts,findGroup);		//메소드로 만든 기능은 재사용이 쉽습니다.
				break;
			case "a":		//전체 보기 -> all 메소드
				System.out.println("👩‍👩‍👧 연락처 전체 목록 👩‍👩");
				//System.out.println(contacts);
				System.out.println(String.format("%-20s\t%-20s", "이름","휴대 전화"));
				System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
				for(Person temp : contacts ) {
					System.out.println(String.format("%-20s\t%-20s", temp.getName(),temp.getMobile()));
				}	
				break;
			case "a2":		//전체보기 메소드 호출
				all(contacts);
				break;
			case "e":
				run = false;		//while 종료
				break;
			default:
				System.out.println("잘못된 입력입니다. 메뉴에 맞는 알파벳을 입력하세요.");
				break;			
			}	//switch end
		}	//while end
		
		System.out.println("::: 연락처 프로그램 실행 종료 합니다. ::: ");
	} //main end
/*
 [*] 다음과 같이 1)~6) 기능을 실행 결과와 같이 처리조건을 파악하여 구현하세요.
- 답과 상관없는 코드와 주석은 작성하지 않도록 하세요.(감점 대상)
1) 새연락처 저장
2) 연락처 찾기
3) 그룹선택 보기
4) 전체 보기
5) 전체 보기 기능을 메소드로 변경하여 구현하기
- all() 메소드 :  인자는 List 타입   *이름 사전순서로 정렬해서 출력*
6) 그룹 선택 보기를 메소드로 변경하여 구현하기
- group() 메소드 :  List 와 int group 을 인자로 받아 해당 그룹만 출력하는 동작 
 */
	private static void all(List<Person> list) {
		System.out.println(String.format("%-20s\t%-20s", "이름","휴대 전화"));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(Person temp : list ) {		//매개변수로 전달받은 리스트를 대상으로 처리
			System.out.println(String.format("%-20s\t%-20s", temp.getName(),temp.getMobile()));
		}	
	}
	
	private static void group(List<Person> list,int group) {
		for(Person p : list) {
			if(p.getGroup() == group)
				System.out.print(p);
		}
	}
	private static void fileRead(List<Person> contacts, String filename) {
		Scanner sc = null;
		File file = new File(filename);
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				String temp=sc.nextLine();
				StringTokenizer stk = new StringTokenizer(temp);
				contacts.add(new Person(stk.nextToken(), 
						stk.nextToken(), 
						Integer.parseInt(stk.nextToken())));
			}
			System.out.println("연락처 가져오기 완료 했습니다.");
		} catch (Exception e) {
			System.out.println("연락처 가져오기 오류 : " + e.getMessage());
		}
				
		sc.close();
		
	}
	
}
