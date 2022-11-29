package koreait.day19;

public class C80CharSequence {

//CharSequence(문자를 나열했다.) 인터페이스 : String , StringBuffer, StringBuilder 가 구현 클래스 	
	public static void main(String[] args) {

		String result = new String();
		System.out.println("초기 result : " + result);
		for(int i=0;i<5;i++) {
			result +=i + "/";    //result =result+ i + "/";
			System.out.println("중간결과 result :"+ result);
			System.out.println("중간결과 result 객체 :"+ Integer.toHexString(result.hashCode()));
		}
		System.out.println("String 객체는 문자열이 변경되면 참조값이 변경됩니다.(불변객체)\n");
		
		StringBuffer sb = new StringBuffer();
		System.out.println("초기 sb : " + sb);
		for(int i=0;i<5;i++) {
			sb.append(i).append(":");
			System.out.println("중간결과 sb :"+ sb);
			System.out.println("중간결과 sb 객체 :"+ Integer.toHexString(sb.hashCode()));
		}
		System.out.println("StringBuffer(StringBuilder) 객체는 객체의 문자열을 변경할 수 있습니다.\n"
				+ "append 메소드는 문자열 추가 등의 조작 메소드가 있습니다.");
		
		//CharSequence(문자를 나열했다.) 인터페이스 테스트
		
		String sample ="abc0/1/2/3/4/xyz";
		System.out.println("java.lang.String.contains(CharSequence s) 확인하기");
		System.out.println("contains(result) : " + sample.contains(result));   //true
		System.out.println("contains(sb) : " + sample.contains(sb));	//false
		
		//StringBuffer 메소드 : append(끝에 추가) ,delete(제거) , insert(중간 삽입) 
		//sb를 String temp 에 대입하기
		String temp = sb.toString();
		System.out.println(temp);
		//StringBuffer 는 멀티스레드에서 사용, StringBuilder 는 일반적 목적
		
	}

}
