package koreait.day14;

import java.util.Objects;
import java.util.Random;
//아래에 불변객체 Member 있음.
public class C64ObjectTest {

	public static void main(String[] args) {
		Member sana = new Member(12, "사나", 24, true);
		Member momo = new Member(15, "모모", 17, false);

		System.out.println("\ntoString() 재정의 - before & after");
		System.out.println(sana.toString());  //before는 koreait.day14.Member@해시코드
		System.out.println(momo.toString());  //after는 id=15, name=모모, age=17, isAdult=false
		System.out.println(sana);  //toString() 생략됨.
		System.out.println(momo);
		
		System.out.println("\n자바API 객체 toString() 확인 (일반적 케이스)");
		Random r1 = new Random();
		Random r2 = new Random();
		System.out.println(r1.toString());   //java.util.Random@해시코드
		System.out.println(r2.toString());
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("\n문자열 타입 객체는 예외적으로 실행");
		System.out.println("문자열 toString()은 이미 재정의되어 문자열 자체를 출력.");
		String str1 = new String("Hello");
		String str2 = new String("java");
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str1);
		System.out.println(str2);
		
		//해시코드 : 객체가 저장된 주소로 만들어지는 객체의 식별값. `해시함수`가 생성합니다.
		System.out.println("\n::위의 6개 객체 해시값 확인::");
		System.out.println(sana.hashCode() +"," + Integer.toHexString(sana.hashCode()));
		System.out.println(momo.hashCode() +"," + Integer.toHexString(momo.hashCode()));
		System.out.println(r1.hashCode() +"," + Integer.toHexString(r1.hashCode()));
		System.out.println(r2.hashCode() +"," + Integer.toHexString(r2.hashCode()));
		System.out.println(str1.hashCode() +"," + Integer.toHexString(str1.hashCode()));
		System.out.println(str2.hashCode() +"," + Integer.toHexString(str2.hashCode()));
		
		
		//Member sana = new Member(12, "사나", 24, true);
		Member sana2 = new Member(12, "사나", 24, true);
		//hashcode() 재정의 : Member 객체의 필드값이 모두 같으면 해시코드 값이 같도록 함.
		System.out.println("\nhashcode() 재정의 - before & after");
		System.out.println("before : sana와 sana2의 해시코드값이 다르다.");
		System.out.println("after : sana와 sana2의 해시코드값이 같다.");
		System.out.println(sana.hashCode() +"," + Integer.toHexString(sana.hashCode()));
		System.out.println(sana2.hashCode() +"," + Integer.toHexString(sana2.hashCode()));
		
		System.out.println("\nequals() 재정의 - before & after");
		//equals() 재정의 : Member 객체의 필드값이 모두 같으면 equals 실행 결과 true
		System.out.println("before : sana와 sana2의 객체 주소가 다르므로 false");
		System.out.println("after : sana와 sana2의 필드값이 같으면 true");
		System.out.println(sana.equals(sana));		//true
		System.out.println(sana2.equals(sana2));	//true
		System.out.println(sana.equals(sana2));     //before:false , after: true
		System.out.println(sana2.equals(sana)); 	//before:false , after: true	
		System.out.println(sana2.equals(null));     //false
		
		System.out.println(sana.equals(momo));		//before:false , after: false
	}

}

final class Member {	//final : 상속 못함.(immutable 객체 필수조건은 아닙니다.)
	//불변 객체(객체 생성시 일단 값을 주면 변경을 못함) immutable(불변의)
	//필드는 final , 모든필드 초기화 커스텀생성자,setter 없음.(getter 선택)
	private final int id;	//주민등록번호와 같은 식별값.
	private final String name;
	private final int age;
	private final boolean isAdult;
	
	public Member(int id, String name,int age,boolean isAdult) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.isAdult=isAdult;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isAdult() {
		return isAdult;
	}

	@Override
	public String toString() {
		return 
"id=" + id + ", name=" + name + ", age=" + age + ", isAdult=" + isAdult;
	}
	
    	
	@Override
	public int hashCode() {		//객체의 주소공간은 달라도 필드값(data)이 같으면 동일한 해시코드 생성
			return Objects.hash(name) +  Objects.hash(age) + 
					Objects.hash(id) + Objects.hash(isAdult);
	//Objects.hash(name)는 해시함수 실행. name 문자열로 해시값을 만듭니다.
	//           ("hello")의 인자값이 같으면 hash("hello") 결과값은 동일한 정수값. 
	}
	
	@Override
		public boolean equals(Object obj) {
			if(obj == null)   return false;
			if(this == obj)   return true;		
			//sana.equals(sana2) 실행할때 this는 sana,obj는 sana2
			
			Member m = (Member)obj; 	//매개변수 Object 는 모든 타입이 인자가 될수 있다.
			return this.name.equals(m.name) && this.age==m.age && this.id==m.id && 
					this.isAdult==m.isAdult;
		}
	
	
}
//final 클래스는 상속못하므로 오류
/*
 * class Student extends Member {
 * 
 * }
 */

