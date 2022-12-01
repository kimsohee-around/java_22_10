-- 외부평가 예제
-- 1. 테이블 분석하기 : 컬럼명,형식,기본키,데이터 예시
create table member_tbl_02 (
	custno number(6) primary key,
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindate date,
	grade char(1),
	city char(2)
);

create table money_tbl_02 (
	custno number(6),
	salenol number(8),
	pcost number(8),
	amount number(4),
	price number(8),
	pcode varchar2(4),
	sdate date,
	primary key(custno, salenol)
	--,foreign key(custno) references member_tbl_02 (custno)  --요구사항에 따라
);


-- 2. 시퀀스 적용 컬럼 확인하기
create sequence seq_custno start with 100001;
-- insert 중에 오류 생기면 시퀀스는 그래도 증가. 문제 예시와 값이 다릅니다.
-- 평가할 때에는 시퀀스 삭제, 테이블 데이터 삭제하고 다시 실행.
DROP SEQUENCE seq_custno;			-- 시퀀스 삭제
TRUNCATE TABLE member_tbl_02;		-- 데이터삭제

-- 3. 샘플데이터 추가 (컬럼 형식과 값 형식 일치시키기 : 자동변환에 주의)
INSERT INTO MEMBER_TBL_02 
VALUES (seq_custno.nextval, '김행복', '010-1111-2222', '서울 동대문구 휘경1동', '20151202', 'A', '01');
INSERT INTO MEMBER_TBL_02 
VALUES (seq_custno.nextval, '이축복', '010-1111-3333', '서울 동대문구 휘경2동', '2015-12-06', 'B', '01');
INSERT INTO MEMBER_TBL_02 VALUES (seq_custno.nextval, '장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리', '20151001', 'B', '30');
INSERT INTO MEMBER_TBL_02 VALUES (seq_custno.nextval, '최사랑', '010-1111-5555', '울릉군 울릉읍 독도2리', '20151113', 'A', '30');
INSERT INTO MEMBER_TBL_02 VALUES (seq_custno.nextval, '진평화', '010-1111-6666', '제주도 제주시 외나무골', '20151225', 'B', '60');
INSERT INTO MEMBER_TBL_02 VALUES (seq_custno.nextval, '차공단', '010-1111-7777', '제주도 제주시 감나무골', '20151211', 'C', '60');

SELECT * FROM MEMBER_TBL_02
ORDER BY custno;

INSERT INTO MONEY_TBL_02 VALUES (100001,20160001,500,5,2500,'A001','20160101');
INSERT INTO MONEY_TBL_02 VALUES (100001,20160002,1000,4,2500,'A002','20160101');
INSERT INTO MONEY_TBL_02 VALUES (100001,20160003,500,3,2500,'A008','20160101');
INSERT INTO MONEY_TBL_02 VALUES (100002,20160004,2000,1,2500,'A004','20160102');
INSERT INTO MONEY_TBL_02 VALUES (100002,20160005,500,1,2500,'A001','20160103');
INSERT INTO MONEY_TBL_02 VALUES (100003,20160006,1500,2,2500,'A003','20160103');
INSERT INTO MONEY_TBL_02 VALUES (100004,20160007,500,2,2500,'A001','20160104');
INSERT INTO MONEY_TBL_02 VALUES (100004,20160008,300,1,2500,'A005','20160104');
INSERT INTO MONEY_TBL_02 VALUES (100004,20160009,600,1,2500,'A006','20160104');
INSERT INTO MONEY_TBL_02 VALUES (100004,20160010,3000,1,2500,'A007','20160106');

SELECT * FROM MONEY_TBL_02;
SELECT custno,salenol ,pcost*amount "구입금액" FROM MONEY_TBL_02;		-- 수식사용하여 select

UPDATE MONEY_TBL_02 SET price = pcost*amount ;

-- 4. 조회할 컬럼 확인 -> 1) 1개 테이블 2)조인 필요?  3)그룹함수 필요? 
SELECT custno,custname,phone,address,joindate,grade,city
FROM MEMBER_TBL_02;

SELECT custno,custname,phone,address,to_char(joindate,'yyyy-mm-dd') "가입날짜",
decode(grade,'A','VIP','B','일반','C','직원') "등급",city
FROM MEMBER_TBL_02;


SELECT grade,city ,sum(price)
FROM member_tbl_02 mem
JOIN MONEY_TBL_02  mon
ON mem.custno = mon.custno
GROUP BY grade,city;		-- 그룹화 컬럼을 2개로 할때 메인그룹,서브그룹


-- 회원매출조회
-- 방법1]] group by : 여러개 컬럼 나열해서 select (메인컬럼외 나머지 컬럼은 의미가 없음. )
SELECT mem.custno "회원번호",
	mem.custname "회원성명",
	decode(grade,'A','VIP','B','일반','C','직원') "등급",
	sum(price) sale
FROM member_tbl_02 mem
JOIN MONEY_TBL_02  mon
ON mem.custno = mon.custno
GROUP BY mem.custno,mem.custname,mem.grade
ORDER BY sale DESC;

-- 방법2]] join : 집계함수 결과와 회원테이블
-- 1단계 : 회원별 매출합계 (money 테이블)
SELECT custno , sum(price)
FROM MONEY_TBL_02 
GROUP BY custno;

-- 2단계 : member 테이블과 1단계 결과 와 join
SELECT *
FROM MEMBER_TBL_02 mt
JOIN
(
	SELECT custno , sum(price) psum
	FROM MONEY_TBL_02 
	GROUP BY custno
) sale    -- 1단계 결과에 대한 별칭 sale
ON mt.custno = sale.custno;


-- 3단계 : 오라클에서는 별칭을 줄때 따옴표 ""안에쓰면 단순히 출력용입니다. 컬럼명,테이블명 지정을 위해서는 따옴포 없이
SELECT mt.custno,custname,decode(grade,'A','VIP','B','일반','C','직원') "등급",psum
FROM MEMBER_TBL_02 mt
JOIN
(	--서브 쿼리
	SELECT custno , sum(price) psum     -- 별칭에 따옴표 없어야 컬럼명이 됩니다.
	FROM MONEY_TBL_02 
	GROUP BY custno
) sale    -- 1단계 결과에 대한 별칭 sale
ON mt.custno = sale.custno
ORDER BY psum desc;













