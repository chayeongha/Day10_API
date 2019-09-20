package com.cyh.t1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		//주민등록 번호입력 930908-1
		//9  3 0 9 0 8     마지막 숫자는냅둔다 검증용 번호라냅둠  
		//*2 *3*4*5*6*7*8*9*2*3*4*5     
		// 18  +9+ 0+ 45+0+56+8+0+10+15+32+5=

		//   ㅁ/11   ===몫 ...나머지
		//    11-나머지 =결과값
		//   만약에 결과값이 두자리라면  결과값을 10으로 나눈다== 나머지를 결과값으로...
		// 결과값 == 검증용 번호

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호입력하시오");
		String jumin = sc.next();

		//선언

		//하나씩 가져오기  주민번호 13자리니까 12자리까지나와야함 마지막자리는 검증용 번호라 냅둬야함
		for(int i =0;i<12;i++) {//for(1)문 시작
			char a= jumin.charAt(i);

			//char를 string으로 바꾸자.
			//위에서 char 타입을 string으로 바꿔주는 작업을해야함.
			//문자열 9가 자동으로 int로 형변환되서 57이라는숫자가되기때문에
			String a2=Character.toString(a);

			//string타입을 int타입으로 바꿔줌.  
			int a3 =Integer.valueOf(a2);
			System.out.println(a3);

		}//for(1)문 끝

		//곱해야할 숫자들을 하나씩 나열 
		int [] num = {2,3,4,5,6,7,8,9,2,3,4,5};//곱해야할 수들 배열선언


		int nudm =4;

		//	for(index =2; index<10;index++) {//for(2)문 시작
		//int a3=a2*index;
		//		System.out.println(index);

		//	}//for(2)문 끝


	}

}
