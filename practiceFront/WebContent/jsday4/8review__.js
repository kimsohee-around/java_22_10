/**
 * 8review.js 를 화살표 함수로 바꾸기
 */
const time = ['09:00','11:00','12:30','14:00','16:45']
const todo = ['수업','과제','점심식사','주간회의','자료조사']

const myfunc = (v,i) => result+=`<td>${v}(${i})</td>`
let result ='<th>TIME</th>'	
/*
time.forEach(
	(value) => result+=`<td>${value}</td>`
)
*/	
time.forEach(myfunc)			//인자가 함수일때 , myfunc 는 콜백함수라고 합니다.
document.getElementById('time').innerHTML=result

result ='<th>TODO</th>'
// 화살표 함수를 식별자(변수)로 대입하여 forEach 인자로 전달.
todo.forEach(myfunc)
document.getElementById('todo').innerHTML=result