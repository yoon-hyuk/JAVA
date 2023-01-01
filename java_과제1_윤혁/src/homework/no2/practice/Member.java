package homework.no2.practice;

public class Member {

	private String userid;
	private String password;
	private String email;
	private String grade;
	private String tell;
	private boolean isLeave;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public boolean isLeave() {
		return isLeave;
	}
	public void setLeave(boolean isLeave) {
		this.isLeave = isLeave;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", password=" + password + ", email=" + email + ", grade=" + grade
				+ ", tell=" + tell + ", isLeave=" + isLeave + "]";
	}
	
	
}
	

