package d1213.book;

import java.util.List;
import java.util.Map;

import jdbc.util.OracleUtil;

public class BookRentDao {
	private static BookRentDao dao = new BookRentDao();
	private BookRentDao() {   };
	public static BookRentDao getInstance() {
		return dao;
	}

	public List<BookRentDto> selectRentBook() {
		List<BookRentDto> list = null;
		return list;
	}
	
	public List<BookRentDto> selectDelay() {
		List<BookRentDto> list = null;
		return list;
	}
	
	public BookRentDto selectRentByMember(int mem_idx) {
		BookRentDto dto = null;
		
		return dto;
	}
	
	public boolean isRent(int mem_idx,String bcode) {
		boolean result = false;
		
		return result;
	}
	
	public void rentBook(BookRentDto bookRentDto) {
		String sql = "";
		Connection conn = OracleUtil.getConnection();
	}
	
	public void returnBook(Map<String,Object> rent) {
		
	}
	
	
	public boolean isAvailableBook(String bcode) {
		boolean result = false;
		
		return result;
	}
	
	public boolean isAvailableMember(int mem_idx) {
		boolean result = false;
		
		return result;
	}
	
	
}
