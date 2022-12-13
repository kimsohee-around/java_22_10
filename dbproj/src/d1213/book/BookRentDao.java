package d1213.book;

import java.util.List;

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
	
	
}
