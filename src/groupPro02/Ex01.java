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
		int mileageIndex = 0; //마일리지의 탑승 순서를 알려주는 변수 
		double mileageTotal = 0.0; //최종 마일리지 금액 		
		int total = 0; //총 요금 
		double avg = 0; //평균 요금
		
//		배열 선언 
		int BUS[] = new int [1000]; //버스
		int SUBWAY[] = new int[1000]; //지하철 
		int mileageCount [] = new int[1000]; // 마일리지 : 탑승 순서대로 요금 저장 배열 
		
		
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
//		사용한 교통수단 출력 (버스 또는 지하철 또는 정보창)
//
//		교통수단 별 이용횟수(switch)
//		- 버스일때()
//		첫 사용 시 첫 번째 배열에 저장
		
		boolean cheack = true;                       
		while(cheack) {// while문 시작
			System.out.println(" ===대중교통 선택=== ");
			System.out.println("|_______________|");
			System.out.println("|1. 버스		|");
			System.out.println("|2. 지하철	|");
			System.out.println("|3. 정보창	|");
			System.out.println("|그 외 입력시 종료	|");
			System.out.println("|_______________|");
			System.out.println("|번호 입력 : 	|");
			System.out.println("|_______________|");
			int choice = sc.nextInt();

			switch(choice) {//switch문 시작
			case 1 :
				if(sAge.equals("아동")) {
				BUS[b_count] = 0;//bus이용횟수당 체크되는 금액 0원 << 공짜니깐
			}else if (sAge.equals("청소년")){
				BUS[b_count] = (int)(BUS_PRICE - (BUS_PRICE * DISCOUNT_RATE));//배열int타입 맞춰줌
			}else if(sAge.equals("성인")){
				BUS[b_count] = BUS_PRICE;
			}
				
				mileageCount[mileageIndex] = BUS[b_count]; //탄 순서대로 버스 요금 저장 
				mileageIndex++;
				b_count++;
				break;
		
		
//		김태우-------------------------------------
//
//		- 지하철일때()

			case 2 :
				SUBWAY[s_count] =
				age < 12 ? 0 ://12살이상일때가 거짓문 밑에있음
				age >= 12 && age < 19 ? (int)(SUBWAY_PRICE * (1 - DISCOUNT_RATE)) ://19살이상일때 거짓문밑에
				age >= 19 ? SUBWAY_PRICE : SUBWAY_PRICE ;
				
				mileageCount[mileageIndex] = SUBWAY[s_count]; // 탄 순서대로 지하철 요금 저장 
				mileageIndex++; 
				s_count++;
				break;

		//서정원------------------------------------------------------------
			case 3:
				while(choice!=0) {//switch문의 case3의 while문 시작
					System.out.println(" =======현재까지  정보========");
					System.out.println("|※ 확인하고 싶으신 정보를 고르세요 |");
					System.out.println("|_________________________|");
					System.out.println("|1. 각 교통수단별 및 총 이용횟수  |");
					System.out.println("|2. 현재 사용자 정보	 	  |");		 
					System.out.println("|3. 현재 각 교통수단별 금액	  |");
					System.out.println("|0. 돌아가기		  |");
					System.out.println("|_________________________|");
					choice = sc.nextInt();
					switch(choice){
					case 1: System.out.println("현재까지 버스는 "+b_count+"회 이용하셨으며 지하철은 "+s_count+"회 이용하셨습니다\n총 교통수단 이용 횟수는: "+count+"회 입니다");break;
					case 2:	if(sAge.equals("아동")) {System.out.println("현재 사용자는 "+sAge+"이므로 교통비 무료 대상자입니다");}
							else if (sAge.equals("청소년")){System.out.println("현재 사용자는 "+sAge+"이므로 교통비"+(DISCOUNT_RATE*100)+"% 할인 대상자 입니다.");}
							else if(sAge.equals("성인")){System.out.println("현재 사용자는"+sAge+"이므로 나이 할인 대상자가 아닙니다.");}
							break;
					case 3: 
						if(sAge.equals("아동")) {
							System.out.println("현재 교통수단별 금액은\n버스: 0원\n지하철: 0원 으로 설정되어 있습니다");break;
						}else if (sAge.equals("청소년")){
							System.out.println("현재 교통수단별 금액은\n버스: "+(int)(BUS_PRICE - (BUS_PRICE * DISCOUNT_RATE))+"원\n"
									+ "지하철: "+(int)(SUBWAY_PRICE * (1 - DISCOUNT_RATE))+"원 으로 설정되어 있습니다");break;
						}else if(sAge.equals("성인")){
							System.out.println("현재 교통수단별 금액은\n버스: "+BUS_PRICE+"원\n지하철: "+SUBWAY_PRICE+"원 으로 설정되어 있습니다");break;
						}
					
					case 0: System.out.println("정보창을 종료합니다");break;
					default: System.out.println("잘못된 입력입니다 다시 입력해 주세요");break;
					}
				}//switch문의 case3의 while문 끝
				break;
		//김태우----------------------------------------
			default : 
				System.out.println("이용해주셔서 감사합니다");
				cheack = false;
				break;
			}//switch문끝
			count=b_count+s_count;
		}//while문끝
			
		
		
//		서정원--------------------
		System.out.println("지하철 이용횟수: "+s_count);
		System.out.println("버스 이용횟수: "+b_count);
		System.out.println("총 교통수단 이용횟수: "+count);		
//		김진옥------------------------
//		결제된 총 요금
//
//		평균요금
//			
		// 반복문을 사용해서 값을 꺼내고 요금 토탈값 구하기0.
		  for (int i = 0 ; i <= s_count-1 ; i++) {		     
		         total += SUBWAY[i];
		      }		  
		  for (int i = 0 ; i <= b_count-1 ; i++) {		         
		         total += BUS[i];
		      }
		  
	      // 1. 결제된 총 요금 출력
	     
	      System.out.println("결제된 총 요금 : " + total + "원");

	      // 2. 평균 요금 계산
	      // 총 요금 / 총 이용 횟수
	      //  이용 횟수가 0번일 때 나누면 에러가 나므로 조건문으로 확인해야 함
	      	       
	      if (count > 0) {
	         // 정수 나누기 정수는 정수가 되므로, (double)로 형변환하여 소수점까지 계산
	         avg = (double) total / count;
	      }

	      // 3. 평균 요금 출력
	      // 실수로 출력 
	      System.out.printf("평균 요금 : %.2f원\n", avg);

	      System.out.println("이용해 주셔서 감사합니다.");
		
		
	
//		이해준--------------------
//		마일리지 
	      // 마일리지의 구간 정하기 
	      int mileagenum1=mileageIndex/10;  // 마일리지의 할인구간을 구하기 위한 몫 구하기 
	      int mileagenum2 =mileagenum1 *10; // 마일리지 할인 구간 
	      
	      //구간 금액 누적합 
	      for(int i =0; i <mileagenum2; i++) { // 마일리지 배열에 저장된 길이 
	    	  mileageTotal +=mileageCount[i];	    	  
	      }
	      //10회 이상 사용시 5% 마일리지 적립 
	      double mileage05 = mileageTotal * 0.05;
//	      System.out.println("5% 마일리지 : " + mileage05);
	      
	      //사용마다 1% 마일리지 적립
	      double mileage01 = total*0.01;
//	      System.out.println("1% 마일리지 : " + mileage01);
	      
	      mileageTotal = mileage05+mileage01;
	      //총 마일리지
	      System.out.printf("마일리지 금액 : %.0f\n", mileageTotal);
	      sc.close();
	}
}

