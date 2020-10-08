package p1;

public class Book {

	private String titles;
	private String isbn;
	private String author;
	private double price;

	public Book(String titles, String author,String isbn, double price) {
		super();
		this.titles = titles;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [" + "titles=" + titles + ", isbn=" + isbn + " " + "author = " + author + ", price=" + price
				+ "] \n";
	}
}
