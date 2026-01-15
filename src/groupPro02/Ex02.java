package groupPro02;

import java.util.Scanner;

//메소드용 파일

public class Ex02 {
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
//-----------김진옥 끝---------------------------------------------------------------------
//	public static void main(String[] args) {
//		
//				Ex02 ex = new Ex02(); 
//				//  메소드 실행 및 결과 받기 (sAge 변수에 결과가 들어감)
//				String sAge = ex.inputAge(); 
				
	
				
//		서서울 메소드 시작		
	double totalMile(int mileageIndex, double mileageTotal, int[] mileageCount, int total) {
		 int mileagenum1 = mileageIndex/10;
		 int mileagenum2 = mileagenum1 * 10;
		 			 			 	
		 for(int i = 0; i < mileagenum2; i++) {
		 	mileageTotal += mileageCount[i];
		 }
		 	
		 double mileage05 = mileageTotal * 0.05;
		 double mileage01 = total * 0.01;
		 	
		 return mileage05 + mileage01;
		}
//		서서울 메소드 끝			
				
				
}


