package koreait.day06;

import java.util.Scanner;

public class C33MyBank {
	/*
	 *  GUI : Graphic User Interface (사용자 명령을 아이콘, 메뉴 방식으로 처리) 예시: 윈도우 파일탐색기
	 *  CLI : Command Line Interface (사용자 명령을 텍스로만 처리)	예시:명령프롬프트
	 */
	
	//CLI 방식의 메뉴 선택을 while문으로 연습
	public static void main(String[] args) {

		//연습문제 : 가상은행의 예금/출금/잔고조회 실행
		Scanner sc = new Scanner(System.in);
		boolean run=true;     //반복을 제어할 변수
		int sel;    //선택 사항 저장
		int balance=12000;	//현재 잔고(잔액)

		while(run) {   //초기값은 참
			int money;    //while문 지역변수. 입금액과 출금액 저장
			System.out.println("----------------------------------");
			System.out.println("  1:예금 | 2:출금 | 3:잔고 확인 | 4:종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴 선택 >>> ");
			sel = sc.nextInt();
			
			if(sel==1) {
				
			}else if(sel==2){
				
			}else if(sel==3) {
				
			}else if(sel==4) {
				break;
			}else {
				
			}
			
			switch(sel) {
				case 1:   //예금 처리(예금금액입력->잔액에 더하기) 
					System.out.print("예금액 >");
					money = sc.nextInt();
					balance+=money;  //balance = balance+money;	//?
					System.out.println("고객님의 잔액은" + balance + " 원 입니다");
					break;
				case 2:   
					//출금 처리(출금금액입력-> 잔액보다 작거나 같을 때 처리 (잔액에서 빼기)) ?
					//		잔액보다 출금액이 크면 '잔고부족' 메시지 출력
					System.out.print("출금액 >");
					money = sc.nextInt();
					//
					if(balance<money)
						System.out.println("출금 오류:잔고 부족");
					else
						balance-=money; //balance=balance-money;
					System.out.println("고객님의 잔액은" + balance + " 원 입니다");
					break;
				case 3:   //잔고(balance) 출력
					System.out.print("현재 잔고 : " + balance +" 원 입니다.");
					System.out.println();   //줄바꿈
					break;
				case 4:   //반복 종료
					System.out.println("프로그램을 종료합니다.");
					run=false;	//switch안에서 break 로 while 탈출할수 없습니다. ?
					break;
				default:  //1,2,3,4 외 나머지 값일 때
					System.out.println("잘못된 선택입니다.값은 1~4 만 입력하세요.");
				
			}	//switch end
			
			//while 반복실행부분의 마지막 부분
		} //while end
		
		System.out.println("**** END ****");
		
		
		
	}

}
