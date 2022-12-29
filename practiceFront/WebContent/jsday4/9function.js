/**
 * 
 */
// 형식1 : 함수리터럴로 식별자 const 변수에 대입하기
const myfunc1 = function(x) {			//자바스크립트에서는 함수도 값이다.
	console.log('myfunc1 함수 실행합니다.')
	return x*11+12;
}
let result = myfunc1(10)
console.log('result : ' + result)
console.log(`result : ${result}`)			
//${} 변수,수식,함수 결과값 출력하는 표현식  ``(백틱) 과 함께 사용해야 합니다.

// 형식 2: const 변수 선언 없이 선언
function myfunc2(y) {
	console.log('myfunc2 함수 실행합니다.')
	return y*11-12;
}
result = myfunc2(10)
console.log(`result : ${result}`)	


// 형식 3: 화살표 함수 arrow function
const myfunc3 = (x) => x*11+12
console.log('myfunc3 result : ' + myfunc3(10))

const myfunc4 = (x) => {
	console.log('myfunc4 : myfunc2와 동일하게 동작합니다.')
	return x*11-12
}

console.log('myfunc4 result : ' + myfunc4(10))

const myfunc5 = (x) => console.log('myfunc5 x : ' + x)
myfunc5(999)

