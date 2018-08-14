
public class Runner {
	
//	static String text ="Окно показывало смазанные ели, белый шум ноябрьской пурги; телеграфные столбы мельтешили, как поползшие рамки кадра в черно-белом кино. Показывали в окне Россию, которая от самого Соликамска вот вся такая была: елки, снег, столбы, потом прогалина с пришибленными избами, потом вокзал с силикатными авитаминозными двухэтажками, и опять — елок миллион густо и непроходимо натыкано вдоль путей — как колючкой обвито, не продерешься. Но в этой нескончаемости и одинаковости природной застройки заоконной России и были вся ее мощь, величие и красота. Красотища, бляха!";
	static String text = "by and by, when we got up, we turned over the truck the gang had stole off of the wreck, and found boots, and blankets, and clothes, and all sorts of other things, and a lot of books, and a spyglass, and three boxes of seegars. we hadn't ever been this rich before in neither of our lives. the seegars was prime. we laid off all the afternoon in the woods talking, and me reading the books, and having a general good time. I told Jim all about what happened inside the wreck and at the ferryboat, and I said these kinds of things was adventures; but he said he didn't want no more adventures. he said that when I went in the texas and he crawled back to get on the raft and found her gone he nearly died, because he judged it was all up with him anyway it could be fixed; for if he didn't get saved he would get drownded; and if he did get saved, whoever saved him would send him back home so as to get the reward, and then Miss Watson would sell him south, sure. Well, he was right; he was most always right; he had an uncommon level head for a nigger.";
	public static void main(String[] args) {
	

		Search search = new Search();
		search.setText(text);
		
		search.calcWord(search.stringToWord(text));
	}
}
