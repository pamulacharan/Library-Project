package Pamula;

import javax.servlet.annotation.WebServlet;

@WebServlet("/ReturnFrom_Admin_Issue_Member")
public class ReturnFrom_Admin_Issue_Member {
	private String Book_number, Id, Name, Mobile, Date, Return_date;

	public ReturnFrom_Admin_Issue_Member() {
		super();
	}

	public ReturnFrom_Admin_Issue_Member(String Book_number, String Id, String Name, String Mobile, String Date,String Return_date) {
		super();
		this.Book_number = Book_number;
		this.Id = Id;
		this.Name = Name;
		this.Mobile = Mobile;
		this.Date = Date;
		this.Return_date=Return_date;
	}

	public String getBook_number() {
		return Book_number;
	}

	public void setBook_number(String book_number) {
		Book_number = book_number;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getReturn_date() {
		return Return_date;
	}

	public void setReturn_date(String return_date) {
		Return_date = return_date;
	}
}