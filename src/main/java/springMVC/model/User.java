package springMVC.model;

public class User {
	private String userName;
	private String userEmail;
	private String note;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String userEmail, String note) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.note = note;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", note=" + note + "]";
	}

}