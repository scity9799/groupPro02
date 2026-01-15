package groupPro02;

import java.util.Scanner;

//김태우 결제된 총 요금과 평균 요금 계산
public class ktw {
	//내 클래스에는 계산 기능이 있는거야 총액과 평균금액을
	//값이 정해져야 내가 알 수 있는데....
	//횟수도 내가 알아야지...
	//메인에서 값과 횟수가 결정이 되면 내 클래스에 대입을 하고
	//내 클래스에 있는 메소드를 사용해서 출력이 되면 된다 이건가?
	//필드 설정할거 없이 기능만 구현해놔?

//우리가 만들었던거 생각하면 값이 마지막에 나오잖아 그 결과를 바탕으로 
//금액이 화면에 보이면 내꺼에서 입력을 해주고 계산 금액보이게??
	
//우리가 정보창에서 어떤 대중교통을 몇회 이용했는지 각 요금은 얼마인지 확인할 수 있으니까
//직접 입력받아버리지 모
	int s_count;
	int b_count;
	int s_price;
	int b_price;
	
void total() {
	
	Scanner input = new Scanner(System.in);
	System.out.println("지하철 이용 횟수를 입력해주세요 : ");
	s_count = input.nextInt();
	System.out.println("당신의 지하철 요금을 입력해주세요 : ");
	s_price = input.nextInt();
	System.out.println("버스 이용 횟수를 입력해주세요 : ");
	b_count = input.nextInt();
	System.out.println("당신의 버스 요금을 입력해주세요 : ");
	b_price = input.nextInt();
	
	input.nextLine();

	int total = s_count*s_price + b_count*b_price;
	System.out.println("총 이용 금액은 "+total+"원 입니다.");
	
}

//이런식이 맞나? 문제 의도가 이런게 아닌거 같은데...
//메인에서 어떤 객체를 생성시켜서 값을 입력받으면...
//아니 근데 내가 어케앎? 위에서 식이 작성될 때 나는 그냥 계산만 하는거면 이게 맞나?
//메인으로 합친다면 각 기능마다 객체를 생성시키고 써야할텐데??? 흠....

//긴가민가하니 일단 총합구하는것만 올려보겠음

}
