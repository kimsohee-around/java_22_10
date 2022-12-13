package d1213.book;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRentDto {
	private int rent_no;
	private int mem_idx;
	private String bcode;
	private Date rent_date;
	private Date exp_date;
	private Date return_date;
	private int delay_days;
}
/*
BookRentDto 클래스 - 대여정보 저장
BookRentDao 클래스
selectRentBook:대여 중인 도서 조회
selectDelay:연체 도서 조회
selectRentMember:회원의 도서대여 정보. 
         인자는 회원번호 , 리턴은 대여정보 
rentBook 메소드 :대여 (insert). 리턴 void
returnBook:반납 (update). 리턴 void

*/