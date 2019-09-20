package com.cyh.t1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		//주민등록 번호입력 930908-1
		//9  3 0 9 0 8     마지막 숫자는냅둔다 검증용 번호라냅둠  
		//*2 *3*4*5*6*7*8*9*2*3*4*5     
		// 18  +9+ 0+ 45+0+56+8+0+10+15+32+5=ㅁ
		//  ㅁ/11   ===몫 ...나머지
		//  11-나머지 =결과값
		//  만약에 결과값이 두자리라면  결과값을 10으로 나눈다== 나머지를 결과값으로...
		// 결과값 == 검증용 번호

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호입력하시오");
		String jumin = sc.next();
		int sum=0; //합계를담을 변수
		int idx=2; //곱할수를 담을 변수
		
		//선언
		//방법 1.split   :String [] jumins = jumin.split((기준을넣어야함기준이없어서==> )"");
		//   for(int i =0;i<jumins.length;i++){system.out.println(jumins[i]);}
		//  얘도마찬가지로 string 에서 int 타입으로 바꿔야함.
		//방법 2.subSrting :    for(int i=0;i<jumin.length;i++){Srting n1 =jumin.subString(i  ,i+1);
		//     system.out.println(n1);      }   int n= Integer.parseInt(n1);//int타입으로 바꿔준다.

		
		//하나씩 가져오기  주민번호 13자리니까 12자리까지나와야함 마지막자리는 검증용 번호라 냅둬야함
		for(int i =0;i<jumin.length()-1;i++) {//for문 시작
			
			if(i==6) {
				continue;
			}
			
			char ch= jumin.charAt(i);
			//char를 string으로 바꾸자.
			//위에서 char 타입을 string으로 바꿔주는 작업을해야함. (문자로 문자열로 바꿔주는작업)
			//문자열 9가 자동으로 int로 형변환되서 57이라는숫자가되기때문에

			//방법 1. String a2=Character.toString(a);
			String n1 = String.valueOf(ch);//char 타입을 string으로 바꿈.

			//string타입을 int타입으로 바꿔줌.  
			int n =Integer.parseInt(n1);
			
			sum=sum+n*idx;  //
			idx++;
			
			//10이나왔을때 2로 초기화하자.
			if(idx==10) {
				idx=2;
			}

			
		}//for문 끝

		  sum =sum%11;//나머지값//합을 11로나눈 나머지 sum은이제 필요없기때문에 sum 을재활용.
		  
		  sum= 11-sum; //11-나머지값//sum재활용
		  
		  if(sum>9){
				sum=sum%10;
			}//이건안써도됨
		  
		  int result =Integer.parseInt(String.valueOf( jumin.charAt(jumin.length()-1)));
		  
		  //sum이 마지막 주민번호 숫자와 같다면.
		  if(sum==result) {
			  System.out.println("맞는 번호");
			  
		  }else {
			  System.out.println("틀린 번호");
		  }
		  

		

	}

}
