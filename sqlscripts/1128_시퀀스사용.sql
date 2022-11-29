-- 오라클은 시퀀스를 이용하여 자동증가 되는 값을 만듭니다.
-- 테이블 컬럼에 일련번호 값을 갖게 할때 시퀀스를 사용하면 됩니다.
-- mysql 에서는 auto increment(자동 증가) 속성 설정

-- 테스트
CREATE SEQUENCE seq_test;    -- 1부터 시작해서 1씩 증가 되는 값으로 생성

-- 오라클은 dual 테이블로 수식,함수 등 결과값을 확인
SELECT 22+199 FROM dual;

-- 시퀀스 함수 : nextval, currval
SELECT seq_test.nextval FROM dual;		-- 시퀀스 다음값 조회
SELECT seq_test.currval FROM dual;		-- 시퀀스 현재값 조회

CREATE TABLE tbl_sqscore(
	sno NUMBER PRIMARY KEY,		-- 시퀀스 이용하여 일련번호 저장.
	stuno char(7),		
	subject nvarchar2(20),
	jumsu number(3) NOT NULL ,
	teacher nvarchar2(20) NOT NULL ,
	term char(6) NOT NULL,
	FOREIGN key(stuno) REFERENCES tbl_student(stuno)  
);
CREATE SEQUENCE seq_score
	START WITH 20001;	-- 시작값

INSERT INTO tbl_sqscore
VALUES (seq_score.nextval,'2021001','국어',89,'이나연','2022_1');
INSERT INTO tbl_sqscore
VALUES (seq_score.nextval,'2021001','영어',78,'김길동','2022_1');
INSERT INTO tbl_sqscore
VALUES (seq_score.nextval,'2021001','과학',67,'박세리','2021_2');
INSERT INTO tbl_sqscore
VALUES (seq_score.nextval,'2019019','국어',92,'이나연','2019_2');
INSERT INTO tbl_sqscore
VALUES (seq_score.nextval,'2019019','영어',85,'박지성','2019_2');
INSERT INTO tbl_sqscore
VALUES (seq_score.nextval,'2019019','과학',88,'박세리','2020_1');

SELECT * FROM TBL_SQSCORE ts ;
-- 기본키 컬럼 조건식은 1개 행만 조회(=> 행을 식별)
SELECT * FROM TBL_SQSCORE ts WHERE sno = 20002;
















