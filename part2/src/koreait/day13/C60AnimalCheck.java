package koreait.day13;

import java.util.Scanner;

public class C60AnimalCheck {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Puppy pu = new Puppy();  	Animal apu = new Puppy();		//부모타입으로 참조합니다.
		Cat ca = new Cat();  		Animal aca = new Cat();
		Frog fr = new Frog();		Frog afr = new Frog();
		
		System.out.println("\n::동물 이름과 색상필드 값 설정::");
		animal.setName("동물"); animal.setColor("아직 모름");
		pu.setName("강아지");   pu.setColor("브라운");
		pu.setType("시츄");
		apu.setName("퍼피");   apu.setColor("화이트");
	//apu.setType("푸들");	// 오류 :부모타입 참조하여 자식클래스 필드,메소드 사용X
		Puppy pp = (Puppy)apu;   		pp.setType("푸들");
		
		ca.setName("고양이");		ca.setColor("블랙");
		aca.setName("캣츠");    aca.setColor("핑크");
		fr.setName("개구리");		fr.setColor("그린");
		afr.setName("프로그");	afr.setColor("블루");
		
		Animal[] myanimals = new Animal[10];		
		System.out.println("\n::이미 생성된 7개 객체의 참조값을 배열에 저장하기::");
		myanimals[0]=animal;   		myanimals[1]=pu;
		myanimals[2]=apu;  		myanimals[3]=ca;
		myanimals[4]=aca;		myanimals[5]=fr;
		myanimals[6]=afr;
		
		//instanceof 연산 : 자식객체의 클래스타입을 검사
		//pu가 참조하는 객체가 Puppy 클래스의 인스턴스인가? 참 또는 거짓
		System.out.println("\n::instanceof Puppy  연산결과 ::");
		System.out.println("pu: "+ (pu instanceof Puppy));
		System.out.println("apu:"+ (apu instanceof Puppy));
		System.out.println("myanimals[3]:"+ (myanimals[3] instanceof Puppy));
		System.out.println("animal:"+ (animal instanceof Puppy));
//		System.out.println(ca instanceof Puppy);	//변수 타입이 Cat 이므로 연산자체가 성립안됨. 오류
		System.out.println("aca:"+ (aca instanceof Puppy));
		
		Scanner sc = new Scanner(System.in);	
		//for문으로 Animal 배열을 대상으로 반복 - 특정한 자식타입에 대한 검사
		//		ㄴ 예) Puppy 일때만 견종 입력받기
		System.out.println("\n::Puppy객체는 견종을 입력받습니다.::");
		for(int i=0;i<myanimals.length;i++) {
			if(myanimals[i] instanceof Puppy) {
				Puppy temp = (Puppy)myanimals[i];	//자식클래스 필드 또는 메소드 사용을 위해 캐스팅
				System.out.print("myanimals[" +i +"] 견종 입력 >>>");
				temp.setType(sc.nextLine());
			}
			
		// 고양이 객체이면 색상 입력하여 color 필드값 설정하기
			if (myanimals[i] instanceof Cat) {
				System.out.print("myanimals[" +i +"] 고양이 컬러 입력 >>>");
				myanimals[i].setColor(sc.nextLine());
			}
		// 개구리 객체이면 jump 메소드(static) 실행시키기
			if (myanimals[i] instanceof Frog) {
				System.out.println("myanimals[" +i +"] ");
				Frog.jump();
			}
		// Cat,Puppy,Frog,Animal 객체 모두 instanceof Animal은  `참`입니다.
			if (myanimals[i] instanceof Animal)
				System.out.println("myanimals[" +i +"] : Animal" );
			//System.out.println("animal:"+ (animal instanceof Puppy)); -> `거짓`
		}
		
		System.out.println("\n::나의 보호 동물들 보기 ::");
		for(Animal ani : myanimals)
			if(ani != null)
				System.out.println(ani.animal());
	}

}








