package koreait.day13;

public class C59AnimalShop {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Puppy pu = new Puppy();
		Animal apu = new Puppy();		//부모타입으로 참조합니다.
		Cat ca = new Cat();
		Animal aca = new Cat();
		Frog fr = new Frog();
		Frog afr = new Frog();
		
		System.out.println("\n::동물 이름과 색상필드 값 설정::");
		animal.setName("동물"); animal.setColor("아직 모름");
		pu.setName("강아지");   pu.setColor("브라운");
		pu.setType("시츄");
		
		apu.setName("퍼피");   apu.setColor("화이트");
	//apu.setType("푸들");	// 오류 :부모타입 참조하여 자식클래스 필드,메소드 사용X
		Puppy pp = (Puppy)apu;
		pp.setType("푸들");
		
		ca.setName("고양이");		ca.setColor("블랙");
		aca.setName("캣츠");    aca.setColor("핑크");
		fr.setName("개구리");		fr.setColor("그린");
		afr.setName("프로그");	afr.setColor("블루");
		
		System.out.println("\n::sound 메소드 실행::");
		animal.sound();
		pu.sound();
		apu.sound();
		ca.sound();
		aca.sound();
		fr.sound();		//재정의된 sound() 없음.
		afr.sound();
		//**부모타입으로 참조할때, 재정의된 인스턴스 메소드가 실행된다. - O **
		
		//1. 다형성 예시 - 부모타입 배열에 자식클래스 객체를 여러가지 모두 참조
		//  사전적 의미 - 정의는 하나의 타입이나 형태는 여러가지
		//			  - 재정의된 메소드를 자식 각각 정의된 내용에 따라 다르게 실행
		Animal[] myanimals = new Animal[10];		
		System.out.println("\n::이미 생성된 7개 객체의 참조값을 배열에 저장하기::");
		myanimals[0]=animal;
		myanimals[1]=pu;
		myanimals[2]=apu;
		myanimals[3]=ca;
		myanimals[4]=aca;
		myanimals[5]=fr;
		myanimals[6]=afr;
		
		System.out.println("\n::배열 저장 객체의 sound 메소드를 for로 실행::");
		for(int i=0;i<myanimals.length;i++)
			if(myanimals[i]!=null) {
				myanimals[i].sound();
			}	
		System.out.println("\n::나의 샵 동물들 보기 ::");
		for(Animal ani : myanimals)
			if(ani != null)
				System.out.println(ani.animal());
		
		System.out.println("\n::입양하기 테스트::");
		adopt(fr); adopt(pu); adopt(aca);
		
	}  //main end
	
	//2. 다형성 예시 - 메소드 매개변수가 부모타입 : 부모클래스와 자식클래스 타입으로 생성된 객체가 실제 인자로 전달
	//			- 리턴 타입을 부모 타입
	public static void adopt(Animal animal) {
		System.out.println("\n:: 이제 입양갑니다.::");
		System.out.println(animal.animal());
	}
}
