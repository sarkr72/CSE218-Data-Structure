package p2;


public class Book{

	private String titles;
	private String isbn;
	private double price;
	
	public Book(String titles, String isbn, double price) {
		this.titles = titles;
		this.isbn = isbn;
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

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book ["  + "titles=" + titles + ", isbn=" + isbn + " "  + ", price=" + price
				+ "] \n";
	}
}
