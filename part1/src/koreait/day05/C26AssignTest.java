package koreait.day05;

//assign : 할당,대입
public class C26AssignTest {
	
	public static void main(String[] args) {
		

		//1. 증감연산 : ++ 증가 , -- 감소
		int i=10;
		i=i+1;   	//11
		i++;		//postfix : 접미어 . 후치   //12
		++i;		//prefix : 접두어. 전치	 //13
		System.out.println("i=" +i);		//출력은 13
		
		//증감연산이 전치 또는 후치 각각 실행결과 다른 경우 : 다른 명령문과 함께 쓰일때입니다.
		System.out.println("++i=" + ++i);		//전치: 증가시킨 후 출력   //14
		System.out.println("i++=" + i++);		//후치: 출력한 후 증가    //14 , i는 15
		
		System.out.println("i++=" + i++);		//후치: 출력한 후 증가    //15  , i는 16
		System.out.println("++i=" + ++i);		//전치: 증가시킨 후 출력   //17
		
		int sum=0;
		i=1;
		sum = sum +i;		//sum변수의 값 + i변수의 값을 계산해서 결과는 sum으로 저장(대입,할당)
		System.out.println("sum=" + sum);	//sum=1 , i=1
		
		sum = sum + i++;					//sum=2 , i=2  <- 덧셈 후 ++
		System.out.println("i++ 한 sum=" + sum);	//2 출력
		
		sum = sum + ++i;					//i=3 , sum = 5  <-  ++ 후 덧셈
		System.out.println("++i 한 sum=" + sum);	//5 출력
		
		
		//2. 축약대입(할당)연산
		//또는 i=i+2;
		sum=0;
		sum = sum + 3;		//계산에쓰이는변수와 할당받는 변수가 같을 때 사용
		sum +=3;			//		ㄴ 축약대입
		System.out.println("sum="+sum);		//6
		sum = sum * 11;
		System.out.println("sum="+sum);		//66
		sum *= 11;
		System.out.println("sum="+sum);		//726
		
		i=11;
		i%=2;			// i=i%2;	-> i를 2로 나눈 나머지로 i값이 변경
		System.out.println("i="+i);		//1
		i=11;
		i/=2;			// i=i/2	->			  몫
		System.out.println("i="+i);		//5
		
		sum=0; i=1;
		sum += i;		//sum = sum +i;
		System.out.println("sum="+sum + ",i="+i);
		sum += i++;		//sum = sum + i++;
		System.out.println("sum="+sum + ",i="+i);
		sum += ++i;		//sum = sum + ++i;
		System.out.println("sum="+sum + ",i="+i);
	}
	
}
