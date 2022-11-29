package koreait.day14;


public class ObjAnimal {
		private String color;
		private String name;
		
		//default 생성자 - 예시로 출력내용 작성합니다.
		public ObjAnimal() {
			System.out.println("Animal:새로운 반려동물 가족이 생겼습니다.");
		}
//toString,hashcode,equals 재정의 해보세요.

		
		
		
		
		
		
		
		
		
		//인스턴스 메소드 - 인스턴스 필드값으로 동작을 합니다.
		public void sound() {
			System.out.println("Animal:소리를 내는 동물입니다.이름은 " + name);
		}
		
		//getter
		public String getColor() {
			return color;
		}
		
		public String getName() {
			return name;
		}
		
		//setter
		public void setColor(String color) {
			this.color = color;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String animal() {
			return "이름 : " + name + ",색상 : " + color;
		}
		
		
		
		
		
		
		
}






