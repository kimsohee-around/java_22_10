package koreait.day02;

public class C04PrintReview {
	// 출력 복습 + 데이터변수 예제 준비
	public static void main(String[] args) {
		System.out.println("─────────────────────────────────────");
		System.out.println("\t\t수업 정보");
		System.out.println("─────────────────────────────────────");
		System.out.println("1.총 수업시간 : " + 712 + "시간");
		System.out.println("2.수업 일수 : " + 118.4 + "일");
		System.out.println("3.기본 요건 : 영타 속도 " + 30 + " WPM 이상" );
		System.out.println("4.선수 과정 필요? " + false);
		System.out.println("─────────────────────────────────────");
		
		System.out.println("\n변수 활용");
		System.out.println("변수의 사용 : 데이터형식(키워드) 변수이름(개발자정의) = 값");
		//변수의 값들은 사용자입력 또는 데이터베이스,파일들에서 받을수 있습니다.
		int hours=712;					//정수
		double days=118.4;				//실수
		int wpm=30;
		boolean status= false;			//논리형
		System.out.println("─────────────────────────────────────");
		System.out.println("\t\t수업 정보(변수활용)");
		System.out.println("─────────────────────────────────────");
		System.out.println("1.총 수업시간 : " + hours + "시간");
		System.out.println("2.수업 일수 : " + days + "일");
		System.out.println("3.기본 요건 : 영타 속도 " + wpm + " WPM 이상" );
		System.out.println("4.선수 과정 필요? " + status);
		System.out.println("─────────────────────────────────────");
		
		System.out.printf("\nprintf메소드 활용\n");
		System.out.printf("─────────────────────────────────────\n");
		System.out.printf("\t\t수업 정보(printf 활용)\n");
		System.out.printf("1.총 수업시간 : %d 시간\n",hours);
		System.out.printf("2.수업 일수 : %f 일\n",days);			//실수 출력형식은 %f - 소수점 아래 6자리 출력
		System.out.printf("2.수업 일수 : %.2f 일\n",days);			//실수 출력형식은 %f - 소수점 아래 자리수 지정
		System.out.printf("3.기본 요건 : 영타 속도 %d WPM 이상\n",wpm);
		System.out.printf("4.선수 과정 필요? %s \n",status);
		System.out.printf("─────────────────────────────────────\n");
		
		System.out.printf("총 수업시간 : %d (%.1f 일) , 기본요건 : 영타속도 %d WPM 이상 (선수과정 필요? %s)\n",
				hours,days,wpm,status);
		
		System.out.println("총 수업시간 : " + hours + "(" + days +" 일), 기본요건 : 영타속도 " +
				wpm +" WPM 이상 (선수과정 필요? "+ status +")");
		
		
	}

}






