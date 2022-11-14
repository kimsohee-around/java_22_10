package koreait.day18;

public class Member {
	
	private int id;
	private String name;
	private int age;
	private double money;		//사용금액
	
	public Member(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return id + "," + name + "(" + age + "), " + money + "\n";
	}
	
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}

}
