console.log('1.현재날짜와 시간(로컬)')
console.log(new Date())
console.log('2.날짜를 직접 지정')
console.log(new Date(2022,7,12))        //월을 number 로 표기할때는 0~11
console.log(new Date('2022-07-12'))
console.log('3.날짜와 시간')
console.log(new Date('2022-07-12 14:12:34'))
console.log(new Date(2022,6,23,16,9,30))
console.log('4.세계표준시간- UTC')    //Tue, 03 Jan 2023 01:43:46 GMT
console.log(new Date().toUTCString())
console.log('5.세계표준시간- ISO')      
console.log(new Date().toISOString())       //ms 까지 표시. 2023-01-03T01:44:07.714Z
console.log('6.로컬 형식 (운영체제설정 국가)')
console.log(new Date().toLocaleString())   // 2023. 1. 3. 오전 10:45:11
console.log('7.자바의 long 타입 정수값(1970-1-1 0시 기준 ms 값)')
console.log(new Date().getTime())    //1672710341555
console.log('8.날짜/시간 메소드')
let today = new Date()
console.log('8-1) 년도 : ' + today.getFullYear())
console.log('8-2) 월 : ' + today.getMonth())    //월을 number 로 표기할때는 0~11
console.log('8-3) 일 : ' + today.getDate())
console.log('8-4) 시 : ' + today.getHours())
console.log('8-5) 분 : ' + today.getMinutes())
console.log('8-6) 초 : ' + today.getSeconds())
console.log('9.날짜변경 메소드')
today.setFullYear(today.getFullYear()+3)    //new Date() 기준 +3년으로 날짜변경
console.log('1) 3년후 날짜  : ' + today)
today = new Date()
today.setFullYear(today.getFullYear()-3)
console.log('2) 3년전 날짜  : ' + today)

//여러분의 탄생일 기준 +10000 일은 ?
let mybirth = new Date('2003-01-03')
console.log('3)나의 탄생일 : ' + mybirth.toLocaleString())
mybirth.setDate(mybirth.getDate()+10000)
console.log('4)나의 탄생 10000일 기념일 : ' + mybirth.toLocaleString())

//내가 태어난지 몇일되었을까요?
mybirth = new Date('2003-01-03')
let diff = new Date() - mybirth
console.log('내가 태어난지 몇일되었을까요? ' + diff +'ms')
const $1day = 24*60*60*1000   //1일 = ? ms
console.log('내가 태어난지 몇일되었을까요? ' + diff/$1day +'일')
console.log('내가 태어난지 몇일되었을까요? ' + Math.ceil(diff/$1day) +'일')

//Math 함수들 : ceil(천장), floor(바닥), round(반올림)
//Date 타입을 html에 출력 또는 date 입력요소에 문자열로 패턴을 설정하는 것은
// 		직접 함수를 만들어야 합니다.
//vdate는 Date타입,symbol은 구분기호
function patternDate(vdate,symbol) {
	const year = vdate.getFullYear()
	const month = (vdate.getMonth()+1).toString().padStart(2,'0')
	const day = vdate.getDate().toString().padStart(2,'0')
	
	let result = [year,month,day].join(symbol)
	
	return result
}

console.log(patternDate(mybirth,''))





