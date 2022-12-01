-- 문자열 함수 : 자바와 비슷한 내용으로 분석
-- 함수,수식 결과값 확인할 때 오라클 dual 테이블 사용
SELECT concat('java',' hello') FROM dual;
SELECT 'java' || ' hello!' FROM dual;

-- 실제로는 테이블의 컬럼으로 함수 실행합니다.
SELECT INITCAP('hello') FROM dual;   -- initail capital  : 첫번째 대문자 
SELECT UPPER('hello') FROM dual; 	-- 대문자로 변환
SELECT LOWER('OraCle') FROM dual; 	-- 소문자로 변환
SELECT LENGTH('oracle') FROM dual; 
SELECT SUBSTR('java program',3,5)   	-- 부분 추출(문자열,위치,길이) 결과 : 
FROM dual;	  
SELECT SUBSTR('java program',-5,3)		-- 부분 추출 결과 : 위치음수이면 뒤에서부터  
FROM dual;
SELECT REPLACE('java program','pro','프로')		--문자열 바꾸기
FROM dual;
SELECT instr('java program','og')		-- 자바의 indexOf 
FROM dual;
SELECT trim(' java program   ')				-- 공백(불필요한 앞뒤 공백)제거
FROM dual;
SELECT LENGTH(trim(' java program   ')) FROM dual;

-- 숫자 함수(정수 또는 실수 number를 대상으로 하는 함수)
-- abs(n) : 절대값
-- trunc(숫자,자리수) : 자리수 맞추기 위해서 버림   3.177567  -> 3.17
SELECT trunc(3.177567,2) FROM dual;
-- round(숫자,자리수) :                  반올림  3.177567 -> 3.18
SELECT ROUND(3.177567,2) FROM dual; 
-- ceil(숫자) : 실수를 정수로 올림으로 변환
SELECT ceil(3.177567) FROM dual;
-- floor(숫자) : 실수를 정수로 내림으로 변환
SELECT floor(3.177567) FROM dual;

-- 외부평가 실기에 자주 사용하는 함수.
-- 변환함수 : nvl()  : 널값을 지정된 값으로 출력,  decode() 조건에 따라 출력값을 정함.
-- 					decode(컬럼명,'A','VIP','B','일반','C','직원') 으로 하면
--					지정된 컬럼값이 'A' 일때는 'VIP' 출력,'B'는'일반','C'는 '직원' 출력함
-- 예시 : select custno,decode(grade,'A','VIP','B','일반','C','직원') from member_tbl_02;

-- 날짜함수:
SELECT sysdate,SYSTIMESTAMP 			-- 서버의 날짜(초단위)와 시간(ms)
FROM dual;

SELECT CURRENT_DATE ,CURRENT_TIMESTAMP   -- 클라이언트의 날짜와 시간(tz 표시)
FROM dual;

SELECT * FROM v$timezone_names;			-- 오라클의 타임존 저장 테이블

CREATE TABLE tbl_datentime(
	adate DATE,
	b_timestamp timestamp,
	c_timewz timestamp(6) WITH time ZONE   
	-- 6이 0.000001 (us) , 3이면 ms,9이면 ns 단위까지 표시
);

-- insert 값 문자열에서 날짜타입으로 자동변환
INSERT INTO TBL_DATENTIME(adate) VALUES ('2022-11-26');
INSERT INTO TBL_DATENTIME(b_timestamp) VALUES ('2022-11-27');
INSERT INTO TBL_DATENTIME(c_timewz) VALUES ('2022-11-28');   -- 오류:자동변환X

INSERT INTO TBL_DATENTIME(adate) VALUES ('2022-11-26 1:11');	-- 오류
INSERT INTO TBL_DATENTIME(b_timestamp) VALUES ('2022-11-27 2:22');  -- 실행
INSERT INTO TBL_DATENTIME(c_timewz) VALUES ('2022-11-28 3:33'); -- 오류

INSERT INTO tbl_datentime(adate) values(sysdate);
INSERT INTO tbl_datentime(b_timestamp) values(sysdate);
INSERT INTO tbl_datentime(c_timewz) values(sysdate);

INSERT INTO tbl_datentime(adate) values(systimestamp);
-- 컬럼형식 timestamp 이고 값도 systimestamp 이면 1/1000 초까지 출력
INSERT INTO tbl_datentime(b_timestamp) values(systimestamp);
INSERT INTO tbl_datentime(c_timewz) values(systimestamp);

-- **to_date 함수 : 문자열을 날짜형식으로 패턴 지정해서 변환(보통 insert)
INSERT INTO TBL_DATENTIME(adate) 
VALUES ('2022-11-26 13:11');  -- 오류 : DATE 타입은 시간까지 변환 못함
SELECT * FROM tbl_datentime;

INSERT INTO TBL_DATENTIME(adate) 
VALUES (to_date('2022-11-26 1:11','yyyy-mm-dd HH:MI'));  -- 참고 :HH는 12시 기준(많이쓰이지 않습니다.)

INSERT INTO TBL_DATENTIME(adate) 
VALUES (to_date('2022-11-26 13:11','yyyy-mm-dd HH:MI'));  -- 오류 : HH는 12시 형식

INSERT INTO TBL_DATENTIME(adate) 
VALUES (to_date('2022-11-26 13:12','yyyy-mm-dd HH24:MI'));  -- **HH24는 24시간 기준**

INSERT INTO TBL_DATENTIME(adate) 
VALUES (to_date('2022-11-26 13:13:12','yyyy-mm-dd HH24:MI:SS'));  
-- **to_char 함수 : 날짜형식 컬럼을 원하는 패턴 문자열로 변환 출력(select)
SELECT to_char(c_timewz,'yyyy-mm-dd HH:MI PM') 
FROM TBL_DATENTIME ;
SELECT c_timewz FROM tbl_datentime;

-- 날짜 관련 처리함수
SELECT ADD_MONTHS(SYSDATE,3)     --오늘날짜  3개월 이후
FROM dual ;

SELECT TO_CHAR(SYSDATE, 'MONTH') CHARTEST 
FROM dual ;  -- 11월

SELECT TO_CHAR(SYSDATE, 'YYYY') CHARTEST 
FROM dual ;  -- 

SELECT 
TO_CHAR(ADD_MONTHS(SYSDATE,3),'YYYY/MM/DD')   -- 문자열패턴 기호 - 또는 / 또는 구분기호없음가능
FROM dual ;

SELECT MONTHS_BETWEEN(TO_DATE('2022/06/05') , -- 지정된 2개의 날짜 사이에 간격(월).결과는 소수점
TO_DATE('2022/09/23')) FROM dual ;

SELECT TRUNC(SYSDATE) - TO_DATE('20171110', 'YYYYMMDD') -- 2개의 날짜형식 값 간격(일)
FROM DUAL;    -- 2개의 날짜의 간격(일) . TRUNC(SYSDATE)는 일(day)까지로 변환

SELECT round(to_date('2022-06-28'),'YEAR')		-- 년도를 반올림으로 구하기 (1월~6월은 년도 증가X)
FROM dual;		-- '2022-06-28' 자동변환변환 형식은 패턴 생략

SELECT round(to_date('2022-07-28'),'YEAR')      -- 년도를 반올림으로 구하기 (7월~12월은 년도 증가)
FROM dual;

SELECT TO_DATE('2017-12-02','YYYY-MM-DD') -  TO_DATE('2017-11-29', 'YYYY-MM-DD') 
FROM DUAL;









