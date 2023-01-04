/*
    자바스크립트 데이터타입 : number,string,boolean,undefined,null,function,array(object),object
                  : 데이터 타입확인연산자 typeof
    객체 구성 : 프로퍼티(객체의 상태),메소드(객체의 동작/기능)
                객체의 프로퍼티값이 함수일때 메소드 입니다.

    객체 정의  : 자바에서는 클래스를 먼저 정의하고 필요할때 new 연산으로 생성
    자바스크립트는 프로토타입 기반(별도 클래스 정의 없는 형식)이라고 합니다. 바로 객체 리터럴로 생성할 수 있습니다.
*/
const personA = {name:'sana',
				age : 19,
				address :'서울'}			//객체리터럴

console.log('이름 : ' + personA.name)			//프로퍼티 사용방법1
console.log('이름 : ' + personA['name'])		//프로퍼티 사용방법2
console.log('나이 : ' + personA.age)
console.log('나이 : ' + personA['age'])
console.log(personA)

const personB = {}			//처음부터 모든 프로퍼티와 메소드를 정의하고 값 대입하지 않아도 됩니다.
personB.name = '모모'			//const 이지만 프로퍼티, 메소드 변경은 가능합니다.
personB['age'] = 24
personB['address'] = '인천'
console.log(personB)

/*
personB = {name:'sana',		//const 이므로 객체자체를 변경할 수 없음. => 오류
  		age : 19,
		address :'서울'}
console.log(personB)
*/
personA.color = 'blue'		
console.log(personA)		//새로운 속성 추가 가능.		
//객체 메소드 정의는 프로퍼티값이 함수가 되도록 만듭니다.
const personC = {name:'sana',
				color : 'white',
				address :'서울',
				hello : function(){
					alert('안녕하세요.저의 이름은 \''+this.name+'\' 입니다.')
				}
}
personC.hello()			//메소드 실행
console.log(personC.hello)		//hello 프로퍼티 값