package codingtest;

public class PYCounter {
	public static void main(String[] args) {
		System.out.println("결과 : "  + solution("pPoooyY"));
		System.out.println("결과 : "  + solution("Pyy"));
		
		System.out.println("결과 : "  + solution2("pPoooyY"));
		System.out.println("결과 : "  + solution2("Pyy"));
	}

	public static boolean solution(String s) {   //이가빈
		boolean answer = true;
		int c =0;
		//char o = ' ';
		
		for (int i=0;i<s.length();i++) {
			char o = s.charAt(i);
			if(o == 'p' || o == 'P')
			c++;
			else if(o == 'y' || o =='Y')
			c--;
		}
		if(c != 0) 	return false;
		
		return true;
	}
	
	public static boolean solution2(String s) {	//김창섭
        boolean answer = false;
        int p = 0;  int y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')  p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')  y++;
        }
        if(p - y == 0)  //p==y
            answer =true;
        return answer;
    }
}
