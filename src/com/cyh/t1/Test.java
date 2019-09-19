package com.cyh.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//스캐너를 사용
		//주민등록 번호 입력 930000-1234567

		//나이
		//계절 345 봄 678 여름 ~~
		//성별 뒷자리첫번째자리 1,2 : 2000년 이전에 태어난남자 

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력하시오");
		String jumin =sc.next();
		int age=0;
		int season=0;
		int gender=0;

		//나이 
		String a  =jumin.substring(0,2);//=>해당 인덱스번호의 문자를 가져옴
		
		int year=1900+Integer.valueOf(a);//앞에서미리 계산해줌 
		//문자열을 숫자열로 바꿔주는 메서드
		//=int year =Integer.paseInt(a);
		
		System.out.println(2019-year);// 문자를 숫자로바꾼뒤 계산
		
		//계절
		String b= jumin.substring(2,4);
		
		year = Integer.parseInt(b);
		
		if(year >=3 && year<=5) {
			System.out.println("봄");
		}else if(year >=6 && year<=8) {
			System.out.println("여름");
		}else if(year >=9 && year<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		//성별
		//String c=jumin.substring(7,8);
		
		char ch = jumin.charAt(7);
		
		if(ch=='1' || ch=='3') {
			System.out.println("남자입니다");
		}else if(ch=='2'||ch=='4') {
			System.out.println("여자입니다");
		}
		
		
		
	}

}
