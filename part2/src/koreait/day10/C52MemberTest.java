package koreait.day10;

public class C52MemberTest {
//MyClass2와 Member는 형식이 같은 클래스입니다.
	public static void main(String[] args) {
		
		Member momo = new Member();
		Member nayeon = new Member();

		momo.setAge(25);    //this.age = age;  this는 momo 객체
		nayeon.setAge(23);  //this는 nayeon 객체
		
		System.out.println("모모 나이 : " + momo.getAge());
		System.out.println("나연 나이 : " + nayeon.getAge());
		
		System.out.println("모모 : " + momo);		//패키지명.클래스@참조값(해시코드)
		System.out.println("나연 : " + nayeon);
		
		Member temp;		//Member클래스로 만들어진 객체의 참조값을 저장
		temp = momo;		//참조값을 대입.
		System.out.println("\ntemp=momo");
		System.out.println("temp : " + temp);
		System.out.println("temp 나이 : " + temp.getAge());
		temp=nayeon;
		System.out.println("\ntemp=nayeon");
		System.out.println("temp : " + temp);
		System.out.println("temp 나이 : " + temp.getAge());
		
	}
}
