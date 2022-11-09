package koreait.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C68RedPenList {

	public static void main(String[] args) {
		int count=0;
		Scanner sc= new Scanner(System.in);
		List<RedPen> probs= new ArrayList<>();
		System.out.println("-------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------");
		System.out.println("시작합니다.");
/*		
		for(int i=0;i<5;i++) {
			probs.add(new RedPen('+'));
			probs.get(i).make();
			System.out.print("문제"+(i+1)+"."+probs.get(i).problem());
			System.out.print("답 입력=>");
			int answer=Integer.parseInt(sc.nextLine());
			if(answer==probs.get(i).answer()) {
				count++;
				probs.get(i).setCorrect(true);
			}
				
		}
*/
		
		//RedPen 타입 변수 활용
		for(int i=0;i<5;i++) {
			RedPen temp = new RedPen('+');
			probs.add(temp);
			temp.make();
			System.out.print("문제"+(i+1)+"."+temp.problem());
			System.out.print("답 입력=>");
			int answer=Integer.parseInt(sc.nextLine());
			if(answer==temp.answer()) {
				count++;
				temp.setCorrect(true);
			}
				
		}
		
		System.out.println("------------------------");
		System.out.println("채점합니다. 맞은 갯수 "+count+"("+(count*20)+")점");
		System.out.println(":::틀린 문제 정답보기:::");
		for(int i=0;i<probs.size();i++) {
			if(!probs.get(i).isCorrect())
				System.out.println("문제"+(i+1)+"."+probs.get(i).problem()+probs.get(i).answer());
		}
	}

}
