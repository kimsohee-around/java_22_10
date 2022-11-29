package koreait.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import koreait.day18.Member;

public class C79StringSort {

	public static void main(String[] args) {

		String[] names = {"ki","Du","Son","kj","Dz","ap"};
	//	String[] names = {"k","b","S","d","D","a"};
		System.out.println("String 배열 초기  :" + Arrays.toString(names));
		
		for(int i=0;i<names.length-1;i++) {  
			for(int k=i+1;k<names.length;k++) {    //오름 차순 : i번째 값이 k번째 값보다 작아야 합니다.
				if(names[i].compareTo(names[k])>0) {
					String temp = names[i];
					names[i]=names[k];
					names[k]=temp;
				}
			}
		}
		// Arrays.sort(names);    //배열 정렬 메소드	
		System.out.println("String 배열 정렬 결과 :" + Arrays.toString(names));
		
		
		List<Member> mlist = new ArrayList<Member>();
		
		mlist.add(new Member(1, "사나", 23));
		mlist.add(new Member(2, "나연", 25));
		mlist.add(new Member(3, "모모", 27));
		mlist.add(new Member(4, "다현", 24));
		mlist.add(new Member(5, "쯔위", 26));
	
		System.out.println("Member 리스트 초기 : " + mlist);
		for(int i=0;i<mlist.size()-1;i++) {
			for(int k=i+1;k<mlist.size();k++) {
				if(mlist.get(i).getName().compareTo(mlist.get(k).getName()) > 0) {
					//교환?? 객체의 참조값 교환합니다.
					Member temp = mlist.get(i);
					mlist.set(i, mlist.get(k));
					mlist.set(k, temp);
				}
			}
		}
		
		System.out.println("Member 리스트 (이름) 정렬 결과 : " + mlist);
	}

}
