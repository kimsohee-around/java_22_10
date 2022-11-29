package koreait.day19;


//함수형 인터페이스 정의
//인터페이스 중에 *추상메소드가 1개인 것*은 다른 프로그래밍 언어에서 사용되는 함수의 형식으로 표현할 수 있습니다.
//자바를 비롯한 다른 프로그래밍 언어에서 '->' 기호로 줄여서 씁니다.(람다식)  가독성, 간결성을 위해서 사용합니다.
//  -> 화살표 왼쪽은 매개변수선언(인자) , 화살표 오른쪽은 메소드 내용.
//자바 API 함수형 인터페이스 : Consumer, Producer, Function ,Predicate,.......
@FunctionalInterface
public interface FunctionEx {
	
	int methodR(int a, int b);		//int형 인자값 2개를 전달받아...처리한 결과를 int 형으로 리턴합니다.
}
