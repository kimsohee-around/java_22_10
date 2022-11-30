-- 집계(통계) 함수 : 합계(sum),평균(avg:average),개수(count),표준편차..

-- 예제 tbl_sqscore 테이블
SELECT * FROM TBL_SQSCORE ts ;

-- 평균과 총점은 number(숫자) 형식에서만.
-- 1. 테이블 행(데이터) 몇개?
SELECT count(*)	"전체행개수"		-- count 행의 개수 : 컬럼지정 대신 *
FROM TBL_SQSCORE ts ;
-- 2. `점수`컬럼값의 합계?
SELECT sum(jumsu) "ScoreSum"	--식별자 대소문자구분할때 "" 사용
FROM TBL_SQSCORE ts ;

-- 3. `점수`컬럼값의 평균?
SELECT avg(jumsu) ScoreAvg		-- 대소문자구분없음.
FROM TBL_SQSCORE ts ;
SELECT round(avg(jumsu))    -- 소수점 이하 반올림 (소수점이하 자리수 0)
FROM TBL_SQSCORE ts ;

-- 4. `국어` 과목의 개수?
SELECT count(*) "국어개수"
FROM TBL_SQSCORE ts 
WHERE SUBJECT ='국어';

SELECT * FROM TBL_SQSCORE ts ;
-- 5. `국어` 과목의 평균?
SELECT avg(jumsu) 국어평균		-- 컬럼명에 별칭: 국어평균
FROM TBL_SQSCORE ts 
WHERE SUBJECT ='국어';

INSERT INTO TBL_SQSCORE 
VALUES (seq_score.nextval,'2019019','수학',89,'최지성','2020_2');
INSERT INTO TBL_SQSCORE 
VALUES (seq_score.nextval,'2020017','수학',82,'최지성','2020_2');
-- 6. 학번 `2019019`인 행 개수?
-- 7. `2019019` 학번의 평균,총점?

-- 전체조회
SELECT count(*) "개수",avg(jumsu) "평균",sum(jumsu) "합계"
FROM TBL_SQSCORE ts ;

-- 8. `2019017` 학번의 개수,평균,총점?
SELECT count(*) "개수",avg(jumsu) "평균",sum(jumsu) "합계"
FROM TBL_SQSCORE ts 
WHERE STUNO ='2019017';
-- 9. `2021001` 학번의 개수,평균,총점?
SELECT count(*) "개수",avg(jumsu) "평균",sum(jumsu) "합계"
FROM TBL_SQSCORE ts 
WHERE STUNO ='2021001';
-- 10. `2020017` 학번의 개수,평균,총점?
SELECT count(*) "개수",avg(jumsu) "평균",sum(jumsu) "합계"
FROM TBL_SQSCORE ts 
WHERE STUNO ='2020017';
-- 확인 : 집계함수에는 다른 컬럼 포함 안됩니다.(오류)
SELECT stuno,count(*) "개수",avg(jumsu) "평균",sum(jumsu) "합계"
FROM TBL_SQSCORE ts 
WHERE STUNO ='2020017';

-- join과 집계함수
-- '김모모'의 성적 총점과 평균 
--(조건식에 사용하는 컬럼과 조회하는 컬럼이 각각 다른 테이블이므로 조인부터 합니다.)
-- 1단계 : 조인
SELECT * FROM TBL_STUDENT stu
JOIN TBL_SQSCORE sco
ON stu.STUNO = sco.STUNO ;

-- 2단계 : 집계함수
SELECT sum(jumsu) , avg(jumsu)
FROM TBL_STUDENT stu
JOIN TBL_SQSCORE sco
ON stu.STUNO = sco.STUNO;

-- 3단계 : 조건식
SELECT sum(jumsu) , avg(jumsu)
FROM TBL_STUDENT stu
JOIN TBL_SQSCORE sco
ON stu.STUNO = sco.STUNO
AND NAME ='김모모';
-- 확인 : 집계함수에는 다른 컬럼 포함 안됩니다.(오류)
SELECT name,sum(jumsu) , avg(jumsu)
FROM TBL_STUDENT stu
JOIN TBL_SQSCORE sco
ON stu.STUNO = sco.STUNO
AND NAME ='김모모';

