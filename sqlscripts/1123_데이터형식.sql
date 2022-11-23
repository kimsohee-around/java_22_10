-- 테스트 : 새로운 테이블(엔티티,관계) test 만들기
CREATE TABLE test (
	-- 테이블의 저장할 데이터 항목(속성) : 컬럼
	id NUMBER,					-- 컬럼명(식별자) 데이터형식
	name varchar2(20),
	etc char(10)
);

-- 11월23일 : 1. 문자열 데이터 형식 

-- CHAR(길이) : 고정길이 , 단위는 바이트 
-- VARCHAR(길이) : 오라클에서 존재하지만 사용하지 않는 예비자료형.
-- VARCHAR2(길이) : 가변형길이 단위 바이트, 길이는 최대길이이고 실제로 메모리는 데이터크기만큼 사용합니다.
--				최대 2000바이트입니다. UTF-8 인코딩에서 한글은 3바이트, 영문/숫자/기호는 1바이트
CREATE TABLE tbl_string(
	acol char(10),			-- 10바이트 고정길이 : 데이터를 꼭 10바이트에 저장.
	bcol varchar2(10),		-- 10바이트 가변길이 : 데이터 크기에 따라 정해진다.
	ccol nchar(10),			-- 10개 문자 고정길이
	dcol nvarchar2(10)		-- 10개 문자 가변길이
);

-- 테이블에 데이터 추가 : 명령어는 insert 오늘은 첫 수업이니 GUI 기능사용
--                 : GUI 로 하면 속도가 작업 속도가 느려요.
--INSERT INTO 테이블명 (컬럼명,컬럼명,....) VALUES (컬럼순서에 대응되는 값,값,...);
-- 고정길이 형식은 지정된 길이를 맞추기 위해 공백을 추가
-- 1) 길이가 바이트로 지정된 컬럼
INSERT INTO TBL_STRING (acol) VALUES ('abcd');
INSERT INTO TBL_STRING (acol) VALUES ('abcd123456');
INSERT INTO TBL_STRING (acol) VALUES ('abcd1234567');
INSERT INTO TBL_STRING (acol) VALUES ('가나');			-- 한글은 1글자가 3바이트
INSERT INTO TBL_STRING (acol) VALUES ('가나다');
INSERT INTO TBL_STRING (acol) VALUES ('가나다라');
-- 2) 길이가 문자로 지정된 컬럼
-- 위의 6개 insert 를 ccol 으로 insert 실행하기
INSERT INTO TBL_STRING (ccol) VALUES ('abcd');
INSERT INTO TBL_STRING (ccol) VALUES ('abcd123456');
INSERT INTO TBL_STRING (ccol) VALUES ('abcd1234567');
INSERT INTO TBL_STRING (ccol) VALUES ('가나');			
INSERT INTO TBL_STRING (ccol) VALUES ('가나다');
INSERT INTO TBL_STRING (ccol) VALUES ('가나다라');


-- 테이블의 데이터를 조회는 명령어
-- TBL_STRING 테이블의 acol 컬럼을 조회하기
SELECT acol FROM TBL_STRING ts ;		-- ts는 별칭으로 디비버가 자동으로 만들어줍니다.
SELECT acol,bcol FROM TBL_STRING ts ;
SELECT * FROM TBL_STRING ts ;			-- 테이블의 모든 컬럼 조회 (* 기호 사용)



