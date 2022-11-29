CREATE TABLE tbl_student (
	stuno char(7) PRIMARY KEY,   -- 제약조건 설정방법 1) 컬럼레벨
	name varchar2(30) NOT NULL,
	age number(3) CHECK (age BETWEEN 10 AND 30),
	address nvarchar2(50)
);

CREATE TABLE tbl_score(
	stuno char(7),		-- 외래키로 `학생`테이블의 `학번`값을 참조합니다.
	subject nvarchar2(20),
	jumsu number(3) NOT NULL ,
	teacher nvarchar2(20) NOT NULL ,
	term char(6) NOT NULL,
-- 제약조건 설정방법 2) 테이블레벨	
	PRIMARY key(stuno,subject), 	-- 기본키는 복합컬럼으로 설정
	FOREIGN key(stuno) REFERENCES tbl_student(stuno)   -- 참조관계설정
--	FOREIGN key(성적테이블컬럼) REFERENCES 참조테이블(참조테이블컬럼)   
--  				참조컬럼 조건은 ? 
);

INSERT INTO tbl_student(stuno,name,age,address)
VALUES ('2021001','김모모',16,'서초구');
INSERT INTO tbl_student(stuno,name,age,address)
VALUES ('2019019','강다현',18,'강남구');
INSERT INTO tbl_student(stuno,name,age,address)
VALUES ('2020017','박나래',16,'경기도');

-- 테이블 참조관계 오류 : 참조(부모)테이블 , parent key 는 참조컬럼
-- ORA-02291: integrity constraint (ICLASS10.SYS_C007039) violated - parent key not found
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019020','국어',88,'이나연','2020_1');

-- 아래는 정상실행
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2021001','국어',89,'이나연','2022_1');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2021001','영어',78,'김길동','2022_1');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2021001','과학',67,'박세리','2021_2');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019019','국어',92,'이나연','2019_2');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019019','영어',85,'박지성','2019_2');
INSERT INTO tbl_score(stuno,subject,jumsu,teacher,term)
VALUES ('2019019','과학',88,'박세리','2020_1');

SELECT * FROM tbl_score WHERE stuno='2021001' AND subject='국어';
SELECT * FROM tbl_score WHERE stuno='2019019' AND subject='국어';



