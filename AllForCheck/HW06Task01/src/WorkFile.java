import java.io.FileNotFoundException;
import java.util.Random;

public class WorkFile {
//	private static String text = "Text testt";
	private static String fileName = "test.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		int summ = 0;
		double average;
		FileWorker fileWorker = new FileWorker(fileName);
		Random rand = new Random();
		int [] numberArray = new int[20];
		for (int i = 0; i < 20; i++) {
			numberArray[i]= rand.nextInt(100);
		}	
		
		
		fileWorker.fileWriter(numberArray);
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(fileWorker.fileReader(fileName)[i] + " ");
			summ += fileWorker.fileReader(fileName)[i];
		}
		System.out.println("\nAverage is " + summ/(fileWorker.fileReader(fileName).length));

		
	}
}
