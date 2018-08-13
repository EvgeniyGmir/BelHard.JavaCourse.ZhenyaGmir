import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.mysql.*;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver registered");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Evgeniy04gmir06");
		
			
			
			
			System.out.println("11111");
//		String sql = "UPDATE books set name = 'UPDATED' WHERE id_book = ?";
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setInt(1, new Random().nextInt(4) + 1);
//		statement.executeUpdate();
		
	} catch (SQLException e) {
		System.out.println(e);
	}finally {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}
