-- 데이터 타입 number  : 자바 정수와 실수 타입 형식 지정  
-- number(정밀도,소수점이하 자리수) 


-- 테스트 테이블
CREATE TABLE tbl_number(
	xcol NUMBER,			-- 정밀도 지정 안하면 최대 38자리(자바 BigDecimal) - 정수자리와 실수자리 
	ycol NUMBER(5),			-- 정수로 최대 5자리(소수점 이하 없음.-소수점 이하 반올림)
	zcol number(7,2),		-- 전체 자리수 최대 7자리, 소수점 이하 2자리(고정)
	zcol2 number(2,5)		-- 소수점이하 최대 5자리(0이 3개 고정) , 0아닌 유효 숫자 최대 2자리
);

-- 0. 모든 컬럼값 정상 실행
INSERT INTO TBL_NUMBER VALUES (123456789,12345,12345.67,0.00012);
--   0.00010 에서 앞에 0 3개는 유효한 값 , 마지막 0은 무효한 숫자
--   12300 에서 0 2개는 유효한 값,  00123 에서 0 2개는 무효한 숫자

-- 확인
SELECT * FROM TBL_NUMBER tn ;

-- 1. xcol 테스트
INSERT  INTO TBL_NUMBER (xcol) VALUES (12345.678);    -- 정수,소수점 포함 최대 38자리

-- 2. ycol 테스트
INSERT  INTO TBL_NUMBER (ycol) VALUES (12345.678);    -- 반올림해서 정수로 저장
INSERT  INTO TBL_NUMBER (ycol) VALUES (123456.678);   -- 오류 :(5)에서 정수는 최대 5자리
INSERT  INTO TBL_NUMBER (ycol) VALUES (456.6);   -- 457
INSERT INTO TBL_NUMBER (ycol) VALUES (99999);
INSERT INTO TBL_NUMBER (ycol) VALUES (-99999);

-- 3. zcol 테스트 : zcol number(7,2) 에서 정수자리는 최대 7-2=5 입니다.
INSERT INTO TBL_NUMBER (zcol) VALUES (1235.6);
INSERT INTO TBL_NUMBER (zcol) VALUES (123456.6);		--오류 : 정수 최대자리수 초과
INSERT INTO TBL_NUMBER (zcol) VALUES (1234.678);

-- 4. zcol2 테스트 : zcol2 number(2,5) 정밀도 precision  < 소수점자리수	
--		1미만의 실수를 표현(정수자리는 0). 유효한 0 개수는 5-2=3 (고정)
INSERT INTO TBL_NUMBER VALUES (123456789,345,235.67,0.00010);
INSERT INTO TBL_NUMBER VALUES (123456789,345,235.67,0.000126);   -- 0.00013
INSERT INTO TBL_NUMBER VALUES (123456789,345,235.67,0.0012);	-- 오류: 유효한 0개수가 부족
