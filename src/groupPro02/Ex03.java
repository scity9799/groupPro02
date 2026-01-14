package groupPro02;

import java.util.Scanner;
//19:20 대충 짜본 프레임 조원들 주는거 보고 다시 설정할 생각해야함
public class Ex03 {
	public static void main(String[] args) {
				
		Scanner sc= new Scanner (System.in);
		Ex01 team02=new Ex01();
		
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
		
		

//		team02.age();//나이값 요구및 출력문
//		sAge값 반환
		
		
		System.out.println("프로그램을 시작합니다");	
		boolean cheack = true;                       
		while(cheack) {// while문 시작
//			team02.ui01();
//			첫번째 화면 출력문들
			int choice = sc.nextInt();
			switch(choice) {//switch문 시작
			case 1 :
//				sAge BUS_PRICE DISCOUNT_RATE 입력요구
//				mileageCount[] mileageIndex b_count BUS[b_count] 출력요구
//				team02.bus(); 버스탈때 계산
//				mileageCount[],mileageIndex,b_count,BUS[]=team02.bus(sAge,BUS_PRICE,DISCOUNT_RATE,mileageCount[],mileageIndex,b_count,BUS[]);
				break;
			case 2 :
//				team02.subway(); 지하철 탈때 계산	
//				age SUBWAY_PRICE DISCOUNT_RATE 입력요구
//				mileageCount[] mileageIndex s_count SUBWAY[s_count] 출력요구
//				mileageCount[],mileageIndex,s_count,SUBWAY[]=team02.subway(age,SUBWAY_PRICE,DISCOUNT_RATE,mileageCount[],mileageIndex,s_count,SUBWAY[]);//아마 이런식일듯? 출력문 순서 잘 생각해서 실제로는 바꿔야함
				break;
			case 3:
//이미 만들어둔거	team02.Info(choice,sAge,BUS_PRICE,SUBWAY_PRICE,DISCOUNT_RATE,b_count,s_count,count);
				break;
			default : 
				System.out.println("이용해주셔서 감사합니다");
				cheack = false;
				break;
			}
			count=b_count+s_count;
		}
					
//이미 만들어둔거2  team02.PrintTotal(s_count,b_count,count);	
		
		
//		SUBWAY[] BUS[] s_count b_count count 요구
//		total 출력
// 		team02.avg();결제된 총 요금,평균요금 출력
//		total=team02.avg();//아마 이런식으로 할듯?
		
		
//		mileageCount[] mileageIndex 요구
//		team02.mile(); 마일리지 계산
	      sc.close();
}
	}