package koreait.day12;

public class ClassA {
	
	public int ab;
	String name;
	protected String title;
	private String msg;
	//같은 패키지 클래스와 자식클래스만 사용할수 있는 상수
	protected static final int max=100;
	public String data() {
		return ab + "," + name +"," + title + "," + msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	//static 메소드는 객체와 상관없으므로 인스턴스 필드값 사용 안합니다.
	static void dfamily() {
		System.out.println("같은 패키지에서만 사용 가능!");
	}
	
	protected static void family() {
		System.out.println("자식 클래스는 어느 패키지에서나 출력 가능!");
	}
	
	public static void pfamily() {
		System.out.println("어느 패키지에서나 모두에게 사용 가능!");
	}

}
/*
 * 클래스의 상속
 * -> 클래스 간의 부모(상위클래스,super)-자식(하위클래스)관계가 만들어집니다.
 * -> 부모의 클래스 구성요소를 자식이 사용할수 있습니다.상속되는 요소는 필드,메소드
 * -> extends 키워드 사용하여 부모클래스를 지정합니다. 슈퍼클래스는 오직 1개입니다.
 * -> private 접근한정자는 상속 안됩니다.
 * -> protected 는 다른패키지의 자식 클래스가 상속받을 수 있도록 합니다. 
 * -> 현실세계에서 반려동물샵을 운영. 데이터 저장을 위해서 클래스 정의. 
 * 동물의 종류 개,고양이,햄스터,도마뱀,토끼,열대어...  -> 하나의 그룹으로 Animal 클래스 정의하고 공통적인 요소를 정의
 * -> 공통적요소가 아닌것은 구체적인 클래스로 정의(예, Cat,Dog,Rabbit,... ) 그리고 Animal 클래스를 상속받습니다.
 */