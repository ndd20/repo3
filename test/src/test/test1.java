package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/mycrmdb?useUnicode=true&characterEncoding=utf-8"; // 数据库连接字符串，一般使用统一资源定位符（url）的形式

		String user = "root"; // 连接数据库时的用户
		String password = "root";
		Connection conn=null;
		PreparedStatement pstms=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url, user, password);
			String sql="select * from employee";
			pstms=conn.prepareStatement(sql);
			rs=pstms.executeQuery();
			while(rs.next()) {
				int empid=rs.getInt("empid");
				System.out.println(empid);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
