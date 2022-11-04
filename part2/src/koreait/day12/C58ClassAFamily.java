package koreait.day12;

public class C58ClassAFamily {

	public static void main(String[] args) {

		ClassA grandf = new ClassA();
		grandf.ab=12;
		grandf.name="손흥민";
		System.out.println("ClassA 객체");
		System.out.println(grandf.data());
		grandf.setMsg("hi~");
		System.out.println("메시지-"+grandf.getMsg());
		
		ClassAA father = new ClassAA();
		father.ab=11;
		father.name="싸이";
		father.point=12.34;
		System.out.println("\nClassAA 객체");
		System.out.println(father.data());
		father.setMsg("헬로우~");
		father.test();
		
		ClassAAC me = new ClassAAC();
		me.ab=10;
		me.name="사나";
		me.point=15.67;
		System.out.println("\nClassAAC 객체");
		System.out.println(me.data());
		me.setMsg("안녕하세요.");
		me.test();
		
		ClassA kim = new ClassA();		
		
		//객체를 생성하고 변수가 부모타입일 때 - 참조가능합니다.
		//double = int;
		ClassA kim1 = new ClassAA();	//1**자식클래스 객체도 참조가능 : 업캐스팅
		//kim1.point = 12.34;		//2**참조타입이 ClassA 이므로 오류
		//System.out.println("포인트 : " + kim1.point);
		//메소드 테스트 해보세요.
		
		//기본형 타입 캐스팅으로 적용해보세요.
		int a ;
		double b=3.14;
		a=(int)b;
		
		ClassAA test;		//변수선언만 하고 객체를 참조하지 않음.  int a;
		test = (ClassAA)kim1;		//3**동일한 객체를 참조타입만 변환 : 다운캐스팅
		test.point=12.34;			//4**참조타입이 ClassAA
		//캐스팅 후에 메소드 테스트 해보세요.
		
		ClassA kim2 = new ClassAAC();
		ClassAA kim3 = new ClassAAC();
		
		
		ClassA[]  kimsf = new ClassA[5];		//ClassA 가족을 5개 저장 : 다형성
		kimsf[0] = new ClassA();	
		kimsf[1] = new ClassAA();
		kimsf[2] = new ClassAAC();
		
		
	}

}



