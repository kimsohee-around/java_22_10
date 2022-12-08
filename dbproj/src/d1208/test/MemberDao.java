package d1208.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleUtil;

//DAO 클래스 : Data Access Object . SQL 실행하는 메소드를 모아놓은 클래스
//				ㄴ DAO 클래스는 `객체를 1개만 생성되도록하는 디자인패턴` - 싱글턴(singleton) 으로 만듭니다.
//				ㄴ 1개의 객체로 여러 프로그램에서 사용하도록 합니다. static 메소드 안쓰고 싱글턴으로 만듭니다.
//				ㄴ 인스턴스 메소드로 만들어야 인터페이스 적용과 상속에서 메소드 재정의가 가능합니다.
public class MemberDao {
	
	private static MemberDao dao = new MemberDao();    //private static 멤버변수가 참조하는 것은 자기자신 객체
	private MemberDao() { };				//생성자 private(이 클래스 외에는 사용못함.)
	public static MemberDao getMemberDao() {		//생성된 객체를 리턴해 주는 public 메소드 - 항상 동일한 객체를 리턴
		return dao;
	}
	
	public void insert(Member member) throws SQLException {
		//Member 객체를 인자로 받아서 insert 할 값으로 SQL에 전달.
		Connection conn = OracleUtil.getConnection();
		String sql ="INSERT INTO MEMBER_TBL_02 \r\n"
				+ "VALUES (seq_custno.nextval, ?, ?, ?, sysdate, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, member.getCustname());		//1 : 인덱스값 . ? 기호 순서
		pstmt.setString(2, member.getPhone());
		pstmt.setString(3, member.getAddress());
		pstmt.setString(4, member.getGrade());
		pstmt.setString(5, member.getCity());
		
		pstmt.execute();
		conn.close();
		
	}
	
	public List<Member> selectList() throws SQLException {		//Member 객체를 저장한 리스트를 리턴
		
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql ="select * from  member_tbl_02 order by custno";
		
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
					rs.getString(7)	);
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












