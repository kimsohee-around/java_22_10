/**
 * var의 변수의 동작을 확인
 */
var v1 = 456  //변수 v1 선언
document.write('v1=')
document.write(v1)
document.write('<br>')
var v1 = 999		//c,java 등 다른 언어에서는 오류(동일한 변수 중복선언). 그러나 자바스크립트는 OK
document.write('v1=')
document.write(v1)
document.write('<br>')
v2=123				//c,java 등 다른 언어에서는 오류(변수 선언안함). 그러나 자바스크립트는 OK
document.write('v2=')
document.write(v2)
document.write('<br>')
/*
document.write('v3=') 
document.write(v3) //오류(선언과 초기값 둘다 없음.)
document.write('<br>')
*/
if(true) {
	var v1=444;		//다른언어에서는 if블록지역변수. var은 지역변수 없음.
	console.log(v1)
}
document.write('v1=')
document.write(v1)
document.write('<br>')




