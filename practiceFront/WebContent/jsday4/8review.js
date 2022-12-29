/**
 * 
 */
//자바스크립트 배열
const time = ['09:00','11:00','12:30','14:00','16:45']
const todo = ['수업','과제','점심식사','주간회의','자료조사']

let result ='<th>TIME</th>'	
time.forEach(function(value){
	result+=`<td>${value}</td>`
})	
document.getElementById('time').innerHTML=result

result ='<th>TODO</th>'	
todo.forEach(function(value){
	result+=`<td>${value}</td>`
})
document.getElementById('todo').innerHTML=result