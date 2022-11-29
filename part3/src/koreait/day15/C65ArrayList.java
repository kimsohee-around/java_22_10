package koreait.day15;

import java.util.ArrayList;
import java.util.List;

public class C65ArrayList {

	public static void main(String[] args) {
		int[] datas = {45,23,7,21,19,11,44};		//배열
		
		//ArrayList<Integer> list = new ArrayList<>(); //List 의 대표적인 클래스 ArrayList
		List<Integer> list = new ArrayList<>();   //List 의 대표적인 클래스 ArrayList
		
		//데이터요소를 리스트에 저장 : add 메소드 - 무조건 마지막 인덱스 뒤에 추가
		list.add(45);  list.add(23);  list.add(7);  list.add(21);
		list.add(19);  list.add(11);  list.add(44);
		
		System.out.println("\n1.배열과 리스트 크기");
		System.out.println("배열의 크기 : " + datas.length);    //length는 필드
		System.out.println("리스트의 크기 : " + list.size());		//size() 메소드
		
		System.out.println("\n2.리스트에 데이터요소 삽입");
		list.add(2, 13);	//인덱스 지정한 위치에 삽입.
		System.out.println("인덱스 2번 요소 확인 :" + list.get(2));  //get() 메소드 : 데이터 가져오기
		System.out.println("인덱스 3번 요소 확인 :" + list.get(3));  // 7
		System.out.println("리스트의 크기 : " + list.size());	//8
		
		System.out.println("\n3.ArrayList 데이터요소 모두 출력");
		System.out.println(list);		//ArrayList는 toString() 메소드 재정의

		System.out.println("\n4.ArrayList 데이터요소 제거");
		list.remove(4);		//인덱스 4번 요소 제거
		System.out.println(list);		
		System.out.println("리스트의 크기 : " + list.size());	//7
		list.remove(4);		//인덱스 4번 요소 제거
		System.out.println(list);		
		System.out.println("리스트의 크기 : " + list.size());	//6
		
		System.out.println("\n5.ArrayList에서 데이터요소 찾기");
		System.out.println("1) 찾는 데이터가 존재하는가? - 참,거짓");
		System.out.println("11 있는가?" + list.contains(11));  //true
		System.out.println("19 있는가?" + list.contains(19));  //false
		
		System.out.println("2) 찾는 데이터가 몇번 인덱스인가? - 인덱스는 정수");
		System.out.println("11 인덱스?" + list.indexOf(11));		//
		System.out.println("19 인덱스?" + list.indexOf(19));		//
		
		
	}

}
/*  컬렉션 프레임워크(프레임워크:자주 사용되는 기능들을 구현해 놓은 라이브러리) - java.util 패키지
 *  컬렉션(Collections) : 많은 양의 데이터를 저장하기 위한 자료구조를 구현한 라이브러리(클래스들)
 *  종류 : List(인덱스를 이용해서 순차적인 접근 가능)* 
 *        Set(집합.순서가 없고 값의 중복 허용 안함)
 *        Map(key-value 한쌍으로 데이터를 저장. 순서없고 값의 중복 없음.)*
 *        ㄴ종류에 따라 데이터를 접근(읽기/쓰기)하는 방법에 차이가 있다.
 *  	  ㄴ데이터를 삽입/삭제 등의 알고리즘이 메소드로 구현되어 있습니다.
 *  <> 기호 안에 저장하는 데이터의 타입을 표기 : 제너릭(generic,포괄적인) 타입. 모든 클래스 타입을 컬렉션에 담을 수 있다.
 *       ㄴ 기본형 int ,long,double 은 Wrapper 클래스 Integer,Long,Double 을 사용합니다.
*/