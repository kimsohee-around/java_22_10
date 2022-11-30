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

-- 날짜함수:
