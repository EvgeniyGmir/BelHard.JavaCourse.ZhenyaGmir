import java.util.List;

public class Book {
	
	private String bookName;
	private int book_id;
	private Boolean byReadRoom;
	private int author_id;
	private int genre_id;
	
	private List<User> readerList;
	
	
	
	public Book() {
		super();
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Boolean getByReadRoom() {
		return byReadRoom;
	}
	
	public void setByReadRoom(Boolean byReadRoom) {
		this.byReadRoom = byReadRoom;
	}
	
	public List<User> getReaderList() {
		return readerList;
	}
	
	public void setReaderList(List<User> readerList) {
		this.readerList = readerList;
	}
	
	public int getAuthor_id() {
		return author_id;
	}
	
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	public int getGenre_id() {
		return genre_id;
	}
	
	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}
	
	public String toString(){
		return "Book [id= " + book_id + ", name= " + bookName + ", authorId= " + author_id + ", genreId= " + genre_id + "]";
	}
	
}
