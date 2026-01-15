package ssu_work;

public class Mile {
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
}
