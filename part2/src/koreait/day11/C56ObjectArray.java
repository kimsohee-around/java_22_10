package koreait.day11;

import java.util.Scanner;

public class C56ObjectArray {

	public static void main(String[] args) {
		Member momo = new Member(24, "모모", 120.3);
		Member nayeon = new Member(25, "나연", 124.3);
		Member dahyeon = new Member(27, "다현", 126.3);
		Member sana = new Member(26, "사나", 125.8);
		Member zuwi = new Member(22, "쯔위", 122.2);
		
		//총 객체가 5개 만들어 졌습니다.
		//-> 출력
		System.out.println("멤버 :" + momo.print());
		System.out.println("멤버 :" + nayeon.print());
		System.out.println("멤버 :" + dahyeon.print());
		System.out.println("멤버 :" + sana.print());
		System.out.println("멤버 :" + zuwi.print());
		
		//String[] strs = new String[5];
		Member[] mbs = new Member[5];
		System.out.println("\n객체 대입하기 전");		//배열요소값은 null
		for(int i=0;i<mbs.length;i++)
//			System.out.println("멤버["+ i + "] :" + mbs[i].print());		//null.print() 는 오류.객체가 없는데 메소드 사용
			System.out.println("멤버["+ i + "] :" + mbs[i]);
		
		mbs[0] = zuwi;			// 객체의 참조(주소)값을 배열요소에 저장
		mbs[1] = momo;	
		mbs[2] = nayeon;
		mbs[3] = sana;
		mbs[4] = dahyeon;		
		System.out.println("객체 대입 완료!!!");
		System.out.println("\n객체 대입한 후");
		for(int i=0;i<mbs.length;i++)
			System.out.println("멤버["+ i + "] :" + mbs[i].print());
		
		for(int i=0;i<mbs.length;i++)
			System.out.println("멤버["+ i + "] :" + mbs[i]);
		
		Member[] ems = new Member[5];
		System.out.println("\n반복문에서 객체생성하고 대입하기");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ems.length;i++) {
			//ems[i]= new Member(24+i, "momo"+i, 120.3+i);				//객체참조값을 배열요소에 대입
			//이름과 나이는 사용자 입력받기. 포인트는 동일한 100 .
			ems[i] = new Member();
			System.out.print("이름 입력 >>> ");
			//String name = sc.nextLine();   
			ems[i].setName(sc.nextLine());    
			System.out.print("나이 입력 >>> ");
			//int age = sc.nextInt();
			//ems[i].setAge(sc.nextInt());   //***
			ems[i].setAge(Integer.parseInt(sc.nextLine()));		
			//엔터처리를 위해 정수입력 Integer.parseInt(sc.nextLine()) 사용
			//ems[i].setName(name);   ems[i].setAge(age); 
			ems[i].setPoint(100);
			//확인 출력
			System.out.println("멤버["+ i + "] :" + ems[i].print());
			//sc.nextLine();				//***로 입력 받을때 엔터처리에 필요
		}
		
	}    //숙제 : 오늘 귀가 후 1시간 해보기 - C54 게임기록을 GameValueV2 객체배열 사용해서 최대5번 기록하고
	     //							    게임이 종료 후 게임 기록 출력하기. 객체배열 카운트 변수 cnt 로 하세요.

}
