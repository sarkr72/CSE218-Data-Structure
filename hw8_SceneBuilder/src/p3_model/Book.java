package p3_model;

public class Book implements Comparable<Book> {

	private String titles;
	private String isbn;
	private Author author;
	private double price;

	public Book(String titles, String isbn, Author author, double price) {
		super();
		this.titles = titles;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}

	public Book(String isbn) {
		this.isbn = isbn;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
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

	@Override
	public int compareTo(Book b) {
		return this.isbn.compareTo(b.isbn);
	}
}
