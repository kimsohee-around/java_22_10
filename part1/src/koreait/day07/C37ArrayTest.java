package koreait.day07;

public class C37ArrayTest {

	public static void main(String[] args) {
		
		//1.배열선언 형식
		int[] arr1 = {67,45,98,12,45,66,95};	//배열변수명 지정과 초기값 설정
		int[] arr2 = new int[7];				//배열의 크기만 설정. 기본(default) 초기값 있나요? 답: 0
		
		//2.배열 데이터 접근 : 배열 요소의 위치는 인덱스로 지정 - 특정 인덱스(위치)값 1개 접근하기
		System.out.println("\n::배열 요소값 1개 출력(인덱스 3번)::");
		System.out.println("arr1[3] = ?" + arr1[3]);	//12
		System.out.println("arr2[3] = ?" + arr2[3]);	//0
		
		
		System.out.println("\n::배열 요소값 1개 저장(인덱스 3번)::");
		arr1[3]=999;
		arr2[3]=999;
		
		//3.반복문과 배열 : 배열의 모든값 출력예시 - arr1[0] = 67 형식으로 모든 값을 출력하고 싶다. -> for문
		System.out.println("\n::for문으로 배열요소값 출력(arr1)::");
		for(int i=0;i<7;i++)
			System.out.println("arr1["+i+"] = "+ arr1[i]);
		
		System.out.println("\n::for문으로 배열요소값 출력(arr2)::");
		for(int i=0;i<arr2.length;i++)	{	//***배열은 배열요소의 갯수(크기)를 갖고 있는 필드(특징) length 가 있습니다.
			//System.out.printf("arr2[%d] = %d\n",i,arr2[i]);
			String t = String.format("arr2[%d] = %d",i,arr2[i]);	//String클래스의 format 메소드를 이용하여 문자열을 생성
			System.out.println(t);
		}
		
		//
		System.out.println("\n::for문으로 배열요소값 저장");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=i*11;		//i*11 계산값을 배열에 저장
			System.out.println("arr2["+i+"] = "+ arr2[i]);
		}
		
		System.out.println("\n::배열의 크기(바이트)::");
		System.out.println("arr1 배열 : " + arr1.length*Integer.BYTES + "바이트");   //Integer.BYTES 값은 4,  arr1.length는 7
		System.out.println("arr2 배열 : " + arr2.length*Integer.BYTES + "바이트");
		
		System.out.println("\n::long 배열 크기 테스트::");
		long[] larr = new long[7];
		System.out.println("larr 배열 크기(개수) : " + larr.length);
		System.out.println("larr 배열 크기(바이트) : " + larr.length*Long.BYTES +"바이트");
		
		System.out.println("\n::배열변수명 자체는 무슨 의미인가?::");
		System.out.println("배열변수는 참조형 변수-해시코드값이 출력됩니다.");
		System.out.println("해시코드 : 객체의 주소를 이용하여 생성된 정수값.해시코드로 객체를 식별.");
		System.out.println("         해시코드값과 객체의 주소는 연관된 값입니다.");
		System.out.println("arr1 :" + arr1);		//@기호 뒤의 값이 해시코드값-16진수
		System.out.println("arr1 :" + arr1.hashCode());		//10진수값
		System.out.println("arr1 : "+ Integer.toHexString(arr1.hashCode()));  //10진수 ->16진수
		System.out.println("arr2 :" + arr2);
		System.out.println("larr :" + larr);
		
		String message ="hello";
		System.out.println(message.hashCode());

		int x=10;
		System.out.println(x);   //기본형 타입은 해시코드 없습니다.
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
