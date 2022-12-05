-- 외래키 옵션
-- tbl_student 와 tbl_sqscore 테스트합니다.

-- 테이블구조와 데이터 복사 (기본키 설정은 제외)
CREATE TABLE tmp_student		-- 테이블 생성
AS								-- 조회결과로 테이블생성		
select * FROM tbl_student;		-- 테이블 조회

SELECT * FROM tmp_student;

CREATE TABLE tmp_score
AS
SELECT * FROM TBL_SQSCORE ts ;

SELECT * FROM TMP_score ts ;
DELETE FROM TMP_SCORE ts WHERE STUNO IS NULL;




