package koreait.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class C66ListLotto {

	public static void main(String[] args) {

		//1. ball에 번호 부여하기
		List<Integer> balls = new ArrayList<>();
		for(int i=0;i<45;i++)  
			balls.add(i+1);   //balls리스트 인덱스 0~44 , 데이터요소 1~45
		
		System.out.println(":::초기 ball 번호 확인:::");
		//System.out.println(balls);
		intListPrint(balls);
		//2. 추첨된 번호 저장 : 배열 또는 리스트
		int[] numbers = new int[6];
		
		
		//3. ball 뽑기
		Random r = new Random();
		int k;
		for(int cnt=0;cnt<6;cnt++) {  //cnt=1 , 리스트 size : 44
									  //cnt=2 ,            : 43
			k=r.nextInt(45-cnt);	//초기cnt=0일때 0~44 : balls의 인덱스가 랜덤값으로 정해집니다.
			System.out.println("\nk=" + k + ", 값=" + balls.get(k));
			numbers[cnt]=balls.get(k);
			balls.remove(k);		// 추첨된 번호 제거
			intListPrint(balls);
			//System.out.println(":::현재 ball 번호 확인:::");
			//System.out.println(balls);
		}
		
		System.out.println("최종 추첨 번호");
		Arrays.sort(numbers);		//배열 요소 정렬
		System.out.println(Arrays.toString(numbers));
	}

	public static void intListPrint(List<Integer> list) {
		System.out.print("index : ");
		for (int i=0;i<45;i++)
			System.out.print(String.format("%3d", i));
		
		System.out.print("\nvalue : ");
		for (int i=0;i<list.size();i++)
			System.out.print(String.format("%3d", list.get(i)));
	}
	
}






