import javax.validation.constraints.NotNull;


public class Book {

	@NotNull(message="")
	private String title;
	private Float price;
	private String description;
	private String number;

	public Book() {
	}

	public Book(String title, Float price, String description, String number) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
