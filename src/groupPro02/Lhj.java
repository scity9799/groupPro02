package groupPro02;

//메소드용 파일 

public class Lhj {
			
	int busRide(int age, int BUS_PRICE, double DISCOUNT_RATE,
            int[] BUS, int b_count,
            int[] mileageCount, int mileageIndex) {
	//나이 , 버스 요금, 교통수단 할인율, 버스배열, 버스 탑승 숫자
	//마일리지 배열, 마일리지 순서 배열 받기 
 
		
	          if (age >= 0 && age < 12) {
	        	  return 0; // 나이가 어린이이면 무료이기 때문에 0반환 
	          } else if(age >=12 && age < 19) { // 청년요금 계산 후 반환 
	             return (int)(BUS_PRICE - (BUS_PRICE  *DISCOUNT_RATE));
	          } else {
	            return BUS_PRICE; // 성인 요금 반환 
	          }
		 	
//	        
	}
	
	public static void main(String[] args) {
//		Lhj ex02 = new Lhj(); // 객체 생성 
//		switch(choice) {//switch문 시작
//		case 1 :
//			BUS[b_count] =ex02.busRide(age, BUS_PRICE, DISCOUNT_RATE, BUS, b_count, mileageCount, mileageIndex);
//			// CASE1번인경우 버스 요금을 메소드로 가서 계산 후 가격을 반환 
//			mileageCount[mileageIndex] = BUS[b_count]; //탄 순서대로 버스 요금 저장 
//			mileageIndex++;
//			b_count++;
//			break;
//		
	}

	}

