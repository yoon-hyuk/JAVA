package homework.no2.practice;

import java.sql.SQLException;

public class Run {

	public static void main(String[] args) throws SQLException {
		MemberDao memberDao = new MemberDao();
		Member member = new Member();
		
		member.setUserid("yoon");
		member.setPassword("7549");
		member.setEmail("krystal@naver.com");
		member.setGrade("2");
		member.setTell("01029064350");
		member.setLeave(false);
		
		memberDao.insertMember(member);
	}
	
}
