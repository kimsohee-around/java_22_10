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
-- 외래키의 on delete 옵션 동작 테스트
-- 1)No Action 일때
DELETE FROM TMP_STUDENT ts  
WHERE stuno='2020017';				-- 오류 메시지 : 자식테이블에서 참고

-- 2)set null
ALTER TABLE TMP_SCORE DROP CONSTRAINT fk_tmp_student;
ALTER TABLE TMP_SCORE ADD CONSTRAINT fk_tmp_student 
FOREIGN KEY (stuno) REFERENCES tmp_student(stuno) ON DELETE SET NULL;
DELETE FROM TMP_STUDENT ts  
WHERE stuno='2020017';			--실행 후 2개의 테이블 데이터 확인 
-- 실행 후 2개의 테이블 확인 : tmp_score 테이블에서 '2020017'값을 참조하는 행의 외래키 컬럼 null 로 변경 

-- 테스트를 위해 삭제 후 다시 추가할 데이터
INSERT INTO TMP_STUDENT VALUES ('2020017','박나래',16,'경기도');
-- tmp_score 테이블에 방금 null로 바뀐 학번 2020017로 수정하고 아래 3) 테스트

-- 3)cascade
ALTER TABLE TMP_SCORE DROP CONSTRAINT fk_tmp_student;
ALTER TABLE TMP_SCORE ADD CONSTRAINT fk_tmp_student 
FOREIGN KEY (stuno) REFERENCES tmp_student(stuno) ON DELETE CASCADE ;
DELETE FROM TMP_STUDENT ts  
WHERE stuno='2020017';			
-- 실행 후 2개의 테이블 확인 : tmp_score 테이블에서 '2020017'값을 참조하는 행이 삭제 			

-- on delete 옵션을 결정하는 것은 처리 조건입니다.요구사항 및 정책에 따라 결정하는 것입니다.


-- 테스트를 위해 삭제 후 다시 추가할 데이터
INSERT INTO TMP_SCORE values(999,'2020017','수학',82,'최지성','2020_02');
INSERT INTO TMP_STUDENT VALUES ('2020017','박나래',16,'경기도');
