select * from member_tbl_02;

-- book_member 테이블에 password 컬럼값이 텍스트가 그대로 보여요. -> 패스워드 암호화(해시값으로 저장)

select * from book_member;

-- 로그인 SQL (조건: 이메일은 아이디,비밀번호는 password 컬럼 )
-- 로그인은 `사용자 인증`(사용자의 신분확인) 1)패스워드 인증   2)토큰 인증
select * from book_member
where trim(email) =trim('honey@naver.com') and password='1122';   -- select 결과가 있으면 성공, 

select * from book_member
where trim(email) =trim('honey@naver.com') and password='1123';   -- 없으면 로그인 실패


-- password 컬럼을 변경