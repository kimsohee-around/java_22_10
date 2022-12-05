-- SQL문을 해석해보세요.

-- jobs 테이블
SELECT * FROM jobs;

SELECT job_title FROM JOBS j 
WHERE MIN_SALARY >=10000;

SELECT * FROM JOBS j 
WHERE JOB_TITLE ='programmer';		-- 'Programmer' 값은 조회 안됨.

SELECT * FROM JOBS j 
WHERE lower(JOB_TITLE) ='programmer';		--소문자변환(대소문자 구분없도록 함.)

SELECT max(max_salary) FROM JOBS j ;

-- locations 테이블
SELECT * FROM LOCATIONS ;
SELECT postal_code FROM LOCATIONS l 
WHERE CITY = 'London';		-- 컬럼 값이 null

SELECT postal_code FROM LOCATIONS l 
-- WHERE CITY = 'seattle';		-- 조회결과 행이 없음.
WHERE UPPER(city) = 'SEATTLE';		-- 대문자 변환

SELECT * FROM LOCATIONS l 
WHERE LOCATION_ID IN (1700,2700,2500) AND city=INITCAP('oxford');

-- job_history 와 employee 테이블 조인
SELECT * FROM JOB_HISTORY jh2 ;
SELECT * FROM EMPLOYEES e 
JOIN JOB_HISTORY jh 
ON e.EMPLOYEE_ID = jh.EMPLOYEE_ID 
AND FIRST_NAME = 'Jonathon' AND LAST_NAME ='Taylor';

SELECT e.EMPLOYEE_ID ,FIRST_NAME ,LAST_NAME ,e.JOB_ID ,start_date,end_date 
FROM EMPLOYEES e 
JOIN JOB_HISTORY jh 
ON e.EMPLOYEE_ID = jh.EMPLOYEE_ID 
AND FIRST_NAME = 'Jonathon' AND LAST_NAME ='Taylor';

SELECT * 
FROM EMPLOYEES e 
WHERE HIRE_DATE >= '2003-01-01';		-- 입사일자 2003년 1월 1일 이후

SELECT * 
FROM EMPLOYEES e 
WHERE HIRE_DATE < '2003-01-01';

-- 2003년도 입사한 직원 조회 
SELECT * FROM EMPLOYEES e 
WHERE hire_date BETWEEN '2003-01-01' AND '2003-12-31';

SELECT * FROM EMPLOYEES e 
WHERE to_char(HIRE_DATE,'YYYY') = '2003';

-- 집계함수 테스트
SELECT count(*) FROM EMPLOYEES e ;
SELECT count(*) FROM EMPLOYEES e 
WHERE JOB_ID ='IT_PROG';

SELECT avg(salary) FROM EMPLOYEES e ;
SELECT avg(salary) FROM EMPLOYEES e 
WHERE JOB_ID ='IT_PROG';

SELECT max(salary) FROM EMPLOYEES e ;
SELECT max(salary) FROM EMPLOYEES e 
WHERE JOB_ID ='IT_PROG';

SELECT min(salary) FROM EMPLOYEES e ;
SELECT min(salary) FROM EMPLOYEES e 
WHERE JOB_ID ='IT_PROG';

SELECT * FROM EMPLOYEES e 				-- 외부쿼리
WHERE SALARY < 
(SELECT avg(salary) FROM EMPLOYEES);    -- 서브쿼리(내부쿼리)

-- 외부쿼리가 조건식을 모든 행에 대해 검사할 때마다 내부쿼리가 실행되므로
-- 처리속도 늦어지는 영향을 미칠수 있습니다. --> 조인연산으로 가능한 경우에는 변경

-- 서브쿼리 활용 : 'IT_PROG ' 중에 `전체 직원 평균급여` 이하인 직원을 조회하기
SELECT * FROM EMPLOYEES e 				-- 외부쿼리
WHERE SALARY < 
(SELECT avg(salary) FROM EMPLOYEES)
AND JOB_ID ='IT_PROG';


-- jobs 테이블의 min_salary 가 `전체 직원 평균급여` 보다 작은 job 출력하기
SELECT * FROM JOBS j 
WHERE MIN_SALARY < (SELECT avg(salary) FROM EMPLOYEES);
-- jobs 테이블의 min_salary 가 `전체 직원 평균급여` 보다 많은 job 출력하기
SELECT * FROM JOBS j 
WHERE MIN_SALARY >= (SELECT avg(salary) FROM EMPLOYEES);

SELECT * FROM COUNTRIES c ;			-- 25개 행
SELECT * FROM LOCATIONS l ;			-- 해외 및 국내지점 정보를 저장한 테이블, 23개행
SELECT DISTINCT country_id			-- DISTINCT 는 중복을 제거하고 컬럼값을 조회(컬럼1개)
FROM LOCATIONS l ;				-- 14개 행

-- countryies 와 location 테이블을 join하면 몇개 행이 조회되나요?
SELECT c.COUNTRY_ID ,COUNTRY_NAME,street_address,city  FROM COUNTRIES c 
JOIN LOCATIONS l 						-- 동등 조인
ON c.COUNTRY_ID =l.COUNTRY_ID ;

SELECT *  --c.COUNTRY_ID ,COUNTRY_NAME,street_address,city  
FROM COUNTRIES c 
LEFT OUTER JOIN LOCATIONS l 	-- 외부 조인(left : 왼쪽테이블의 country_id 값을 모두 포함)
ON c.COUNTRY_ID =l.COUNTRY_ID ;  --  지점이 국가 country_id도 조인결과로 조회





