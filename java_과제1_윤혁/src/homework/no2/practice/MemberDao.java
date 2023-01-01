package homework.no2.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import homework.no2.practice.exception.DataAccessException;

public class MemberDao {
	public int insertMember (Member member) throws SQLException {
		Connection conn = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/problem?useUnicode=true&characterEncoding=utf8";
			conn = DriverManager.getConnection(url, "yoon", "123qwe!@#QWE");
				
			String sql = "INSERT INTO member(user_id, password,email,grade,tell,is_leave) "
					+ "VALUES(?,?,?,?,?,?)";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getPassword());
			pstm.setString(3, member.getEmail());
			pstm.setString(4, member.getGrade());
			pstm.setString(5, member.getTell());
			pstm.setString(6, member.isLeave() ? "Y" : "N");
			res = pstm.executeUpdate();
			
			conn.commit();
			
			
		}catch (SQLException e) {
				e.printStackTrace();
				conn.rollback();
				throw new DataAccessException(e);
			}catch(ClassNotFoundException e) {
			e.printStackTrace();		
            }finally {
			pstm.close();
			conn.close();
		}
		return res;
	}
}