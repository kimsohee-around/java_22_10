package d0106.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import d0106.model.Buy;
import jdbc.util.OracleUtil;

public class BuyDao {
	//싱글톤 패턴 정의해왔습니다. - spring 에서는 알아서 싱글톤 객체를 생성합니다.
	//						- 직접 정의할 필요가 없습니다.(이 소스에서는 생략합니다.)
	
	//insert   //아래 메소드 시그니처 : 메소드 인자는 입력 -> 처리는 메소드 바디 { } -> 리턴 타입은 출력
	public int insert(Buy buy) throws SQLException {
		int result=0;
		String sql ="INSERT INTO TBL_BUY# "
				+ "(buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)\r\n"
				+ "VALUES (buy_seq.nextval,?,?,?,sysdate)";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, buy.getCustom_id());
		pstmt.setString(2, buy.getPcode());
		pstmt.setInt(3, buy.getQuantity());
		result = pstmt.executeUpdate();
		
		return result;
	}
	
	
	//select 전체 : 여러행이 조회되면 콜렉션 List
	public List<Buy> selectAll() throws SQLException {
		List<Buy> list = new ArrayList<Buy>();
		String sql ="select * from tbl_buy#";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			list.add(new Buy(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getTimestamp(5),
						rs.getDate(6)
					));
		}
		
		return list;
	}
	
	
	
	//select by PK : 1개 행이 조회되므로 콜렉션 아닙니다. 입력은 PK 값
	public Buy selectBySeq(int buy_seq) throws SQLException {
		Buy result=null;
		String sql ="select * from tbl_buy# where buy_seq=?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, buy_seq);		//메소드 인자 입력값 sql 에 전달
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			new Buy(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getTimestamp(5),
						rs.getDate(6)
					);
		}
		
		return result;
	}
	
	
	//`구매 날짜(yyyy-mm-dd)` 를 입력으로 해당 `구매내역 select`가 출력 : 구매날짜 입력은 사용자 UI에서 받으면 String  
	public List<Buy> selectByDate(String date) throws SQLException{
		List<Buy> list = new ArrayList<Buy>();
		String sql ="select * from tbl_buy# where buy_date = ? ";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, date);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			list.add(new Buy(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getTimestamp(5),
						rs.getDate(6)
					));
		}
		
		return list;
		
	}

}
