/**
 * 
 */
//함수 스콥이 아니고 스크립트 태그에 작성된 명령문은
//문서가 로딩되면서 실행됩니다. 태그 요소 가져올때 스크립트 명령문 위치 중요.
'use strict'
function lightToggle() {  //상태를 알기위해 변수 추가 또는 state 요소의 텍스트 사용
	//함수 안에서 요소를 가져올 때에는 스크립트의 위치가 상관 없음.문서 로딩 종료 후에 함수가 실행되므로.
	const light = document.getElementById('light');
	const state = document.getElementById('state');
	console.log(light);			//가져온 요소 확인
	console.log(state);
	if (state.innerHTML == 'ON') {				//켜져있는 상태 -> OFF
		lightOff();
	} else {				//꺼져있는 상태 -> ON
		lightOn();
	}
}
function lightOn() {
	console.log(light);			//가져온 요소 확인
	console.log(state);
	state.innerHTML = 'ON';    //글꼴색상:초록			//1번
	light.src = "../image/pic_bulbon.gif";	//2번
	state.style.color = 'green';			//3번
}
function lightOff() {
	console.log(light);			//가져온 요소 확인
	console.log(state);
	state.innerHTML = 'OFF';	//글꼴색상:빨강
	light.src = "../image/pic_bulboff.gif";
	state.style.color = 'red';
}