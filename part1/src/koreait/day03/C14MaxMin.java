package koreait.day03;

public class C14MaxMin {
	
	//3개의 정수값에서 최대값과 최소값 출력하기
	public static void main(String[] args) {

		int n1,n2,n3;
		int max,min;
		n1=9; n2=5; n3=4;
		
		if(n1>n2) { //n1,n2 중 큰값을 max 에 저장
			max=n1;			//max에는 2개 중 큰값
			min=n2;			//min에는 2개 중 작은값
		}else {
			max=n2;
			min=n1;
		}
		
		if(max <n3)	//남은 n3 값이 max 보다 더 크다면
			max=n3;
		//max < n3 이 거짓일 때는 현재 max값이 가장 큰값
		
		if(min >n3)
			min=n3;
		
		System.out.println("n1="+n1+",n2="+n2+",n3="+n3);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}

}
