-- 예제 테이블
CREATE TABLE tbl_member (
	mno NUMBER(5),    --회원번호
	name varchar2(50),   -- 이름
	email varchar2(100),  -- 이메일
	join_date DATE			-- 가입날짜 , 날짜형식 : 날짜 패턴 문자열이 자동으로 날짜형식 변환
							-- 출력형식 :  yyyy-mm-dd HH:MM:SS.ms
);

-- 예제 데이터
INSERT INTO TBL_MEMBER VALUES (1,'김모모','momo@naver.com','2022-11-24');
INSERT INTO TBL_MEMBER VALUES (2,'박나연','parkny@gmail.com','2022-10-24');
INSERT INTO TBL_MEMBER VALUES (3,'최슬기','slgichoi@naver.com','2021-09-24');
INSERT INTO TBL_MEMBER VALUES (4,'박사나','san@gmail.com','2022-10-05');
INSERT INTO TBL_MEMBER VALUES (5,'이나연','nayeon@gmail.com','2020-10-05');
INSERT INTO TBL_MEMBER VALUES (6,'강나현','nahyeon@gmail.com','2021-05-05');
INSERT INTO TBL_MEMBER VALUES (7,'나쯔위','na1234@gmail.com','2021-05-05');
INSERT INTO TBL_MEMBER(MNO,NAME,JOIN_DATE) VALUES (8,'강감찬','2020-05-05');
INSERT INTO TBL_MEMBER(MNO,NAME,JOIN_DATE) VALUES (9,'이순신','2020-05-05');


-- select 기본형식
-- select 조회할 컬럼 목록 from 테이블명 [where 조건식];  
SELECT mno,join_date FROM TBL_MEMBER tm ;
SELECT * FROM TBL_MEMBER tm ;		-- *는 모든 컬럼

-- [where 조건식] 조건식은 컬럼에 대해 조회하려는 내용을 관계/논리식으로 작성.
-- 1) 이름 name 컬럼 조건식
SELECT * FROM TBL_MEMBER tm  WHERE NAME ='박나연';
SELECT * FROM TBL_MEMBER tm  WHERE NAME ='나연';	-- 조회 결과 없음

-- 2) 문자열의 부분 일치 검색
SELECT * FROM TBL_MEMBER tm WHERE name LIKE '박%';	-- %문자는 상관없음. 시작은 '박';
-- 성은 상관없음. '나연' 검색
SELECT * FROM tbl_member tm WHERE name LIKE '%나연';
-- '나' 문자가 있는 이름 검색(위치는 상관없음.)
SELECT * FROM tbl_member tm WHERE name LIKE '%나%';

-- 3) 여러가지 값으로 조회 : 이름이 김모모 또는 박나연
SELECT * FROM TBL_MEMBER tm WHERE name ='김모모' OR name ='박나연';
SELECT * FROM TBL_MEMBER tm WHERE name IN ('김모모','박나연');		-- OR 연산에 해당
SELECT * FROM TBL_MEMBER tm WHERE name NOT IN ('김모모','박나연');		

SELECT * FROM TBL_MEMBER tm WHERE name ='김모모' AND name ='박나연';   -- 2가지 값 동시 만족

-- 4) 이메일 email 컬럼의 null값 조회
SELECT * FROM TBL_MEMBER tm WHERE EMAIL IS NULL ;
SELECT * FROM TBL_MEMBER tm WHERE EMAIL IS NOT NULL ;

-- 수치값 또는 날짜 컬럼을 조건식으로 한다면 관계식 : > , < , >= , <= , =
-- 예시 : 1) mno 컬럼값이 5 조회   2) mno 컬럼 값이 4미만 조회   3) mno 컬럼값 1,2,5,7 조회

SELECT * FROM TBL_MEMBER tm WHERE mno =5;	-- mno는 number(수치:정수,실수) 타입
SELECT * FROM TBL_MEMBER tm WHERE mno ='5';		-- 자동 캐스팅 : 문자열에서 number로	
SELECT * FROM TBL_MEMBER tm WHERE mno ='abc';		-- 오류 :자동 캐스팅 못하는 문자열

SELECT * FROM TBL_MEMBER tm WHERE mno <4;
SELECT * FROM TBL_MEMBER tm WHERE mno IN (1,2,5,7);












