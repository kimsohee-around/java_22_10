package koreait.test2;

//연락처 저장 정보를 정의하는 클래스
public class Person {
	//상수 정의
	public static final int FRIENDS =1;
	public static final int FAMILY =2;
	public static final int BUSINESS =3;
	
	//인스턴스 필드
	private String name;
	private String mobile;
	private int group;			//위의 3개 상수값 중 하나로 저장
	
	//커스텀 생성자
	public Person(String name,String mobile,int group) {
		this.name = name;
		this.mobile= mobile;
		this.group = group;
	}
	
	//getter,settter
	public String getName() {
		return name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public int getGroup() {
		return group;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setGroup(int group) {
		this.group = group;
	}
	
	//toString
	@Override
	public String toString() {
		return "[name=" + name + ", mobile=" + mobile 
				+ ", 그룹 ="  
				+ (group==1? "친구" : (group==2? "가족" : "비지니스")) 
				+ "]";
	}
	
}
