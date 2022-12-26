/**
 * 2var.js 의 변수 선언 var과 비교
 */
'use strict'    //strict 엄격한 (ES5 버전부터 변수사용의 규칙을 엄격히 적용 )
let v1 = 456  //변수 v1 선언
document.write('v1=')
document.write(v1)
document.write('<br>')
let v11 = 999		//*1) let 선언 시에는 중복된 변수 선언은 오류
document.write('v11=')
document.write(v11)
document.write('<br>')
v2=123				//let 도 변수 선언없이 값 저장 가능.('use strict' 사용하면 오류 )
document.write('v2=')
document.write(v2)
document.write('<br>')
/*
document.write('v3=') 
document.write(v3) //오류(선언과 초기값 둘다 없음.)
document.write('<br>')
*/
if(true) {
	let v1=444;		//*2) let 선언은 지역변수(block scope) 사용 가능.
	console.log(v1)
}
document.write('v1=')
document.write(v1)
document.write('<br>')
