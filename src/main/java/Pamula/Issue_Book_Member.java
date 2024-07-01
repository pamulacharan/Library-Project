package Pamula;

import javax.servlet.annotation.WebServlet;
// Book_Number_2 Id_2 Name_2 Mobile_2 Issue_Date_2
@WebServlet("/Issue_Book_Member")
public class Issue_Book_Member {
	private String Book_Number_2, Id_2, Name_2, Mobile_2, Issue_Date_2;

	public Issue_Book_Member() {
		super();
	}

	public Issue_Book_Member(String Book_Number_2, String Id_2, String Name_2, String Mobile_2, String Issue_Date_2) {
		super();
		this.Book_Number_2 = Book_Number_2;
		this.Id_2 = Id_2;
		this.Name_2 = Name_2;
		this.Mobile_2 = Mobile_2;
		this.Issue_Date_2 = Issue_Date_2;
	}

	public String getBook_Number_2() {
		return Book_Number_2;
	}

	public void setBook_Number_2(String book_Number_2) {
		Book_Number_2 = book_Number_2;
	}

	public String getId_2() {
		return Id_2;
	}

	public void setId_2(String id_2) {
		Id_2 = id_2;
	}

	public String getName_2() {
		return Name_2;
	}

	public void setName_2(String name_2) {
		Name_2 = name_2;
	}

	public String getMobile_2() {
		return Mobile_2;
	}

	public void setMobile_2(String mobile_2) {
		Mobile_2 = mobile_2;
	}

	public String getIssue_Date_2() {
		return Issue_Date_2;
	}

	public void setIssue_Date_2(String issue_Date_2) {
		Issue_Date_2 = issue_Date_2;
	}

}