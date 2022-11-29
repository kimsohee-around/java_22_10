/*
 * CREATE TABLE tbl_member2 (
	mno NUMBER(5) PRIMARY KEY ,    
	name varchar2(50) NOT NULL ,   -- 이름
	email varchar2(100) UNIQUE ,  -- 이메일
	join_date DATE	DEFAULT sysdate   -- sysdate : 오라클 함수(현재날짜/시간)		
);
 * */

SELECT * FROM tbl_member2;

-- DML : update, delete  *조건식을 이용해서 실행이 기본.(모든행에 대한 실행은 위험.)
-- update : 기존 데이터의 수정
UPDATE TBL_MEMBER2 SET age = 99;		-- 모든 행(row) 의 age 컬럼값이 변경 
UPDATE TBL_MEMBER2 	-- UPDATE 테이블명
SET age = 12		-- SET 컬럼명=값, 을 여러개 나열 가능
WHERE mno=6;		-- 조건식 : 특정 행의 컬럼값 변경

UPDATE TBL_MEMBER2 			
SET age = 23, email='test11@daum.net'
WHERE mno = 7;

-- delete : 데이터 행 삭제
DELETE FROM TBL_MEMBER2 tm -- 테이블명
WHERE mno=99;		-- 조건식

-- 트랜잭션 모드 : 디비버 또는 명령어로 클라이언트에서 서버동작 설정. 
-- 		ㄴ auto : insert, update, delete 한 실행결과가 data file 에 즉시 반영
--		ㄴ manual :                         실행결과를 data file 에 반영하기 위해 commit 명령
--											                    취소하기 위해 rollback 명령

TRUNCATE TABLE TBL_MEMBER2 ;	-- ROLLBACK 할 수없는 명령(DDL). 데이터를 모두 삭제하고 싶을 때만 사용.
DELETE FROM tbl_member2; 		-- ROLLBACK 가능

-- 테이블 삭제
DROP TABLE TBL_MEMBER2 ;