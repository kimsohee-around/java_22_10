package koreait.day14;

public class Shape 
{
	protected String name;
	protected int width, height;
	// protected instance field
	
	public Shape()
	{ }	// 기본 생성자
	
	public Shape(int width, int height)
	{	// int field값 초기화 커스텀 constructor
		this.width = width;
		this.height = height;
	}
	//인스턴스 메소드는 객체의 필드값으로 실행.
	public double getArea() {
		return width*height;
	}
	
	//메소드 오버로딩 : 인자가 다르다는 조건 필수.
	// 리턴형식만 다르게 할때는 메소드 이름 변경해야 합니다.
	public int getIntArea() {
		return width*height;
	}
	
	 String shape() 
	{return name + "," + width + "," + height;}
}	// Class end


class Triangle extends Shape
{
	protected int angle;
	// protected instance field
	
	@Override
	public double getArea()	
//override(재정의) : 부모클래스의 인스턴스 메소드 실행 내용을 다른 내용으로 정의.
	{return width*height/2;}

//재정의 접근권한 유의사항	
	@Override
	public String shape() {
		return super.shape() + "," + angle;
	}
/*
 * 메소드 재정의할때 접근한정자
 * 부모 public -> 자식 default,protected,private : 오류(부모보다 범위가 작은 접근권한 오류)
 * 부모 default -> 자식 public : 가능	(부모보다 범위가 넓은 접근권한 가능)
 */
	
	
	
}	// Class end

class Circle extends Shape
{
	private int radius;
	// private instance field

//기본생성자 동작 안함.	
	
//생성자 오버로딩 : 같은 이름의 메소드에 대해 인자(매개변수)의 갯수를 다르게 정의함.	
	public Circle(String name, int width, int height, int radius) 
	{	// 4개의 field값 초기화 커스텀 constructor
		super(width,height);   //형식적인 내용만 확인하세요
		this.name = name;
//		this.width = width;
//		this.height = height;
		this.radius = radius;
	}
	
	public Circle(String name,int radius) {
		//부모 기본생성자 super() 호출
		this.name=name;
		this.radius=radius;
	}

	public int getRadius()	// getter
	{return radius;}
	
	public double getArea()	// override
	{return Math.PI*radius*radius;}
}



