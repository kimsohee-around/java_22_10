package koreait.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import koreait.day19.Score;

public class C87ScoreFileTest {

	public static void main(String[] args) {

		
		//temp = "모모 [90,88,79]\n나나 [78,83,79]\n신비 [92,73,66]\n은하 [78,88,99]";
		//temp는 파일에서 읽어옵니다.
		//    ㄴ 파일에서 1줄 읽기 -> Score 객체생성해서 리스트에 add
		List<Score> scores = new ArrayList<>();		// 토크나이저 활용 
		System.out.println("::성적.txt 파일 입력 - Score 객체 생성 리스트에 추가::");

		//82번 85번 소스 복습하면서 완성해보세요. while(stk.hasMoreTokens()) 는 필요없습니다.
		
		StringTokenizer stk = new StringTokenizer(temp," ,[]\n");	//여러개 구분기호 사용할때 공백,줄바꿈 생략못함		
			Score s =  new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()));
			System.out.println(s);
			System.out.println("총점 : " + s.sum() +", 평균 : " + String.format("%.1f", s.average()));
			System.out.println("학점 : " + s.getGrade());
			scores.add(s);
		}
		
		System.out.println("리스트의 크기 : " + scores.size());
		
		
	}
//워크스페이스 인코딩 MS949 일때 메모장 파일형식이 UTF-8이면 파일읽어오기 못합니다. 
}
