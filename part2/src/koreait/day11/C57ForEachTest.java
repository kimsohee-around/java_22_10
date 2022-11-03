package koreait.day11;

import java.util.Arrays;

public class C57ForEachTest {

	public static void main(String[] args) {

		//향상된 for (또는 for each) 형식 테스트
		int[] iarr = {1,2,3,4,5,6};
		String[] sarr = {"break","public","default","while"};
		Member momo = new Member(24, "모모", 120.3);
		Member nayeon = new Member(25, "나연", 124.3);
		Member dahyeon = new Member(27, "다현", 126.3);
		Member[] marr = new Member[3];
		marr[0]=momo; marr[1]=nayeon; marr[2]=dahyeon;
		
		
		for(int i=0;i<sarr.length;i++) 
			System.out.println(sarr[i]);
		
		//위 for문의 카운트 변수 i 를 배열요소 가져올때만 사용한다면
		//향상된 for : 인덱스를 알아서 증가시키면서 배열에 값을 가져옵니다.
		System.out.println("\n향상된 for (sarr) 사용");
		for(String str : sarr)   //for (가져온 배열요소 저장할 변수선언-형식일치 : 배열변수) 
			System.out.println(str);
		
		
		System.out.println("\n향상된 for (iarr) 사용");
		for(int val : iarr)
			System.out.println(val);
		
		System.out.println("\n향상된 for (marr) 사용");
		for(Member m : marr)
			System.out.println(m.print());
		
		
		//정렬 알고리즘 : 배열과 같이 여러개의 값들이 저장되어 있을 때 순서대로(오름차순, 내림차순) 나열.
		System.out.println(Arrays.toString(iarr));
		System.out.println(Arrays.toString(sarr));
		System.out.println(Arrays.toString(marr));		//참조값
		
		//Arrays의 sort 메소드 : 기본형타입,String 배열을 오름차순 정렬
		System.out.println("\nString 배열 오름 차순으로 정렬");
		Arrays.sort(sarr);
		System.out.println(Arrays.toString(sarr));
		
		int[] iarr2 = {67,56,34,66,40,50,60};
		System.out.println("\nint 배열 오름 차순으로 정렬");
		Arrays.sort(iarr2);
		System.out.println(Arrays.toString(iarr2));
		
		
		
	}

}






