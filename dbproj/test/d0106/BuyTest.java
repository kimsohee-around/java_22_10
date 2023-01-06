package d0106;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import d0106.dao.BuyCustomer;
import d0106.dao.BuyDao;
import d0106.model.Buy;

/*
 *  src 폴더 : 소스파일 - 프로덕션 코드. 빌드에 포함되는 코드
 *  test 폴더 : 테스트 파일(테스트 케이스). 빌드에 포함되지 않는 코드
 */

class BuyTest {
	
	private BuyDao dao = new BuyDao();

	@DisplayName("buy 테이블에 insert 성공하면 리턴값은 1 이 되어야 합니다.")
	@Test
	void insertTest() throws SQLException {   //테스트메소드는 인자,리턴 사용 안합니다.
		Buy buy = Buy.builder().custom_id("sana")
				  .pcode("CJ-BABQ1")
				  .quantity(5)
				  .build();
		int i = dao.insert(buy);
		
		assertEquals(1, i);
	}

	@DisplayName("IPAD011 구매 고객이 2 가 되어야 합니다.")
	@Test
	void selectBuyCustomerTest() throws SQLException {
		List<BuyCustomer> list = dao.selectBuyCustomer("IPAD011");
		assertEquals(2, list.size());
		//2는 기대값 , list.size() 와 같은 2번째 인자는 검사할 변수/수식/메소드 
	}
	
	@DisplayName("Buy 객체 2개가 같은지 비교 합니다.")
	@Test
	void test() {
		Buy buy = new Buy(0, "twice", "dk_143", 0, null, null);
		Buy buy2 = Buy.builder()
				.custom_id("twice")
				.pcode("dk_143")
				.build();
		
		Buy buy3 = Buy.builder()
				.custom_id("twice2")
				.pcode("dk_143")
				.build();
		
		
		assertEquals(buy, buy2);    //성공. equals 와 hashCode 재정의 
		assertEquals(buy, buy3);	//실패
	}
	
}
