package Pamula;

import javax.servlet.annotation.WebServlet;

@WebServlet("/AddBook_Member")
public class AddBook_Member {
	private String Book_Number, Book_Name, Author, Publisher, Quantity;

	public AddBook_Member() {
		super();
	}

	public AddBook_Member(String Book_Number, String Book_Name, String Author, String Publisher, String Quantity) {
		super();
		this.Book_Number = Book_Number;
		this.Book_Name = Book_Name;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Quantity = Quantity;

	}

	public String getBook_Number() {
		return Book_Number;
	}

	public void setBook_Number(String book_Number) {
		Book_Number = book_Number;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	
}