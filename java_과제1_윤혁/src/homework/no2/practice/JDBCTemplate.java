package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JDBCTemplate {

	private static final JDBCTemplate INSTANCE = new JDBCTemplate();

	private JDBCTemplate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static JDBCTemplate getInstance() {
			return INSTANCE;
	}
	
	public Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/problem?useUnicode=true$characterEncoding=utf8";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url,"yoon","123qwe!@#QWE");
			conn.setAutoCommit(false);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}	
	
	public void commit(Connection conn) {
		
		try {
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection conn) {
		try {
				conn.rollback();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) rset.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed())stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection conn) {
		try {
			if(conn != null && conn.isClosed()) conn.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(ResultSet rset, Statement stmt) {
		close(rset);
		close(stmt);
	}
}