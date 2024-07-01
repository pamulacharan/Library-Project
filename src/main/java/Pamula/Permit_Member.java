package Pamula;

public class Permit_Member {
	private String username, password, Approved;
	
	public Permit_Member() {
		super();
	}

	public Permit_Member(String username, String password, String Approved) {
		super();

		this.username = username;
		this.password = password;
		this.Approved=Approved;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApproved() {
		return Approved;
	}

	public void setApproved(String approved) {
		Approved = approved;
	}
}
