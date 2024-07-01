package Pamula;

public class Add_Lib_Member {

	private String Name_1, Password_1, Approved_1;

	public Add_Lib_Member() {
		super();
	}

	public Add_Lib_Member(String Name_1, String Password_1, String Approved_1) {
		super();

		this.Name_1 = Name_1;
		this.Password_1 = Password_1;
		this.Approved_1=Approved_1;
	}

	public String getName_1() {
		return Name_1;
	}

	public void setName_1(String name_1) {
		Name_1 = name_1;
	}

	public String getPassword_1() {
		return Password_1;
	}

	public void setPassword_1(String password_1) {
		Password_1 = password_1;
	}

	public String getApproved_1() {
		return Approved_1;
	}

	public void setApproved_1(String approved_1) {
		Approved_1 = approved_1;
	}

	
}