package d0106;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import d0106.dao.BuyDao;
import d0106.model.Buy;
import d0106.model.BuyCustomer;

/*
 *  src 폴더 : 소스파일 - 프로덕션 코드. 빌드에 포함되는 코드
 *  test 폴더 : 테스트 파일(테스트 케이스). 빌드에 포함되지 않는 코드
 */
@TestMethodOrder(value=MethodOrderer.OrderAnnotation.class)
class BuyTest2 {
	
	private BuyDao dao = new BuyDao();

	@Order(1)
	@DisplayName("IPAD011 구매 고객이 2 가 되어야 합니다.")
	@Test
	void selectBuyCustomerTest() throws SQLException {
		List<BuyCustomer> list = dao.selectBuyCustomer("IPAD011");
		assertEquals(3, list.size());
		//2는 기대값 , list.size() 와 같은 2번째 인자는 검사할 변수/수식/메소드 
	}
	
	@Order(2)
	@DisplayName("buy 테이블에 insert 성공하면 리턴값은 1 이 되어야 합니다.")
	@Test
	void insertTest() throws SQLException {   //테스트메소드는 인자,리턴 사용 안합니다.
		Buy buy = Buy.builder().custom_id("sana")
				  .pcode("IPAD011")
				  .quantity(5)
				  .build();
		int i = dao.insert(buy);
		
		assertEquals(1, i);
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
		
		System.out.println("buy == 비교 :" +(buy==buy2) );	//toString 문자열의 참조값 비교
		System.out.println("buy 해시코드 비교 :" +(buy.hashCode() ==buy2.hashCode()) );	//객체의 해쉬코드값 비교
		System.out.println("buy equals 비교 :" + buy.equals(buy2));   
		//toString 문자열 비교이나 equals 재정의 했으므로 재정의 한 equals 에 따라서 참 또는 거짓 
		
		assertEquals(buy, buy2);    //성공. equals 와 hashCode 재정의 
		//assertEquals(buy, buy3);	//실패
	}
	@DisplayName("equals 와 hashcode 가 재정의 되지 않은 객체 비교")
	@Test
	void buyCustomer() {
		BuyCustomer cus1 = new BuyCustomer("aaa", "모모", 2);
		BuyCustomer cus2 = new BuyCustomer("aaa", "모모", 2);
		BuyCustomer cus3=cus1;
		System.out.println(cus1==cus2);				//false
		System.out.println(cus1.hashCode()==cus2.hashCode());	//false
		System.out.println(cus1.toString().equals(cus2.toString()));  //true
		System.out.println(cus1.equals(cus2));		//false
		System.out.println(cus1.equals(cus1));		//true
		System.out.println(cus1.equals(cus3));		//true
		//equals 재정의 하기 전
		/*
		 *  public boolean equals(Object obj) {
        		return (this == obj);			//obj 가 자기자신일때만 참.
    		}
		 * 
		 */
	}
	
	
}
