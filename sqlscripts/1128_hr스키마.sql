-- hr 데이터베이스

SELECT * FROM EMPLOYEES e 
WHERE JOB_ID ='IT_PROG';

-- 매니저_ID 가 100 인 직원들 조회
SELECT * FROM EMPLOYEES e 
WHERE MANAGER_ID =100;

-- 부서명 'IT Support'인 직원들 조회 : join 쿼리(SQL 명령)