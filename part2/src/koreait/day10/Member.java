package koreait.day10;

public class Member {
	private int age;
	private String name;
	private double point;
	private String[] msg;

	
	
	//getter와 setter 를 이클립스 source-generate getter and setter 메뉴와 ctrl+스페이스바로 자동 코딩
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public double getPoint() {
		return point;
	}
	public String[] getMsg() { //msg는 참조형 변수
		return msg;   //배열의 참조값 리턴
	}
	//this.age는 객체의 필드 age
	public void setAge(int age) {  //age는 지역변수
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public void setMsg(String[] msg) {
		this.msg = msg;  //배열의 참조값 전달
		//msg는 참조형 변수
	}
	

	
	
	
}
