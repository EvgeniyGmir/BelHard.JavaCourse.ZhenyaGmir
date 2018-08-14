import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileWorker {
	private String fileName;
	public FileWorker(String fileName) {
		this.fileName = fileName;
	}
	
	public void fileWriter(int[] array) {
		File file = new File(fileName);
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		
		PrintWriter writer = new PrintWriter(file.getAbsoluteFile());
		try {
			for (int i = 0; i < array.length; i++) {
				writer.println(array[i]);	
			}
			
		}finally {
			writer.close();
		}
		}catch (Exception e) {
			System.out.println("Exception!");
		}
	}
	
	public int[] fileReader(String nameFile) throws FileNotFoundException {
		
//		File file = new File(nameFile);
		StringBuilder sb = new StringBuilder();
		int j= 0;
		int[] i = new int[20];
		
//		exists(nameFile);
		try {
		BufferedReader br = new BufferedReader( new FileReader(fileName));
		 try {
			String s;
			while((s = br.readLine()) != null) {
				i[j] = Integer.parseInt(s);
//				sb.append(s);
//				sb.append(" ");
				j++;
			}
		}finally {
			br.close();
		}
		}catch (Exception e) {
			System.out.println("Exception!");
		}
	
		return i;
	}
	
}
