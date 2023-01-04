/**
 * const time = ['09:00','11:00','12:30','14:00','16:45']
   const todo = ['수업','과제','점심식사','주간회의','자료조사']
 */
//위의 2개 배열을 오브젝트 배열 1개로 변경합니다.
const schedule =[{time:'09:00',todo:'수업'},
				{time:'11:00',todo:'과제'},
				{time:'12:30',todo:'점심식사'},
				{time:'14:00',todo:'주간회의'},
				{time:'16:45',todo:'자료조사'}]
// [] : 배열, {} :오브젝트(프로퍼티 time, todo)	, ${}는 ``(백틱)과 함께 사용하는 출력기호		
let result=''
const scheduleTable = (object)=>{
	result += `<tr>
					<td>${object.time}</td>
					<td>${object.todo}</td>
				</tr>` 
}
schedule.forEach(scheduleTable)	
document.getElementById('contents').innerHTML=result
document.getElementById('btn_add').addEventListener('click',function(){		//추가
	const atime = prompt('시간을 입력하세요.')
	const atodo = prompt('할일을 입력하세요.')
	
	const temp = {time:atime,todo:atodo}
	schedule.push(temp)			//배열 마지막 요소로 추가
	console.log(schedule)			//아래 sort 구현하기 전후 결과가 다릅니다. 최후의 schedule 결과로 출력
	
	
	const newtr = document.createElement('tr')   //1)새로운 태그요소 생성하기
    const newtd = `<td>${atime}</td>
            <td>${atodo}</td>`
    newtr.innerHTML = newtd        //newtr은 새로만든 1)tr태그 요소. newtd 는 문자열
    document.getElementById('contents').appendChild(newtr)    //tbody (id=contents) 마지막 자식요소로 tr 태그 추가하기
	
})

document.getElementById('btn_sort').addEventListener('click',function(){		//정렬
//	console.log('09:00'-'11:00')		//NaN , return a.time-b.time 은 NaN 입니다.
	schedule.sort((a,b)=>{
			if(a.time<b.time) return -1
			return 1	
	})
	console.log(schedule)
	
	result=''		//let result='' 하면 innerHTML=result 에서 '' 가 들어갑니다.
	schedule.forEach(scheduleTable)			//전역변수 result를 변경하는 함수
	document.getElementById('contents').innerHTML=result
})



