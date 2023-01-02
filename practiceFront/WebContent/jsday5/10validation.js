/**
 * 
 */
function forms0_check() {  //form 태그의 onsubmit 이벤트 함수
	alert('1.forms,elements 객체 사용하기')
	//유효성 검사 1단계 : 입력요소 값 가져오기
	const user = document.forms[0].elements[0]
	const email = document.forms[0].elements[1]
	alert('user : ' + user.value)
	alert('email : ' + email.value)
	
	//유효성 검사 2단계 : 요구사항에 따라 검사하기
	//					ㄴ 이름과 이메일은 반드시 입력해야 한다.
	if(user.value =='' || email.value =='') {
		alert('이름과 이메일은 필수 입력입니다.')
		return false		// action 속성 url 로 이동 안함. 
	}else 
		return true			// action 속성 url 로 이동함
}