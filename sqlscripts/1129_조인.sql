-- 테이블 JOIN : 둘 이상의 테이블(주로 참조관계의 테이블 또는 공통컬럼을 갖는 테이블)을 연결하여 데이터를 조회하는 명령
--           동등 조인은 둘 이상의 테이블이 공통된 컬럼을 갖고 이 컬럼값이 '같다(=)'를 이용하여 join 합니다.
--           형식1) 
--           select ~~~ from 테이블1 a,테이블2 b    -- a와 b는 테이블이름의 별칭(짧은 이름)
--			 where a.공통컬럼=b.공통컬럼;	
--           형식2) JOIN 키워드 사용 (ANSI 표준)
--			 SELECT * FROM 테이블1 a 
--		     JOIN 테이블2 b 
--		     ON a.공통컬럼=b.공통컬럼; 

-- 사전 확인 : 조건이 없는 형식은 사용하지 않습니다.
SELECT * 
FROM TBL_STUDENT ts ,TBL_SCORE ts2 ;
-- ORDER BY ts.STUNO ;

-- 형식 1 테스트
SELECT * 			-- 모든 컬럼
FROM TBL_STUDENT ts ,TBL_SCORE ts2 		-- 조인할 테이블 2개 나열
WHERE ts.STUNO = ts2.STUNO ;			-- `조인할 테이블의 공통컬럼이 같을때` 라는 조건(join 에서 필수조건) -> 조인 조건

SELECT ts.STUNO ,NAME ,AGE ,ts2.SUBJECT ,ts2.JUMSU  -- 컬럼 지정 (ts2.XXXX 에서 ts2는 생략가능)
FROM TBL_STUDENT ts ,TBL_SCORE ts2 
WHERE ts.STUNO = ts2.STUNO ;

-- 형식 2 테스트
SELECT *		
FROM TBL_STUDENT ts 
JOIN TBL_SCORE ts2 
ON ts.STUNO = ts2.STUNO ;

SELECT ts.STUNO ,NAME ,AGE ,ts2.SUBJECT ,ts2.JUMSU  -- 컬럼 지정		
FROM TBL_STUDENT ts 
JOIN TBL_SCORE ts2 
ON ts.STUNO = ts2.STUNO ;

-- join 과 추가 조건식
SELECT ts.STUNO ,NAME ,AGE ,ts2.SUBJECT ,ts2.JUMSU  -- 컬럼 지정
FROM TBL_STUDENT ts ,TBL_SCORE ts2 
WHERE ts.STUNO = ts2.STUNO AND ts2.SUBJECT ='영어' ;

SELECT ts.STUNO ,NAME ,AGE ,ts2.SUBJECT ,ts2.JUMSU  -- 컬럼 지정		
FROM TBL_STUDENT ts 
JOIN TBL_SCORE ts2 
ON ts.STUNO = ts2.STUNO AND ts2.SUBJECT ='영어' ;

--  이름이 `김모모`의 성적을 조회하기 : 조회 컬럼은 학번,이름,주소,과목,점수


--  이름이 `박나래`의 성적을 조회하기 : 조회 컬럼은 학번,이름,주소,과목,점수






