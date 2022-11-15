package koreait.day18;

public class C77_CompareTo {

	public static void main(String[] args) {
//기본형 타입 Wrapper 클래스와 String 클래스에는  compareTo 메소드가 있습니다.:값의 비교
		
		String na ="kim";
		String you="momo";
		String he = "Son";
		na="mi";
		
		//String은 알파벳(사전식)비교    : 대문자 < 소문자
		//compareTo 메소드 : 문자열 2개를 각각 같은위치 문자하나씩 아스키코드값으로 비교     k,l,m
		System.out.println("kim과 momo : " + na.compareTo(you));  //-2(음수) : "kim" < "momo", "kim"- "momo"<0
		System.out.println("kim과 Son : " + na.compareTo(he));	//24(양수)  : "kim" >  "Son"

		int a =12 , b=45;
		System.out.println("a-b :" + (a-b));    //12-45 <0
		//a-b< 0 이라면 a<b , a-b>0 이라면 a>b  와 같이 뺼셈식으로 2개의 값을 비교.(int,double,char...)
		
		Integer aa=12;  
		Integer bb=45;
		System.out.println("12와 45 : " + aa.compareTo(bb));   //-1 : aa<bb
		aa= 90;
		System.out.println("90와 45 : " + aa.compareTo(bb)); 	//1 : aa>bb
		aa=45;
		System.out.println("45와 45 : " + aa.compareTo(bb)); 	//0 : aa==bb
		
		//compareTo 와 같은 비교는 sort (정렬) 에 사용됩니다.
		//	정렬은 오름차순 , 내림 차순 2가지 방법으로 할수 있습니다.
		
		
		
	}

}





