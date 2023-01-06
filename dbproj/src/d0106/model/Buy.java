package d0106.model;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder			//필드값 일부만 초기화를 위해 사용하는 패턴
public class Buy {
	private int buy_seq;
	private String custom_id;
	private String pcode;
	private int quantity;
	private Timestamp buy_date;
	private Date buy_temp;
	
	
	//2개의 객체 비교를 위해 equals 가 참이고 hashCode값이 같으면 `동일(==)하다.` 조건식이 참.
	//    -> 2개의 메소드가 모두 재정의 되어 있을때 이 클래스를 VO(Value Object) 라고 합니다.
	@Override
	public int hashCode() {			//3개의 필드값이 같다면 해시코드값도  수식으로 동일하게 생성합니다.
		final int prime = 31;
		int result = 1;
		result = prime * result + buy_seq;
		result = prime * result + ((custom_id == null) ? 0 : custom_id.hashCode());
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {   //실제로 필드값이 동일한지 비교-3개의 필드값이 모두 같다면 참.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buy other = (Buy) obj;
		if (buy_seq != other.buy_seq)
			return false;
		if (custom_id == null) {
			if (other.custom_id != null)
				return false;
		} else if (!custom_id.equals(other.custom_id))
			return false;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	}
	
	
	
	
}
