package koreait.day06;

public class C30ForWhileTest {
	//for와 while 비교
	public static void main(String[] args) {

		for(int i=0;i<5;i++)
			System.out.println("hello("+i+")");
		
		
		//위의 for문을 while문으로 변경하면
		int i=0;		//loop counter 초기식
		while(i<5) {		//조건식
			System.out.println("hello("+i+")");
			i++;		//증감식
		}
		
		//예시:1부터 100까지 더하기
		System.out.println("\n::1부터 100까지 덧셈하기::for");
		int sum=0;
		for(int k=1;k<=100;k++) {
			sum+=k;		//sum=sum+k  -->누적합
			System.out.println("k="+k+",sum="+sum);
		}
		
		System.out.println("\n::1부터 100까지 덧셈하기::while");
		//while문으로 변경하기
		int k=1;
		sum=0;		//다시 초기화
		while(k<=100) {
			sum+=k;
			System.out.println("k="+k+",sum="+sum);
			k++;
		}
		
		System.out.println("\n::1부터 100까지 덧셈하기::while-2");
		k=1; sum=0;
		while(k<=100)
			sum+=k++;		//sum=sum+k 실행하고 k++
		
		System.out.println("sum="+sum);
		
	}

}









