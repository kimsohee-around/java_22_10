package koreait.day18;

import java.util.Arrays;


public class C78_MySort {

	public static void main(String[] args) {
		
		//정렬 알고리즘(오름차순) : 비교와 교환
		int[] nums = {34, 77, 19, 56, 45, 9};
		
		for(int i = 0; i < nums.length; i++) {	//마지막 i = nums.length-2
			for(int k =i+1; k < nums.length; k++) {   //k는 i 보다 뒤에 있는 인덱스
				if(nums[i] > nums[k]) {		// 인덱스 i와 k 위치의 값을 교환하기
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
				}
			}
			System.out.println("중간 과정" + (i+1) + "단계 :" +Arrays.toString(nums));
		}
		
		System.out.println("최종 결과 :" +Arrays.toString(nums));

	}
	
}
