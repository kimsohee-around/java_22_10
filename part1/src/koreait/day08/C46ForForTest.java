package koreait.day08;

public class C46ForForTest {

	//반복문의 중첩: for 안에 for, while안에 for ,while안에 while
	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			for(int k=6;k<10;k++) {
				System.out.println("i=" + i + ",k=" + k );
			}
			System.out.println("---------------");
		}
		
	//i=0 , k=6,7,8,9	
	//i=1 , k=6,7,8,9	
	//i=2 , k=6,7,8,9
	//i=3 , k=6,7,8,9	
	//i=4 , k=6,7,8,9	
		System.out.println("\n중첩for문 사용예1) : 2차원 배열");
		int[][] arr = new int[5][4];
		//배열의 배열 : new int[4] 가 5개인 배열입니다.메모리에 저장될때는 열우선으로 순차적으로 저장.
		int[][] arr2 = { {1,2,3,4},    //arr2[i].length 값이 모두 4
				{11,12,13,14},
				{17,27,37,47},
				{21,32,43,54},
				{51,52,53,54}};
		//배열 요소갯수가 다른 경우
		int[][] arr3 = { {1,2,3},     //arr3[i].length 값이 각각 다릅니다.
				{11,12},
				{17,27,37,47},
				{21,32,43,54,66},
				{51,52,53,54}};
		
		//arr2[1][3] 의미는 배열번호 1번, 인덱스값 3  => 값 14
		for(int i=0;i<arr2.length;i++) {   //for(int i=0;i<5;i++)는 배열의 갯수
			for(int j=0;j<arr2[i].length;j++) {   //for(int j=0;j<4;j++) 는 각 배열 요소의 갯수
				System.out.println("i=" + i + ",j=" + j + ",배열값=" + arr2[i][j]);
			}
			System.out.println("---------------");
		}
		
		System.out.println("\n중첩for문 사용예2) : 모양 출력");
		// 별찍기 : 
		//     ★                    i=0   별은 i+1 개 출력해야합니다.
		//     ★★					i=1 
		//     ★★★					i=2
		//     ★★★★				i=3
		//     ★★★★★				i=4
		for(int i=0;i<3;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
	}

}
