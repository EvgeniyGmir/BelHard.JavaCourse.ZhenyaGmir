import java.awt.PageAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
	
	private String text;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String[] stringToWord(String text) {
		text = text.replaceAll("[^a-zA-Zà-ÿÀ-ß]", " ");
		String [] arrayWord = text.trim().split("\\s+");
//		System.out.println(arrayWord[3]);
//		for (int i = 0; i < arrayWord.length; i++) {
//			System.out.print(arrayWord[i]);
//		}
		return arrayWord;
	}
	
	public void calcWord(String[] arrayWord) {
		List<String> list = new ArrayList<>();
		String word;
		int calc;
		for (int i = 0; i < arrayWord.length; i++) {
			list.add(arrayWord[i]);

		}
//		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			word = list.get(i);
			calc = 0;
			for (int j = 0; j < list.size(); j++) {
				if(word.equals(list.get(j))) {
					calc++;
					list.remove(j);
				}
			}
			System.out.println("The word \"" + word + "\" was met " + calc +" times in the text.");
			
		}
	}
	
	
	
}
