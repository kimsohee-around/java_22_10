package koreait.day10;


//소프트웨어 개발 : 디자인 패턴을 사용합니다. 이유는 효율성,유지보수,동시처리 등을 고려해서 개발의 형식을 만듭니다.
public class MyClass2 {
	//클래스의 필드를 private 접근 제한 : 은닉성
	//			ㄴ 다른 클래스에서 값 변경할때 문제가 생기지 않도록 함
	private int age;
	private String name;
	private double point;
	private String[] msg;
	
	//private 필드에 대해 읽고(getter) 쓰는(setter) 메소드를 정의
	//setter : 메소드 이름은 setXXXX, XXXX은 대문자로 시작하는 필드명. 인자가 있습니다.
	public void setAge(int age) {	//매개변수명은 일반적으로 필드명과 똑같이 합니다.
		this.age = age;						//인자로 전달받은 값은 필드값으로 저장.
	}  //**this: MyClass2로 만들어진 객체 자기자신을 가리키는 키워드
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoint(double point) {
		this.point=point;
	}
	
	public void setMsg(String[] msg) {		//참조타입은 참조값 (주소) 를 전달합니다.
		this.msg = msg;
	}
	
	
	//getter : 메소드 이름은 getXXXX , XXXX은 대문자로 시작하는 필드명. 리턴값이 있습니다.
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPoint() {
		return point;
	}
	
	public String[] getMsg() {
		return msg;
	}
	
}
