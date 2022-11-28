CREATE TABLE tbl_student (
	stuno char(7) PRIMARY KEY,
	name varchar2(30) NOT NULL,
	age number(3) CHECK (age BETWEEN 10 AND 30),
	address nvarchar2(50)
);

CREATE TABLE tbl_score(
	stuno char(7),
	subject nvarchar2(20),
	jumsu number(3) NOT NULL ,
	term char(6) NOT NULL,
	PRIMARY key(stuno,subject), 	-- 기본키는 복합컬럼으로 설정
	FOREIGN key(stuno) REFERENCES tbl_student(stuno)   -- 참조관계설정
--	FOREIGN key(성적테이블컬럼) REFERENCES 참조테이블(참조테이블컬럼)   
--  				참조컬럼 조건은 ? 
);