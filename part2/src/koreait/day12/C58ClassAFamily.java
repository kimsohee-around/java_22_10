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
	}

}
