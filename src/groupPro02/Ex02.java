package groupPro02;

import java.util.Scanner;

//메소드용 파일

public class Ex02 {
	//정현주 메소드------------------------------------------------------------------
	   void subway(String sAge, int SUBWAY_PRICE, double DISCOUNT_RATE, int mileageCount[], int mileageIndex, int s_count, int SUBWAY[]) {
		      if(sAge.equals("아동")) { //
		         SUBWAY[s_count] = 0;
		      }else if(sAge.equals("청소년")) {
		         SUBWAY[s_count] = (int)((1 - DISCOUNT_RATE) * SUBWAY_PRICE);
		      }else {
		         SUBWAY[s_count] = SUBWAY_PRICE;
		      }	
		      mileageCount[mileageIndex] = SUBWAY[s_count];
	}
	   //---------------------------------------------------------------------------
	   
		// 김진옥 메소드 시작----------------------
		String inputAge() {
			Scanner sc = new Scanner(System.in);
			int age = 0;
			String sAge = "";

			System.out.print("나이를 입력해주세요 : "); //정현주님 코드 복사
			age = sc.nextInt();
			sc.nextLine(); 

			if (age >= 0) {
				if (age >= 0 && age < 12) {
					sAge = "아동";
				} else if (age >= 12 && age < 19) {
					sAge = "청소년";
				} else {
					sAge = "성인";
				}
			}
			System.out.println(sAge + "입니다.");
			
			return sAge; // 결과값("아동", "청소년", "성인")을 main으로 던져줘서 출력 가능하게 함!
		}

}
