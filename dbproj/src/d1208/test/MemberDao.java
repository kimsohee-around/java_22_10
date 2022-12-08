package d1208.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleUtil;

//DAO 클래스 : Data Access Object . SQL 실행하는 메소드를 모아놓은 클래스
public class MemberDao {

	public List<Member> selectList() throws SQLException {		//Member 객체를 저장한 리스트를 리턴
		
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql ="select * from  member_tbl_02";
		
		pstmt = conn.prepareStatement(sql);     //Exception 처리는 jvm에게 throw(위임.떠넘기기).
		rs = pstmt.executeQuery();
		List<Member> memberList = new ArrayList<>();		//select 조회결과를 자바 객체로 저장.
		while(rs.next()) {
			Member m = new Member(
					rs.getInt(1), 
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getDate(5),
					rs.getString(6),
					rs.getString(7)
					);
			memberList.add(m);
		}
		
		conn.close();
		return memberList;
	}
	
	public Member selectOne(int custno) throws SQLException {
		//pk값 custno 를 인자로 전달받아서 해당되는 조회결과를 Member객체로 리턴
		Member member=null;
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql ="select * from  member_tbl_02 where custno = ?";
		
		pstmt = conn.prepareStatement(sql);     
		pstmt.setInt(1, custno);   //***** 메소드에서 SQL 전달할 값을 인자로 받았습니다.
		rs = pstmt.executeQuery();
		
		if(rs.next()) 
			member = new Member(
					rs.getInt(1), 
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getDate(5),
					rs.getString(6),
					rs.getString(7)
					);
		
		
		return member;
	}
}

//insert ,update, delete SQL에 대한 메소드 정의. 그리고 테스트.












