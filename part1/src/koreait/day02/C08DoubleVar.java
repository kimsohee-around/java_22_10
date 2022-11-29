package koreait.day02;

public class C08DoubleVar {  //변수 : Variable

	public static void main(String[] args) {
		
		//실수는 리터럴 3.14 ,12.567 과 같은 표현은 double
		//float fval = 3.14;		//오류 : 왼쪽 4바이트 = 오른쪽은 8바이트			
		float fval = 3.14F;			//float 형식은 리터럴 기호 F(소문자 f ) 사용
		
		double dval = 3.24;		//실수 기본 타입입니다.
		
		System.out.printf("fval : %f\n",fval);
		System.out.printf("dval : %f\n",dval);

		//정수+실수 , 정수*실수 등과 같이 정수와 실수로 사칙연산을 실행하면 ? 결과는 실수
		double result = dval*3;
		System.out.println("결과 : " + result);	
		
		//실수형식이 정수를 포함할수 있기 때문에 아래 구문은 오류
		//int result2 = dval*3;
		int result2 = (int)(dval*3);   //강제(명시적) 형변환(캐스팅) 연산입니다.
		System.out.println("강제 캐스팅 결과 : " + result2);
		
		//자동형변환 (정수를 실수로)
		result = 4*3;
		System.out.println("자동 캐스팅 결과 : " + result);
		System.out.printf("자동 캐스팅 결과 : %f\n" ,result);
	}

}









