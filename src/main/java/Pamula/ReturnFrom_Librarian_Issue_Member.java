package Pamula;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ReturnFrom_Librarian_Issue_Member")
public class ReturnFrom_Librarian_Issue_Member {
	private String Book_Number_3, Id_3, Name_3, Mobile_3, Issue_Date_3, Return_Date_3;

	public ReturnFrom_Librarian_Issue_Member() {
		super();
	}

	public ReturnFrom_Librarian_Issue_Member(String Book_Number_3, String Id_3, String Name_3, String Mobile_3,
			String Issue_Date_3, String Return_Date_3) {
		super();
		this.Book_Number_3 = Book_Number_3;
		this.Id_3 = Id_3;
		this.Name_3 = Name_3;
		this.Mobile_3 = Mobile_3;
		this.Issue_Date_3 = Issue_Date_3;
		this.Return_Date_3 = Return_Date_3;
	}

	public String getBook_Number_3() {
		return Book_Number_3;
	}

	public void setBook_Number_3(String book_Number_3) {
		Book_Number_3 = book_Number_3;
	}

	public String getId_3() {
		return Id_3;
	}

	public void setId_3(String id_3) {
		Id_3 = id_3;
	}

	public String getName_3() {
		return Name_3;
	}

	public void setName_3(String name_3) {
		Name_3 = name_3;
	}

	public String getMobile_3() {
		return Mobile_3;
	}

	public void setMobile_3(String mobile_3) {
		Mobile_3 = mobile_3;
	}

	public String getIssue_Date_3() {
		return Issue_Date_3;
	}

	public void setIssue_Date_3(String issue_Date_3) {
		Issue_Date_3 = issue_Date_3;
	}

	public String getReturn_Date_3() {
		return Return_Date_3;
	}

	public void setReturn_Date_3(String return_Date_3) {
		Return_Date_3 = return_Date_3;
	}
}





