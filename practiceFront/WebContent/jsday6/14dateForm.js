/**
 * 
 */
//입실날짜에 자동으로 오늘 날짜 출력되도록 해보세요.

const patternDate = (vdate,symbol) => {
	const year = vdate.getFullYear()
	const month = (vdate.getMonth()+1).toString().padStart(2,'0')
	const day = vdate.getDate().toString().padStart(2,'0')
	
	let result = [year,month,day].join(symbol)
	
	return result
}
 
document.forms[0].start.value = patternDate(new Date(),'-')    
//date 타입 input value 는 '2022-12-24' 패턴으로 설정해야 합니다.
document.forms[0].start.min = patternDate(new Date(),'-')  
//입실날짜 선택범위를 오늘~ 3달 후로 하도록 max 설정해봅시다.
let startMax = new Date()
startMax.setMonth(startMax.getMonth()+3)	//날짜타입
document.forms[0].start.max = patternDate(startMax,'-')   

//코딩에 필요한 입력요소들은 const 변수로 미리 참조
const start = document.forms[0].start
const end = document.forms[0].end
const days = document.forms[0].days

const calcaultEnd = () => {
	console.log(start.value)		//string
	console.log(end.value)			//string
	console.log(days.value)			//string
	let sdate = new Date(start.value)   //날짜 타입으로 변환
	sdate.setDate(sdate.getDate()+parseInt(days.value))
	console.log("calculate end : " + sdate)		//날짜형식 sdate 출력
	end.value = patternDate(sdate,'-')
}

document.getElementById('selectNight')
.addEventListener('change',calcaultEnd)
document.getElementById('startDate')
.addEventListener('change',calcaultEnd)



