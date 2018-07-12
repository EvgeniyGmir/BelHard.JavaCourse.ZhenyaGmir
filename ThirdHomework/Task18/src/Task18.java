import java.util.StringTokenizer;

public class Task18 {
	public static void main(String[] args) {
		String str = "   this  text   for    example";
		String withoutStartAndLastSpace = str.trim();
		StringTokenizer token = new StringTokenizer(withoutStartAndLastSpace);
		int kol = 0;	
		while (token.hasMoreTokens()) {
		token.nextToken();
		kol ++;}
		System.out.println(kol);
		

	}
}
