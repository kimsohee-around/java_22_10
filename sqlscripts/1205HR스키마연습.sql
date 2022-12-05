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

SELECT e.EMPLOYEE_ID ,FIRST_NAME ,LAST_NAME ,JOB_ID ,start_date,end_date 
FROM EMPLOYEES e 
JOIN JOB_HISTORY jh 
ON e.EMPLOYEE_ID = jh.EMPLOYEE_ID 
AND FIRST_NAME = 'Jonathon' AND LAST_NAME ='Taylor';