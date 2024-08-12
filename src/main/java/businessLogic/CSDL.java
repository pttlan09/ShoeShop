package businessLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection conn;

	private static final String url = "jdbc:mysql://localhost:3306/shoeshop?useUnicode=true&characterEndcoding=UTF-8";

	public static Connection getKetNoi() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,"root","");
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public static void main(String[] args) {
		Connection conn=getKetNoi();
		if(conn!=null) {
			System.out.println("Connected");
		}else
		{
			System.out.println("can not connect");
		}
		
	}

}
