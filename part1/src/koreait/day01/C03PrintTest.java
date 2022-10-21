package koreait.day01;

public class C03PrintTest {

	//출력 형식문자 사용하기 - %d(정수) , %s(문자열) 
	public static void main(String[] args) {
		System.out.println("123456789012345678901234567890123456789012345678901234567890");
		System.out.printf("%12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.4.23",24);
		System.out.printf("%-12s%s%5d\n","nayon","1997.06.14",27);
		
		System.out.printf("%12s %4d.%02d.%02d %5d세\n","dayeon",1998,5,28,25);
		System.out.printf("%-12s %4d.%02d.%02d %5d세\n","momo",1999,11,23,24);
		System.out.printf("%-12s %4d.%2d.%2d %5d세\n","nayon",1997,6,3,27);

		//오류를 확인합시다.
		System.out.println("오류 확인 중....");
		//System.out.printf("%-12d %4d.%2d.%2d %5d세\n","nayon",1997,6,3,27);   //문자열 출력해야하는데 %d. 오류
		System.out.printf("%-12s %4s.%2d.%2d %5d세\n","nayon",1997,6,3,27);  //정수를 알아서 문자열로 변환.오류아님
		System.out.printf("%-12s %4d.%2d.%2d \n","nayon",1997,6,3,27);		//오류 아님.
		//System.out.printf("%-12s %4d.%2d.%2d %5d세\n","nayon",1997,6,3);		//오류 (형식문자개수 > 데이터갯수)
		
		//내일은 데이터형식과 변수
	}

}
