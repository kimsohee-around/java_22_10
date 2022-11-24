-- 제약 조건 : 테이블에 부적절한 데이터가 저장되는 것을 방지.
--			 저장할 데이터의 규칙을 적용. constraint(제약)
-- 1) NOT NUll  2)UNIQUE (유일한)   3) PRIMARY KEY

CREATE TABLE tbl_const1(
	mno number(5),
	id number(5) NOT NULL    -- NOT NULL 제약조건 컬럼에 적용
);

INSERT INTO tbl_const1 VALUES (100,999);

SELECT * FROM tbl_const1;

-- 제약조건 적용
INSERT INTO tbl_const1(mno) VALUES (200);    -- 오류 : id컬럼값은 필수 입력 항목
INSERT INTO tbl_const1(id) VALUES (998);  -- mno는 NULL 

-- 2) UNIQUE 제약조건 : null 은 허용, 동일한 컬럼에 동일한 값은 저장 못함.
CREATE TABLE tbl_const2(
	mno number(5),
	id number(5) UNIQUE 		
);
INSERT INTO tbl_const2 VALUES (100,999);
INSERT INTO tbl_const2(mno) VALUES (200);    
INSERT INTO tbl_const2(id) VALUES (998);
-- 같은 값을 한번더 insert 
INSERT INTO tbl_const2(mno) VALUES (200);
INSERT INTO tbl_const2(id) VALUES (998);		-- 오류 : 
INSERT INTO tbl_const2 VALUES (100,999);

SELECT * FROM tbl_const2;

-- 3) 기본키 : 테이블의 row(행)를 구별합니다. not null 과 unique 가 적용
--  참고 : default 로 기본값을 저장합니다.(값을 지정안했을 때)
CREATE TABLE tbl_member2 (
	mno NUMBER(5) PRIMARY KEY ,    
	name varchar2(50) NOT NULL ,   -- 이름
	email varchar2(100) UNIQUE ,  -- 이메일
	join_date DATE	DEFAULT sysdate   -- sysdate : 오라클 함수(현재날짜/시간)		
);
-- 테이블에서 기본키 컬럼을 설정하는 것은 필수.
-- 기본키 컬럼은 1개 컬럼 (*또는 여러개 컬럼을 묶어서 할수 있습니다.)

INSERT INTO TBL_MEMBER2 VALUES (1,'김모모','momo@naver.com','2022-11-24');
INSERT INTO TBL_MEMBER2 VALUES (1,'박나연','parkny@gmail.com','2022-10-24');  -- 오류
INSERT INTO TBL_MEMBER2 VALUES (3,NULL,'slgichoi@naver.com','2021-09-24');   -- 오류
INSERT INTO TBL_MEMBER2 VALUES (4,'박사나','parkny@gmail.com','2022-10-05');
INSERT INTO TBL_MEMBER2 VALUES (5,'이나연','parkny@gmail.com','2020-10-05');   -- 오류
INSERT INTO TBL_MEMBER2(mno,name) VALUES (6,'강쯔위');     -- 필수 입력컬럼만 저장
SELECT * FROM TBL_MEMBER2 tm ;

-- 4) check 제약 조건 : 컬럼값의 범위를 설정
-- 참고 : 새로운 컬럼을 추가하는 명령은 테이블 변경  : alter table 테이블명 add 컬럼명
ALTER TABLE TBL_MEMBER2 ADD address varchar2(100);
ALTER TABLE TBL_MEMBER2 ADD age number(3) CHECK (age BETWEEN 11 AND 99);
-- age 컬럼의 필드값을 11~99 사이로 하는 check 조건 테스트
INSERT INTO TBL_MEMBER2(mno,name) VALUES (7,'이순신');		-- CHECK 값 범위는 NULL 허용
INSERT INTO TBL_MEMBER2(mno,name,age) VALUES (8,'이순신',11);
INSERT INTO TBL_MEMBER2(mno,name,age) VALUES (9,'강감찬',111);   -- 오류 : 허용된 범위 아님

ALTER TABLE TBL_MEMBER2 ADD gender char(20) CHECK (gender IN ('M','F','MF'));
INSERT INTO TBL_MEMBER2(mno,name,gender) VALUES (10,'최영웅','M'); 
INSERT INTO TBL_MEMBER2(mno,name,gender) VALUES (11,'최영웅','C');   -- 오류 : 

-- 기존테이블에서 이미 있는 컬럼을 제거
ALTER TABLE TBL_MEMBER2 DROP COLUMN gender;

-- SQL 명령어에서 주로 쓰이는 단어 : 
-- (오라클 객체-테이블,사용자.. 대상)create, alter, drop , add   / (데이터 행/컬럼 대상) insert , update ,delete 

-- 참고 : between 연산
SELECT * FROM TBL_MEMBER2 tm  WHERE mno >=3 AND mno <=6;	-- 3~6	
SELECT * FROM TBL_MEMBER2 tm where mno BETWEEN 3 AND 6;



