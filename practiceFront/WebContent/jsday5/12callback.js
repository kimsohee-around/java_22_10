/**
 * 
 */
document.getElementById('now').innerHTML = new Date()
//new Date() 는 현재 날짜와 시간을 기본정보로 날짜 객체 생성함.

let func_date = () =>  document.getElementById('now').innerHTML = new Date()

//setInterval(func_date,1000)  		//1000ms(1초)마다 실행할 내용은 func_date 가 참조하는 함수

//현재 실행 중인 interval 중지하려면 변수로 참조 시켜야합니다.
let date_interval = setInterval(func_date,1000)  
document.getElementById('btn_now').addEventListener('click',() => clearInterval(date_interval))

//토글 버튼 만들기 : 시간표시하는 interval . start 와 stop
let state = true	//현재 interval 동작 중일 때 true
const toggle = document.getElementById('btn_toggle')
const date_toggle = () =>{
	if(state) {   //true 일때는 stop 시키기(clearInterval)
		clearInterval(date_interval)
		toggle.innerHTML = 'STOP'
		state=false
	}else {		  //false 일때는 start 시키기(setInterval 다시 설정)
		date_interval = setInterval(func_date,1000) 	
		toggle.innerHTML = 'START'
		state=true
	}
}
toggle.addEventListener('click',date_toggle)

