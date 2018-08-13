
public class User {

	private String userName;
	private int user_id;
	
	public User(String userName, int user_id) {
		this.userName = userName;
		this.user_id = user_id;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	
}
