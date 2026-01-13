package groupPro02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		추가할 기능
//		1. 청소년 할인 => 10살
//		2. 일정 횟수 이상부터 할인 => 10번부터 할인
//		3. 아동 무료
//		4. 종료 후 정산 출력 : 총 이용횟수, 교통수단별 이용횟수, 총 요금, 평균요금

		
//		[로직구성]
//		이해준 ------------------------------------------
//		입력클래스
//		배열(1차원) : 버스 / 지하철
//		변수선언 : 총 이용횟수(count), 교통수단별 이용횟수(b_count, s_count), 총 요금(total), 평균요금(avg)
//			사용자 나이(age) 아동, 청소년, 성인
//		상수선언 : 교통수단요금 / 교통수단별할인율
//		사용자 나이 입력
		
		
		
		Scanner sc= new Scanner (System.in);
//		상수 선언 
		final int BUS_PRICE = 1400; 	//버스요금 
		final int SUBWAY_PRICE = 1500;//지하철 요금 
		final double DISCOUNT_RATE = 0.1; 	//교통수단 할인율 10%로 통일 
		
//		변수 선언 
		int count = 0; //총 이용횟수 
		int b_count =0; // 버스 이용횟수 
		int s_count =0; // 지하철 이용횟수
		int age = 0; //나이 
		String sAge = ""; //아동, 청소년, 성인 저장할 변수
		
		int total = 0; //총 요금 
		double avg = 0; //평균 요금
		
//		배열 선언 
		int BUS[] = new int [1000]; //버스
		int SUBWAY[] = new int[1000]; //지하철 
		
		
//		정현주---------------------------------------
//		조건식 사용(if) => 12세 미만이면 아동
//				12세 이상 19세 이하이면 청소년
//				20세 이상이면 성인
	      System.out.print("나이를 입력해주세요 : ");
	      age = sc.nextInt();
	      sc.nextLine();
	      
	      if (age >= 0) {
	          if (age >= 0 && age < 12) {
	             sAge = "아동";
	          } else if(age >=12 && age < 19) {
	             sAge = "청소년";
	          } else {
	             sAge = "성인";
	          }
	       }
	      System.out.println(sAge + "입니다.");
		
//		이해준---------------------------------------
//		프로그램 시작합니다. (출력)
		System.out.println("프로그램을 시작합니다");
		
//		서서울---------------------------------------
//		반복문 (while문 사용)
//
//		사용한 교통수단 출력 (버스 또는 지하철)
//
//		교통수단 별 이용횟수(switch)
//		- 버스일때()
//		첫 사용 시 첫 번째 배열에 저장
		
		boolean cheack = true;
		while(cheack) {//while문 시작
			System.out.println("탑승한 대중교통 : ");
			String transpotation = sc.nextLine();
			switch(transpotation) {//switch문 시작
			case "BUS" :
				if(sAge.equals("아동")) {
				BUS[b_count] = 0;
			}else if (sAge.equals("청소년")){
				BUS[b_count] = (int)(BUS_PRICE - (BUS_PRICE * DISCOUNT_RATE));
			}else if(sAge.equals("성인")){
				BUS[b_count] = BUS_PRICE;
			}
				b_count++;
				break;
		
		
//		김태우-------------------------------------
//
//		- 지하철일때()
//switch(transpotation) {
			case "SUBWAY" :
				if(sAge.equals("아동")) {
					SUBWAY[s_count] = 0;
			}else if (sAge.equals("청소년")){
				SUBWAY[s_count] = (int)(SUBWAY_PRICE - (SUBWAY_PRICE * DISCOUNT_RATE));
			}else if(sAge.equals("성인")){
				SUBWAY[s_count] = SUBWAY_PRICE;
			}
				s_count++;
				
				
				break;
			default : 
				System.out.println("이용해주셔서 감사합니다");
				cheack = false;
				
			}//switch문 끝
			
			
		
			
			
		}//while문끝
			//
		
//		서정원--------------------
//		총 이용 횟수
//
//		교통수단별 이용 횟수 출력
//
		
		
//		김진옥------------------------
//		결제된 총 요금
//
//		평균요금
//		
		
	
}
}
