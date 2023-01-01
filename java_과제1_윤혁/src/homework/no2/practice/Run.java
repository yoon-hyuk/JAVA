package practice;

import java.sql.SQLException;



public class Run {
	
	public static void main(String[] args) throws SQLException {
		MemberDao memberDao = new MemberDao();
		Member member = new Member();
		
		member.setUserid("dbsgur");
		member.setPassword("1234");
		member.setEmail("yoon960325@naver.com");
		member.setGrade("2");
		member.setTell("01029064350");
		member.setIsleave(false);
		
		memberDao.insertMember(member);
		
	}
	
	
}
