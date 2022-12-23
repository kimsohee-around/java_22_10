CREATE TABLE TBL_CUSTOM# (
	CUSTOM_ID VARCHAR2(20) PRIMARY KEY, -- 최대 20byte의 가변 문자열, NOT NULL AND UNIQUE
	NAME NVARCHAR2(20) NOT NULL, -- 최대 20개 문자의 가변 문자열
	EMAIL VARCHAR2(30),
	AGE NUMBER(3),
	REG_DATE timestamp
);

SELECT * FROM TBL_CUSTOM# tc ;

INSERT INTO TBL_CUSTOM# (CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)
VALUES ('mina012', '김미나', 'kimm@gmail.com', 20, to_date('2022-02-07 15:03:06','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_CUSTOM# (CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)
VALUES ('hongGD', '홍길동', 'gil@korea.com', 32, to_date('2022-02-07 15:03:06','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_CUSTOM# (CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)
VALUES ('twice', '박모모', 'momo@daum.net', 39, to_date('2021-12-25 00:00:00','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_CUSTOM# (CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)
VALUES ('wonder', '이나나', 'nana@korea.kr', 23, '2022-02-05');
INSERT INTO TBL_CUSTOM# (CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)
VALUES ('sana', '최사나', 'unknown', 22, '2022-02-09 15:19:24');

-- 상품 테이블 : 카테고리 예시 A1:전자제품, B1:식품
CREATE TABLE TBL_PRODUCT#(
	PCODE VARCHAR2(20) PRIMARY KEY,
	CATEGORY CHAR(2) ,
	PNAME NVARCHAR2(20) NOT NULL,
	PRICE NUMBER(9) NOT NULL
);
INSERT INTO TBL_PRODUCT# (PCODE, CATEGORY, PNAME, PRICE)
VALUES ('CJ-BABQ1', 'B1', 'CJ햇반잡곡밥SET', 26000);
INSERT INTO TBL_PRODUCT# (PCODE, CATEGORY, PNAME, PRICE)
VALUES ('DOWON123a', 'B1', '동원참치선물세트', 54000);
INSERT INTO TBL_PRODUCT# (PCODE, CATEGORY, PNAME, PRICE)
VALUES ('dk_143', 'A2', '모션데스크', 234500);
INSERT INTO TBL_PRODUCT# (PCODE, CATEGORY, PNAME, PRICE)
VALUES ('IPAD011', 'A1', '아이패드10', 880000);
INSERT INTO TBL_PRODUCT# (PCODE, CATEGORY, PNAME, PRICE)
VALUES ('GAL0112', 'A1', '갤럭시20', 912300);
INSERT INTO TBL_PRODUCT# (PCODE, CATEGORY, PNAME, PRICE)
VALUES ('CHR-J59', 'A2', 'S체어', 98700);
select * from tbl_product#;

--구매 테이블 : 어느 고객이 무슨 상품을 구입하는가?
CREATE TABLE TBL_BUY#(
    buy_seq number(8) primary key,
	CUSTOM_ID VARCHAR2(20) NOT NULL,
	PCODE VARCHAR2(20) NOT NULL,
	QUANTITY NUMBER(5) NOT NULL, -- 수량
	BUY_DATE timestamp default sysdate,
    foreign key (custom_id) references tbl_custom#(custom_id),
    foreign key (pcode) references tbl_product#(pcode)
);
create sequence buy_seq;
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'mina012', 'IPAD011', 1, to_date('2022-02-06 00:00:00','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'hongGD', 'IPAD011', 2, to_date('2022-02-08 15:55:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'wonder', 'DOWON123a', 3, to_date('2022-02-06 00:00:00','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'mina012', 'dk_143', 1, '2022-02-08 15:55:08');
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'twice', 'DOWON123a', 2, to_date('2022-02-07 08:49:55','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'hongGD', 'dk_143', 1, '2022-02-11');
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'twice', 'CHR-J59', 2, '2022-02-12');
INSERT INTO TBL_BUY# (buy_seq,CUSTOM_ID, PCODE, QUANTITY, BUY_DATE)
VALUES (buy_seq.nextval,'hongGD', 'CJ-BABQ1', 4, '2022-02-11');
select * from tbl_buy#;
-- 테이블 추가 (제조회사)
create table tbl_corporation(
        copr_id number(4) primary key,      -- 제조사ID
        title varchar(20) not null,
        tel varchar(20) 
);

-- 상품테이블에 copr_id 컬럼을 추가(null 허용) (alter table)

-- 상품테이블에 추가된 컬럼에 copr_id 대해 외래키 추가 (alter table)