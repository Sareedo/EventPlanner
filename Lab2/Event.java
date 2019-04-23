package Lab2;
import java.util.Scanner;
public class Event {
	private OurDate date = new OurDate();
	private String description;
	public Event() { }
	public OurDate getDate() { return date; }
	public String getDescription() { return description; }
	public void setDate(OurDate date) { this.date = date; }
	public void setDescription(String description) { this.description = description; }
	public String toString() {
	return new String(" " +date + " - " +description);
	}
	public void scan() {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	this.date.scan();
	System.out.print("Enter description: ");
	this.description = scan.nextLine();
	}
	
}
