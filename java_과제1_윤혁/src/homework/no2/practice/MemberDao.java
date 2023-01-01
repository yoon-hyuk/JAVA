package practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class MemberDao {
	private JDBCTemplate jdt = JDBCTemplate.getInstance();
	
	public void insertMember(Member member) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			conn = jdt.getConnection();
		
			
			String sql = "INSERT INTO member(user_id, password,email,grade,tell,is_leave) "
					+ "VALUES(?,?,?,?,?,?)";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getPassword());
			pstm.setString(3, member.getEmail());
			pstm.setString(4, member.getGrade());
			pstm.setString(5, member.getTell());
			pstm.setString(6, member.isIsleave() ? "Y" : "N");
			
			res = pstm.executeUpdate();
			
			jdt.commit(conn);
		}catch(SQLException e) {
			e.printStackTrace();
			jdt.rollback(conn);
		}finally {
			jdt.close(pstm);
			jdt.close(conn);
		}
		
		return;
		
	}
}
