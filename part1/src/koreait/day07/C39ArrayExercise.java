package koreait.day07;

import java.util.Random;

public class C39ArrayExercise {

	public static void main(String[] args) {
		 int[] koreans = new int[30];
		//0~100 사이의 난수값을 30개 생성해서
		//1.배열에 저장하고 출력하기
		//2.생성된 난수 중에서 80이상인 값만 출력하기
		//3.      "        80이상인 값의 개수 구하기
		
		 Random r = new Random();
		 int count=0;
		 for(int i=0;i<koreans.length;i++) {
			 //1번답
			 koreans[i]=r.nextInt(101);
			 if(koreans[i]>=80)  { //2번답 조건 추가
				 System.out.println(koreans[i]);	//1번답 : 모두 출력
				 count++; //3번답 : 조건이 참일때 카운트
			 } //if end
		 } //for end
		 
		 System.out.println("80이상인 값 개수 : " + count);
		
		 System.out.println("\n::: 난수값의 분포 조사 ::: ");
		 //4. 90~100, 80~89, 70~79, 60~69, 60미만 과 같은 각 범위 값의 개수 구하기
		 int cntA=0,cntB=0,cntC=0,cntD=0,cntF=0;
		 for(int i=0;i<koreans.length;i++) {
			 System.out.println(koreans[i]);
			 if(koreans[i] >= 90)
				 cntA++;
			 else if (koreans[i] >= 80)    // else : 90보다 작다
				 cntB++;
			 else if (koreans[i] >= 70)    // else : 80보다 작다
				 cntC++;
			 else if (koreans[i] >= 60)    // else : 70보다 작다
				 cntD++;
			 else 	 // else : 60보다 작다
				 cntF++;
		 }
		 System.out.println("90~100 개수 : " + cntA);
		 System.out.println("80~89 개수 : " + cntB);
		 System.out.println("70~79 개수 : " + cntC);
		 System.out.println("60~69 개수 : " + cntD);
		 System.out.println("60미만 개수 : " + cntF);
		 
		 System.out.println("\n::: 난수값의 분포 조사(2) ::: ");
		 int[] counts = new int[7];
		 for(int i=0;i<koreans.length;i++) {		//난수값이 100일때, 40미만일때를 제외하고는 수식으로 counts[?수식]++; 할수도 있습니다.
//			 if(koreans[i] >= 90) counts[0]++;
//			 else if(koreans[i] >= 80) 	counts[1]++;
//			 else if(koreans[i] >= 70) 	counts[2]++;
//			 else if(koreans[i] >= 60) 	counts[3]++;
//			 else if(koreans[i] >= 50) 	counts[4]++;
//			 else if(koreans[i] >= 40) 	counts[5]++;
//			 else 	counts[6]++;
//			 
			 //counts[?수식]++; 으로 위의 if문을 바꾸면....
			 //if(koreans[i]==100) counts[0]++;   //이 문장은 아래 조건연산으로 바꿉니다.  
			 if(koreans[i]<40) counts[6]++;
			 else { 
				 int k = 9-koreans[i]/10;		//koreans[i]가 100이면 k=-1 입니다. 
				 counts[k==-1? 0:k]++;      // ? :  연산자는 if문 동작  (조건식)? 참일때:거짓일때	 => 조건연산,삼항연산입니다.
			 //koreans[i] 값이 93, 83,88,75,66, 59, 44...  등등 대입해서 인덱스 값 계산해보세요.
			 // 인덱스는         0,  1, 1, 2, 3, 5,  5.......
			 }	 
// 위의 if~else 대신에 아래 명령도 가능합니다.			 
//			 int k = (9-koreans[i]/10)==-1 ? 0:k ;		//koreans[i]가 100이면 k=-1 입니다. 
//			 k= (k > 6) ? 6: k;			//koreans[i] 값이 39,22,17,5 등등  일때 9-koreans[i]/10 의 값은 6,7,8,9 입니다.
//			 counts[k]++;  
			 
		 }
		 
		 //점수 분포 결과 출력하기
		 System.out.printf("%8s |%8s |%8s |%8s |%8s |%8s |%8s|\n","90~100","80~89","70~79","60~69","50~59","40~49","40점 미만");
		 for(int i=0;i<70;i++) System.out.print("-");
		 System.out.println();
		 for(int i=0;i<counts.length;i++) 
			 //counts배열값 출력
			 System.out.printf("%8d |",counts[i]);
		 
		 System.out.println();
		 for(int i=0;i<counts.length;i++)
			 //	counts배열값으로 백분율 구하고 출력하기 
			 System.out.printf("%8.1f%%|",(double)counts[i]/koreans.length*100);
		 
	}

}
