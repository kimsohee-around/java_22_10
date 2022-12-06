--1. 테이블 생성
CREATE TABLE book_member(
	mem_idx number(5) PRIMARY KEY,	--회원번호
	name varchar2(20) NOT NULL,
	email varchar2(20) UNIQUE ,     
	tel varchar2(20),
	password varchar2(10)
);
CREATE TABLE tbl_book(
	bcode char(5) PRIMARY KEY,
	title varchar2(30) NOT NULL,
	writer varchar2(20),   -- 작가
	publisher varchar2(20),   -- 출판사
	pdate DATE			-- 출판 날짜
);
CREATE TABLE tbl_bookrent(			-- '대여' 관계 저장
	rent_no number(5) PRIMARY KEY,	-- 일련번호
	mem_idx number(5) NOT NULL,
	bcode char(5) NOT NULL,
	rent_date DATE NOT NULL,		--빌린 날짜
	exp_date DATE NOT NULL,			--반납예정 날짜
	return_date DATE,				--실제 반납 날짜
	delay_days number(3),			-- 연체일수
	CONSTRAINT fk1 FOREIGN KEY (mem_idx) 	-- CONSTRAINT fk1 는 생략가능
			REFERENCES book_member(mem_idx),
	CONSTRAINT fk2 FOREIGN KEY (bcode)
			REFERENCES tbl_book(bcode)
);

-- 2. 필요시 기존 시퀀스 삭제 및 데이블 데이터 삭제
DROP SEQUENCE memidx_seq;
DROP SEQUENCE bookrent_seq;
TRUNCATE  TABLE TBL_BOOKRENT  ;		-- 외래키 설정되었으므로 이 테이블 데이터부터 삭제
TRUNCATE  TABLE BOOK_MEMBER ;
TRUNCATE  TABLE TBL_BOOK  ;

-- 3. 회원번호 시퀀스 생성
CREATE SEQUENCE memidx_seq START WITH 10001;
-- 대여 일련번호를 위한 시퀀스 생성
CREATE SEQUENCE bookrent_seq;

-- 4. 회원데이터 추가
INSERT INTO book_member (mem_idx,name,email,tel,password)
	VALUES (memidx_seq.nextval, '이하니','honey@naver.com','010-9889-0567','1122');
insert into book_member(mem_idx,name,email,tel,password)
values(memidx_seq.nextval,'이세종','jong@daum.net','010-2354-6773','2345');
insert into book_member(mem_idx,name,email,tel,password)
values(memidx_seq.nextval,'최행운','lucky@korea.com','010-5467-8792','9876');
insert into book_member(mem_idx,name,email,tel,password)
values(memidx_seq.nextval,'나길동','nadong@kkk.net','010-3456-8765','3456');
insert into book_member(mem_idx,name,email,tel,password)
values(memidx_seq.nextval,'강감찬','haha@korea.net','010-3987-9087','1234');

INSERT INTO TBL_BOOK (bcode,title,WRITER,PUBLISHER,PDATE)
values ('A1101','코스모스','칼세이건','사이언스북스',to_date('06/12/01','YY/MM/DD'));
INSERT INTO TBL_BOOK (bcode,title,WRITER,PUBLISHER,PDATE)
values ('B1101','해커스토익','이해커','해커스랩',to_date('18/07/10','YY/MM/DD'));
INSERT INTO TBL_BOOK (bcode,title,WRITER,PUBLISHER,PDATE)
values ('C1101','푸른사자 와니니','이현','창비',to_date('15/06/20','YY/MM/DD'));
INSERT INTO TBL_BOOK (bcode,title,WRITER,PUBLISHER,PDATE)
values ('A1102','페스트','알베르트 까뮈','민음사',to_date('11/03/01','YY/MM/DD'));
INSERT INTO TBL_BOOK (bcode,title,WRITER,PUBLISHER,PDATE)
values ('C1102','파친코','이민진','인플루엔셜',to_date('20/05/09','YY/MM/DD'));

INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE,RENT_DATE,EXP_DATE,RETURN_DATE)
values(bookrent_seq.nextval,10001,'B1101','2021-09-01','2021-09-15','2021-09-14');
INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE,RENT_DATE,EXP_DATE,RETURN_DATE)
values(bookrent_seq.nextval,10002,'C1101','2021-09-12','2021-09-26','2021-09-29');
INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE,RENT_DATE,EXP_DATE,RETURN_DATE)
values(bookrent_seq.nextval,10003,'B1101','2022-11-03','2022-11-17','2022-11-15');
INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE,RENT_DATE,EXP_DATE)
values(bookrent_seq.nextval,10004,'C1101','2022-12-01','2022-12-15');  -- 도서 대여중
INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE,RENT_DATE,EXP_DATE)
values(bookrent_seq.nextval,10001,'A1101','2022-11-20','2022-12-04'); 
--  도서 대여중(연체 2일,sysdate 는 12월6일)
INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE,RENT_DATE,EXP_DATE,RETURN_DATE)
values(bookrent_seq.nextval,10003,'A1102','2022-11-22','2022-12-06','2022-12-04');


