 //addEventListener : html 요소에 발생하는 사용자 이벤트를 처리할 내용을 등록합니다.
 //                   listen 하고 있어야 할 이벤트와 처리 함수를 지정합니다.
 //      이벤트핸들러 : 이벤트를 처리할 내용 즉 함수 , 사용자 이벤트 : 클릭 ,마우스 움직이기,키보드입력,..
document.getElementById('btn_event').addEventListener('click',function(){
	alert('이 버튼은 addEventListener 로 실행합니다.')
})

document.getElementById('result').addEventListener('click',function(){
	alert('피연산자 2개를 입력하면 연산결과가 보입니다.')
})

const operatorResult = function() {
	const op1 = document.getElementById('operand1')
	const op2 = document.getElementById('operand2')
	const op = document.getElementById('operator').value
	let temp;
	if(op1.value =='') {
		alert("첫번째 피연산자 입력하세요.")
		op1.focus()
	}else if(op2.value =='') {
		alert("두번째 피연산자 입력하세요.")
		op2.focus()
	}else {
		switch(op) {
			case '+':
			//보류
			break
			case '-':
			temp = op1.value-op2.value
			break
			case '*':
			temp = op1.value*op2.value
			break
			case '/':
			temp = op1.value/op2.value
			break
			default :
				alert('알 수 없는 연산입니다.')
		} //switch end
		document.getElementById('result').value = temp
	} //if end
	
}
document.getElementById('execute').addEventListener('click',operatorResult)		//함수는 미리 정의되어 있어야 합니다.