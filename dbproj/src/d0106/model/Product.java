package d0106.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode			//Object 클래스의 equals , hashCode 메소드 재정의. 
public class Product {
	private String pcode;
	private String category;
	private String pname;
	private int price;
	
	
}
