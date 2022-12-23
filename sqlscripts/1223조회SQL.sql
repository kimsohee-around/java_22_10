-- 능력단위 과목명 :SQL 활용
-- 문제2 제출자 : 김땡땡

--1) 2022년 2월11일부터 그 이후에 판매된 상품 컬럼을 모두 조회 합니다.
select * from tbl_buy#
where buy_date > '2022-02-10';
--2) 가장 가격이 높은 상품을 `상품코드,상품명,가격` 조회합니다.
select pcode,pname,price 
from tbl_product#
where price = (select max(price) from tbl_product#);        -- 그룹(집계_함수)는 다른 컬럼과 함께 조회 할수 없음.

--3) 상품의 카테고리별로 가장 비싼 상품을 `카테고리명, 최고금액` 으로 조회 합니다. category 컬럼 순서로 정렬하기.
SELECT category, max(price) 
FROM "TBL_PRODUCT#" tp 
GROUP BY CATEGORY 
ORDER BY CATEGORY ;

--4) IPAD011 을 구매한 고객정보와 구매수량을 `고객ID, 이름,구매수량` 으로 조회합니다.
SELECT tb.CUSTOM_ID ,name,quantity 
FROM "TBL_CUSTOM#" tc ,"TBL_BUY#" tb 
WHERE tc.CUSTOM_ID = tb.CUSTOM_ID       -- 조인 조건
AND tb.PCODE = 'IPAD011';
-- 또는 
SELECT tb.CUSTOM_ID ,name,quantity 
FROM "TBL_CUSTOM#" tc join "TBL_BUY#" tb 
on tc.CUSTOM_ID = tb.CUSTOM_ID 
AND tb.PCODE = 'IPAD011';       -- 외부 조인 할때는 조인 조건 아닌 경우 where 에 추가 조건을 작성하세요.

--5) 날짜별로 총판매금액을 `날짜(년-월-일) , 총판매금액` 으로 조회합니다.
SELECT buy_date2, sum(money)
FROM
(SELECT TO_CHAR(buy_date,'yyyy-MM-dd') buy_date2 ,quantity * price  money
        FROM TBL_BUY# tb ,TBL_PRODUCT# tp WHERE tb.pcode = tp.PCODE )   -- 서브쿼리
GROUP BY buy_date2 ORDER BY buy_date2;


