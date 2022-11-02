package codingtest;

//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
//solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class IsNumeric {
	public static void main(String[] args) {
		
		System.out.println("결과: " + solution1("a234"));		//false
		System.out.println("결과: " + solution1("1234"));		//true
		System.out.println("결과: " + solution1("123"));		//false
		System.out.println("결과: " + solution1("123a"));		//false
		System.out.println("결과: " + solution1("12345"));
		System.out.println("-------------------");
		System.out.println("결과: " + solution2("a234"));
		System.out.println("결과: " + solution2("1234"));
		System.out.println("결과: " + solution2("123"));
		System.out.println("결과: " + solution2("123a"));
		System.out.println("결과: " + solution2("12345"));
		System.out.println("-------------------");
		System.out.println("결과: " + solution3("a234"));
		System.out.println("결과: " + solution3("1234"));
		System.out.println("결과: " + solution3("123"));
		System.out.println("결과: " + solution3("123a"));
		System.out.println("결과: " + solution3("12345"));
		System.out.println("-------------------");
		System.out.println("결과: " + solution0("a234"));
		System.out.println("결과: " + solution0("1234"));
		System.out.println("결과: " + solution0("123"));
		System.out.println("결과: " + solution0("123a"));
		System.out.println("결과: " + solution0("12345"));
	}
	
	public static boolean solution0(String str) {  //
		if(str.length()!=4 && str.length()!=6)  return false;   //길이가 조건에 맞지 않으면 false 리턴하고 메소드 종료 
		for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i) ;
				if(c>='A'&& c<='Z' || c>='a'&& c<='z') {	//알파벳이면 false 리턴하고 메소드 종료 
					return false;		
				}
			}
		
		return true;		//그 외의 경우는 
	}
	
	
	public static boolean solution1(String s) {  //김경준
	      boolean answer = false;
	      if(s.length()==4||s.length()==6){ // 문자열 길이가 4 혹은 6
	          for(int i=0;i<s.length();i++){
	              if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
	                  answer = true;
	              }else{
	                  answer = false;
	                  break;
	              }
	          }
	      }
	      return answer;
	}
	
	public static boolean solution2(String str) {  //김상훈
		boolean answer = true;
		if(str.length()>3&&str.length()<7) {			//조건 오류
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i) ;
				if(c>='A'&& c<='Z' || c>='a'&& c<='z') {
					return false;
				}
			}
			return answer;
		}
		return !answer;
	}
	
	public static boolean solution3(String s) {     //김종훈

		boolean result = true;
		int len = s.length();
		if(len == 4 || len == 6) {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
			}
		}
		else  return false;
		return result;
	}
}



