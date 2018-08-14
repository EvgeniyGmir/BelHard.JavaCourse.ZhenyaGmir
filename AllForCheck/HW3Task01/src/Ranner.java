
public class Ranner {
	public static void main(String[] args) {
		Word word = new Word("Something1");
		Text text = new Text (word);
		
		Word word1 = new Word("/////");
		Word word2 = new Word("212");
		Word word3 = new Word("rerew");
		
		Sentence sentence = new Sentence();
		sentence.addValue(word1);
		sentence.addValue(word2);
		sentence.addValue(word3);
		
		text.addBody(sentence);
		
		System.out.println("Head: " + text.getHeader());
		System.out.println("Body: " + text.getBody());
	}
}
