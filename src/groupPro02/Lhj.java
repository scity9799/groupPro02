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


}