-- 참고하기 : '대여' 기본적인 동작은 대여날짜는 오늘,반납기한은 오늘+14 를 기본값으로 할수 있도록 합니다.
--		ALTER TABLE TBL_BOOKRENT MODIFY RENT_DATE DATE DEFAULT sysdate;
--		ALTER TABLE TBL_BOOKRENT MODIFY EXP_DATE DATE DEFAULT sysdate+14;
--		INSERT INTO TBL_BOOKRENT (rent_no,MEM_IDX,BCODE)
--				values(bookrent_seq.nextval,10002,'A1102');

-- 		컬럼 디폴트 값 없애고 싶을때
--   	ALTER TABLE TBL_BOOKRENT MODIFY RENT_DATE DATE DEFAULT NULL;


SELECT * FROM BOOK_MEMBER bm ;
SELECT * FROM TBL_BOOK tb ;
SELECT * FROM TBL_BOOKRENT tb ;

-- 1) 현재 sysdate 기준으로 연체 중인 도서 대여 정보 조회
SELECT * FROM TBL_BOOKRENT tb 
WHERE EXP_DATE < SYSDATE AND RETURN_DATE IS NULL ;    -- 도서 대여중 AND 연체

-- 2) 1)에서 대여 중인 도서의 도서코드,회원번호, 연체 일수 계산하여 조회하기
SELECT BCODE ,MEM_IDX ,TRUNC(sysdate) - EXP_DATE "연체일수"		-- 계산값이 0보다 크면 연체 중. 
FROM TBL_BOOKRENT tb 
WHERE RETURN_DATE IS NULL;      -- 도서 대여중 조건식

--3) 연체 중인 도서코드,도서명,대여날짜 조회하기
SELECT tb.BCODE ,title , rent_date
FROM TBL_BOOK tb 
JOIN TBL_BOOKRENT tb2 
ON tb.BCODE = tb2.BCODE AND EXP_DATE < SYSDATE AND RETURN_DATE IS NULL;

--4) 연체 중인 회원번호,회원이름,전화번호 조회하기
SELECT bm.MEM_IDX ,name, tel
FROM BOOK_MEMBER bm  
JOIN TBL_BOOKRENT tb 
ON bm.MEM_IDX = tb.MEM_IDX  AND EXP_DATE < SYSDATE AND RETURN_DATE IS NULL;

--5) 각 도서별 대여회수를 조회하기. 많은 순서부터 정렬.
SELECT bcode,count(*) bcnt
FROM TBL_BOOKRENT tb 
GROUP BY BCODE 
ORDER BY bcnt desc;

--6) 각 회원별 대여회수를 조회하기. 많은 순서부터 정렬.
SELECT MEM_IDX ,count(*) mcnt
FROM TBL_BOOKRENT tb 
GROUP BY MEM_IDX  
ORDER BY mcnt desc;

-- 7) 반납을 현재 sysdate 날짜로 update, 연체일수 컬럼도 update
UPDATE TBL_BOOKRENT 
SET RETURN_DATE = sysdate , DELAY_DAYS = TRUNC(sysdate) - EXP_DATE
WHERE RENT_NO = 5;
SELECT * FROM TBL_BOOKRENT tb ;

-- 8) 대여가능한 책 목록  :합집합(UNION,UNION ALL),교집합(INTERSECT),*차집합*
SELECT bcode FROM TBL_BOOK tb 			-- 전체 도서
MINUS 
SELECT bcode FROM TBL_BOOKRENT tb WHERE RETURN_DATE IS NULL ; 	-- 대여중인 도서

-- 참고 : create /alter/ drop 의 대상인 오라클 객체는 user,table,sequence,view,프로시저,트리거......
-- 9) 뷰(view) 생성 : view 는 가상 테이블.(물리적으로 디스크에 따로 저장되지 않고 논리적으로 만들어지는 테이블)
--				join, 그룹함수 등 복잡한 쿼리에 대해 테이블처럼 다룰 수 있게 함.

CREATE OR REPLACE VIEW v_rent    -- repalce 는 DROP 하고 다시 생성
AS
SELECT tb.BCODE ,title , rent_date
FROM TBL_BOOK tb 
JOIN TBL_BOOKRENT tb2 
ON tb.BCODE = tb2.BCODE AND EXP_DATE < SYSDATE AND RETURN_DATE IS NULL;							

