/**
 * 자바스크립트 배열
 - 데이터 타입이 동일하지 않아도 됩니다.
 - typeof 연산 결과는 object
 - sort() 함수 : 오름 차순 정렬
 - reverse() 함수 : 정렬이 아님. 현재 배열값 순서를 역으로 바꿈.
 */
 let arr1 = [11,22,44,99,55,66]				//global scope(전역 변수)
 
//정렬 메소드 테스트
 let test = [11,22,234,99,55,66]
 
// test.sort()				//자바스크립트에서 sort 결과는 데이터를 문자열로 취급
 test.sort(function(a,b){   //a(왼쪽),b(오른쪽)      //number 비교 정렬할 때 함수를 작성.
	if(a<b) return -1
	return 1	     //오름차순
	// return a-b
 })

 console.log(test)		//개발자도구에서 확인

 test.sort(function(a,b){		
	if(a>b) return -1		//내림차순
	return 1
	//return b-a
 })
 console.log(test)

 test.sort((a,b)=> {return a-b})
 console.log(test)



 function print_arr1(){
 	document.getElementById('print1').innerHTML = arr1	//toString() 함수 실행결과
    console.log(arr1)
 }
 
 function change_arr1() {
 	arr1=['java','html','css',3.14]       //let 변수 이므로 참조 배열 변경 가능.
    document.getElementById('print4').innerHTML = arr1
    console.log(arr1)
 
 }

const arr2 =['apple','mango','kiwi','banan','딸기','사과']				//const(상수) 식별자 선언
  function print_arr2(){
 	document.getElementById('print6').innerHTML = arr2	//toString() 함수 실행결과
    console.log(arr2)
 }
 
   function sort_arr2(){
   	arr2.sort()
 	document.getElementById('print6').innerHTML = arr2	//toString() 함수 실행결과
    console.log(arr2)
 }
 
    function reverse_arr2(){
	   	arr2.reverse()
	 	document.getElementById('print6').innerHTML = arr2	//toString() 함수 실행결과
	    console.log(arr2)
 }
 	function list_arr3() {
 			const arr3 = ['🧑사나','채영👩‍🦰','모모','나연','다현']
            console.log(arr3)
            let result ='<ul>'		
            for(let i=0;i<arr3.length;i++){
               result += '<li>' + arr3[i] +'</li>'		//문자열 연결연산. result=result+'hello'
           	   result += `<li>${arr3[i]}</li>`
            }
            result += '</ul>'
           document.getElementById('twice').innerHTML=result	
 }
 	function foreach_arr3() {
 			const arr3 = ['🧑sana','채영👩‍🦰','momo','나연','다현']
 			 let result ='<ul>'	
 			arr3.forEach(function(value,index,array){		
 			//배열변수.forEach(인자는 배열요소에 대해 각각 실행할 함수)
 			// 인자로 사용되는 함수(콜백callback 함수)는 함수이름 없이 사용
 // 함수 인자 value,index,array는 배열에서 실행될때 정해진 순서. 매개변수명은 임의로 정함.
 				result += `<li>${value}(${index})</li>`			 //${}는 변수값을 출력기호						
 				console.log(`<li>${value}(${index}/${array.length})</li>`)
 			})
 	
 		   result += '</ul>'
           document.getElementById('twicee').innerHTML=result	
 			
 	
 	
 	
 	}
 
 
 
 
 
 
 
 
 
 
 
 
 