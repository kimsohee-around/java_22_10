/*
 * CREATE TABLE tbl_member2 (
	mno NUMBER(5) PRIMARY KEY ,    
	name varchar2(50) NOT NULL ,   -- 이름
	email varchar2(100) UNIQUE ,  -- 이메일
	join_date DATE	DEFAULT sysdate   -- sysdate : 오라클 함수(현재날짜/시간)		
);
 * */

SELECT * FROM tbl_member2;

-- DML : update, delete