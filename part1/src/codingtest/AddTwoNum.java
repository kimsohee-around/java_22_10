package codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AddTwoNum {

	public static void main(String[] args) {

		int[] arr = {2,1,3,4,1};
		int[] result = soulution(arr);
		System.out.println(Arrays.toString(result));
		
		System.out.println(Arrays.toString(soulution(new int[] {5,0,2,7})));
		
		//Integer 타입을 int 간의 자동 캐스팅 
		int n =3;
		Integer in = new Integer(4);			//deprecated
		Integer in2 = Integer.valueOf(5);		//int 값을 Integer타입으로 대입할때 사용하는 메소드
		Integer in3 =11;		//그냥 이렇게도 가능합니다.(자동캐스팅)

		n=in;	//자동캐스팅
		in=n;
		System.out.println(n);
		System.out.println(in);
		System.out.println(in2);
		System.out.println(in3);
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new TreeSet<Integer>();	//정렬기능이 있는 Set
		
		s1.add(11);s1.add(5); s1.add(15); s1.add(25); s1.add(8);  s1.add(15);
		s2.add(11);s2.add(5); s2.add(15); s2.add(25); s2.add(8);  s2.add(15);
		
		System.out.println("s1 : " + s1);   //무작위
		System.out.println("s2 : " + s2);	//정렬된 상태
		
		System.out.println("s1");
		for(Integer a : s1)			//무작위
			System.out.println(a);
		
		System.out.println("\ns2");
		for(Integer a : s2)			//정렬된 상태로 데이터를 가져옵니다.
			System.out.println(a);
	}

	
	public static int[] soulution (int[] numbers) {
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<numbers.length;i++) 
			for(int j=0;j<numbers.length;j++) 
				if(i != j) set.add(numbers[i]+numbers[j]);
				
		System.out.println("set :" + set );
		
		//컬렉션 타입을 배열 타입으로 변환하는 메소드
		//set.toArray();		//리턴타입이 제너릭타입(클래스)  => int[] 배열이 아니고 Integer[] 배열입니다. 
		//직접 배열선언해서 데이터 복사해주기
		int[] answer = new int[set.size()];
		int i=0;
		for(Integer a: set)
			answer[i++] =a;   //Integer 타입을 int 로 자동 캐스팅 
							  //i++ 은 postfix 이므로 대입문 = 실행 후에 증가
		
		Arrays.sort(answer);	//배열 정렬
		return answer;
	}
}
