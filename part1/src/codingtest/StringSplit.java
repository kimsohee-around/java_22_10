package codingtest;

import java.util.Arrays;

public class StringSplit {
	public static void main(String[] args) {
	
	   String[] result = solution("abcdef123", 3);   //abc def 123
	   System.out.println(Arrays.toString(result));

	   result = solution("abc1Addfggg4556b", 6);     //abc1Ad dfggg4   556b
	                                                 //0    5 6    11 12
	   System.out.println(Arrays.toString(result));
	   
	   result = solution("abc1Addfggg4556bhel", 6);
	   System.out.println(Arrays.toString(result));
	}
	

	   public static String[] solution(String my_str, int n) {
		   //int size = my_str.length() % n > 0 ? my_str.length() / n +1: my_str.length() / n ;

		   int strlen =my_str.length();
		   System.out.println(strlen);

		   int size = my_str.length()/n;
	       size = my_str.length() % n > 0 ? size+1:size;
	        
	        String[] answer = new String[size];
	        for(int i=0;i<size;i++) {
	        	int begin = i*n;
	        	int end = begin+n;
	        	System.out.println("i="+i + ",begin="+begin +",end="+end);
	          	answer[i]=end>strlen?my_str.substring(begin):my_str.substring(begin, end);
	        	//answer[i]=my_str.substring(begin, end);
	           	//substring으로 일부분 추출된 문자열을 answer 배열이 참조합니다.
	        }
	        return answer;
	    }
	//"abc1Addfggg4556b" n=6 일때 
	//size =?  strlen=?   
	   
}




