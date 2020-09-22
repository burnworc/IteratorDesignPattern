/**
 * Holds the details of an item which the contractor has to complete
 * @author Cole
 *
 */
import java.util.*;
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies = new ArrayList<String>();
	
	/**
	 * @param title - sets the title for the project
	 * @param description - sets the description for the project
	 * @param price - sets the estimated price of the project
	 * @param contact - sets the name for contact for the project
	 * @param supplies - sets the supplies needed for the project
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * Returns the price for the project.
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Returns the string for the output in the format specified in output.txt.
	 */
	@Override
	public String toString() {
		String s = "***** "+ title + " *****"+"\n" + description + "\n"+"Business Contact: " + contact +"\nSupply List:\n";
			for(String supp : supplies)
				s += "-"+ supp +"\n";
			s += "Price: $" + price;
			s += "\n";
			return s;
	}
}
