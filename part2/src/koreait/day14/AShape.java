package koreait.day14;


//추상클래스 : 객체를 직접생성하지 않는 형태의 클래스 입니다.
//        **추상메소드를 갖고 있습니다. 추상(abstract): 구체화되지 않은 상태.
//부모클래스에서 구체화되지 않은 **추상메소드를 자식클래스가 재정의(오버라이드)하도록 하는 것입니다.
public abstract class AShape 
{
	protected String name;
	protected int width, height;
	
	public AShape()
	{ }	
	
	public AShape(int width, int height)
	{	
		this.width = width;
		this.height = height;
	}
	//**추상메소드 선언 : 메소드 몸체 { 실행 내용..} 없고   ; 로 선언만 합니다.
	// 도형의 형태를 모르는 상태에서는 필요한 메소드를 정의만 합니다.
	public abstract double getArea();
	
	//인스턴스 메소드	
	public String shape()
	{return name + "," + width + "," + height;}
	
	
	
	
}	// Class end


class ATriangle extends AShape
{
	protected int angle;
	
	@Override
	public double getArea()	// override. 추상메소드 재정의는 `구현`이 정확한 용어 입니다.
	{return width*height/2;}
	
	@Override
	public String shape() {
		return super.shape() + "," + angle;
	}
	
	
}	// Class end

class ACircle extends AShape
{
	private int radius;
	// private instanc1e field


	public ACircle(String name, int width, int height, int radius) 
	{	
		super(width,height);   //형식적인 내용만 확인하세요
		this.name = name;
		this.radius = radius;
	}
	
	public ACircle(String name,int radius) {
		//부모 기본생성자 super() 호출
		this.name=name;
		this.radius=radius;
	}

	public int getRadius()	// getter
	{return radius;}
	
	@Override
	public double getArea()	// override
	{return Math.PI*radius*radius;}
}



