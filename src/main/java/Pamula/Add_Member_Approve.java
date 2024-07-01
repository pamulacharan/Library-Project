package Pamula;

public class Add_Member_Approve {

	private String Id, Approved;

	public Add_Member_Approve() {
		super();
	}

	public Add_Member_Approve(String Id, String Approved) {
		super();
		this.Id = Id;
		this.Approved = Approved;
	}

	public String getApproved() {
		return Approved;
	}

	public void setApproved(String approved) {
		this.Approved = approved;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
}
