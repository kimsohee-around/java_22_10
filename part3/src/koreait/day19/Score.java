package koreait.day19;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;	
	
	public Score() {
	}
	
	public Score(String name, int korean,int english,int science ) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.science=science;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getGrade() + "]";
	}

	//인스턴스 메소드
	public int sum() {
		int result = this.korean+this.english+this.science;
		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	//setter 를 변경하기 : 실행내용. 필요에 따라서는  접근한정자를 private 으로도 할수 있습니다.
	private  void setGrade() {
		if(average() >=90) this.grade="A";
		else if(average() >=80) this.grade="B";
		else if(average() >=70) this.grade="C";
		else if(average() >=60) this.grade="D";
		else this.grade="F";
	}
	
	String getGrade() {
		setGrade();
		return grade;
	}
	
	//getter,setter
	public String getName() {
		return name;
	}
	
	int getKorean() {
		return korean;
	}
	
	int getEnglish() {
		return english;
	}
	
	
}
