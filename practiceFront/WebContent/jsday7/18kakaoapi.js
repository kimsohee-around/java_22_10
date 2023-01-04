//http 통신을 위해 필요한 값 : url은 요청주소 , 파라미터(쿼리스트링)은 요청처리를 위한 데이터,헤더(header)는 요청과 관련된 추가 설정값

//브라우저 주소창에 url 입력하고 엔터하면 동기적인 통신. 응답을 화면으로 바로 확인
const testKakao =
() => {
//비동기 통신을 위한 비동기 통신 라이브러리 객체 생성 
   const xhr = new XMLHttpRequest();      //데이터를 저장하는 용도 json객체 (초창기에는 xml 파일사용)

   //1.HTTP 요청 초기화 : method(GET,POST,PUT,DELETE),url 
   xhr.open("GET",`https://dapi.kakao.com/v2/search/vclip?query=어텐션&page=1&size=20&sort=recency`);      //size는 기본값 10
   															//sort는 accuracy 또는 recency
  //2.요청 header 설정 : 인증키. setRequestHeader(헤더이름,헤더값)
   xhr.setRequestHeader("Authorization","KakaoAK {rest_api_key값}");
   
   //3.HTTP요청 전송 : 추가적인 파라미터는 함께 전송
   xhr.send();

   let results=''
   //4.onload  : 요청이 완료되고 이에 대한 응답이 왔을 때 실행될 onload 이벤트 핸들러 작성.
   xhr.onload = function() {
      //응답코드가 200일때만 정상 
      if(xhr.status==200) {    //status 프로퍼티는 응답코드 저장
         alert('kakao 검색 응답을 받았습니다.')
         let $response = JSON.parse(xhr.response)        //xhr.response 는 문자열 -> 자바스크립트 객체로 변환
         results = $response.documents       //author,datetime, title,url,play-time,thumbnail 속성으로 구성된 객체 배열
            
      } //if 끝

      console.log(results)
   }   //onload 끝
}
document.getElementById('btn_kakao').addEventListener('click',testKakao);