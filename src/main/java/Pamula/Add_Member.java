package Pamula;


public class Add_Member {
	
	private String Id,Status,Name,Password,Email,Mobile;
	
	
	public Add_Member() {
		super();
	}

	public Add_Member(String Id, String Status, String Name, String Password, String Email, String Mobile) {
		super();
		this.Id = Id;
		this.Status = Status;
		this.Name = Name;
		this.Password = Password;
		this.Email = Email;
		this.Mobile = Mobile;
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	
}

