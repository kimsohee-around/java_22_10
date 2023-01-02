/**
 * 
 */
function forms0_check() {  //form 태그의 onsubmit 이벤트 함수
	alert('전송1.forms,elements 객체 사용하기')
	//유효성 검사 1단계 : 입력요소 값 가져오기
	const user = document.forms[0].elements[0]
	const email = document.forms[0].elements[1]
	const password = document.forms[0].elements[2]
	alert('user : ' + user.value)
	alert('email : ' + email.value)
	
	//유효성 검사 2단계 : 요구사항에 따라 검사하기
	//					ㄴ 이름과 이메일은 반드시 입력해야 한다.
	if(user.value =='' || email.value =='') {
		alert('이름과 이메일은 필수 입력입니다.')
		return false		// action 속성 url 로 이동 안함. 
	}else if (password.value.length < 4) {
		alert('패스워드는 4글자 이상입니다.')
		password.focus()			//focus 이동
		return false
	}else 
		return true			// action 속성 url 로 이동함
}

function btn_check() {
	alert('전송2. 일반버튼이고 form과 input name 속성값으로 입력요소 가져오기')
	const user = document.frm0.user
	const email = document.frm0.email
	const password = document.frm0.password
	alert('user : ' + user.value)
	alert('email : ' + email.value)
	
	if(user.value=='' || email.value =='') {
		alert('이름과 이메일은 필수 입력입니다.')
	}else if (password.value.length < 4) {
		alert('패스워드는 4글자 이상입니다.')
		password.focus()	
	}else {
		document.frm0.submit()
	}
	
	//추가적으로 action 을 지정하기도 합니다.
	//document.frm0.action = '11result.html'
	//submit 을 직접 메소드로 합니다.
	//document.frm0.submit()
	
}
