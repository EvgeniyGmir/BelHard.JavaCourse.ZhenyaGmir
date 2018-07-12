
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {
	public static void main(String[] args) {
		int kol = 0, kol1 = 0, kol2 = 0, kol3 = 0, kol4 = 0;
		String str = "This. is, task.  and I; must found, all: punctuation; marks.";
		StringTokenizer token = new StringTokenizer(str, ",.:;");
		for(int i = 0; i < token.countTokens(); i++) {
			kol++;
		}
		System.out.println("Number of found punctuation marks is " + kol);
		 Pattern pattern = Pattern.compile(",");
		 Matcher matcher = pattern.matcher(str);
		 while(matcher.find()) {
			kol1 ++;
		 }
		 System.out.println("In this string are " + kol1 + " _ , _");
		 pattern = Pattern.compile("\\.");
		 matcher = pattern.matcher(str);
		 while(matcher.find()) {
			kol2 ++;
		 }
		 System.out.println("In this string are " + kol2 + " _ . _");		
		 pattern = Pattern.compile(":");
		 matcher = pattern.matcher(str);
		 while(matcher.find()) {
			kol3 ++;
		 }
		 System.out.println("In this string are " + kol3 + " _ : _");
		 pattern = Pattern.compile(";");
		 matcher = pattern.matcher(str);
		 while(matcher.find()) {
			kol4 ++;
		 }
		 System.out.println("In this string are " + kol4 + " _ ; _");	
	}
}
