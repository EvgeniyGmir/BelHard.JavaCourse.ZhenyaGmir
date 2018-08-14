import java.io.File;
import java.io.PrintWriter;

public class FileWorker {
	private String fileName;
	public FileWorker(String fileName) {
		this.fileName = fileName;
	}
	public void fileWriter(String text) {
		File file = new File(fileName);
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(file.getAbsoluteFile());
			
			try {
				pw.write(text);
			}finally{
				pw.close();
			}
		}catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}
