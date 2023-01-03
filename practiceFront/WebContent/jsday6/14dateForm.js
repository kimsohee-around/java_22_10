/**
 * 
 */
//입실날짜에 자동으로 오늘 날짜 출력되도록 해보세요.

function patternDate(vdate,symbol) {
	const year = vdate.getFullYear()
	const month = (vdate.getMonth()+1).toString().padStart(2,'0')
	const day = vdate.getDate().toString().padStart(2,'0')
	
	let result = [year,month,day].join(symbol)
	
	return result
}
 
document.forms[0].start.value = patternDate(new Date(),'-')    
//date 타입 input value 는 '2022-12-24' 패턴으로 설정해야 합니다.
document.forms[0].start.min = patternDate(new Date(),'-')    

//코딩에 필요한 입력요소들은 const 변수로 미리 참조
const start = document.forms[0].start
const end = document.forms[0].end
const days = document.forms[0].days


document.getElementById('selectNight')
.addEventListener('change',function(){

	
})
document.getElementById('startDate')
.addEventListener('change',function(){
	
	
})