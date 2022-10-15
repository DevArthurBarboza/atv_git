package br.com.unifil.mvc.model;

public class Java {

	 
	 /*
	+---------------+-------------+------+-----+---------+----------------+
	| Field         | Type        | Null | Key | Default | Extra          |
	+---------------+-------------+------+-----+---------+----------------+
	| USER_ID       | int         | NO   | PRI | NULL    | auto_increment |
	| USER_NAME     | varchar(50) | NO   |     | NULL    |                |
	| USER_PASSWORD | varchar(20) | NO   |     | NULL    |                |
	| USER_EMAIL    | varchar(20) | YES  |     | NULL    |                |
	+---------------+-------------+------+-----+---------+----------------+
	  */
	
	private int userID;
	
	private String userName;
	
	private String userPassword;
	
	private String userEmail;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
	
	
}
