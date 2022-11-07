package codingtest;

import java.util.Arrays;

public class Count7 {
	public static void main(String[] args) {
		int[] array1 = new int[] { 7, 77, 17 };
		int[] array2 = new int[] { 10, 29 };

		System.out.println("배열 : " + Arrays.toString(array1) + "\n7의 개수 : " + solution1(array1));
		System.out.println("배열 : " + Arrays.toString(array2) + "\n7의 개수 : " + solution1(array2));
		
		System.out.println("배열 : " + Arrays.toString(array1) + "\n7의 개수 : " + solution2(array1));
		System.out.println("배열 : " + Arrays.toString(array2) + "\n7의 개수 : " + solution2(array2));

	}
	public static int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            String temp=String.valueOf(array[i]);
            for(int j=0;j<temp.length();j++)
                if(temp.charAt(j)=='7') answer++;
        }
        return answer;
    }

	// 7의 갯수
	public static int solution1(int[] array) {	//김지연
			int answer = 0;
			for (int a : array) {
				while (a != 0) {
					if (a % 10 == 7)			answer++;
					a /= 10;
				}
			}
			return answer;
	}
		
	public static int solution2(int[] array) {  //오준석
			int answer = 0;
			String num = "";

			for (int i = 0; i < array.length; i++) {
				num += array[i];
//	        	System.out.println(num);
			}
			for (int j = 0; j < num.length(); j++) {
				char ch = num.charAt(j);
//	        	System.out.println(ch);
				if (ch == '7')
					answer++;
			}

			return answer;
	}
}
