
public class Task12 {
	public static void main (String[] args) {
	
		int [] mas = {2, 3, 45, 1, 6, 7, 4, 43, 4, 5, 49};
		int minNumber = mas[0], maxNumber = mas[0], k, indexOfMinNumber = 0, indexOfMaxNumber = 0;
		int summ = 0;
		for(int i = 0; i < mas.length; i ++) {
			k = mas[i];
			if(minNumber > k) {
				minNumber = k;
				indexOfMinNumber = i;
			}
		}
		for(int i = 0; i < mas.length; i ++) {
			k = mas[i];
			if(maxNumber < k) {
				maxNumber = k;
				indexOfMaxNumber = i;
			}
		}
		for(int i = indexOfMinNumber; i <= indexOfMaxNumber; i++) {
			summ += mas[i];
		}
		System.out.println("Sum elements of array from min value to max (include their) is " + summ);
	}
}
