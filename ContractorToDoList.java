/**
 * Holds all the values of the variables in ToDo.
 * @author Cole
 *
 */
import java.util.*;
public class ContractorToDoList {
	private String address;
	private ToDo[] todos = new ToDo[2];
	private int count;
	
	/**
	 * Sets the address for the project
	 * @param address
	 */
	public ContractorToDoList(String address) {
		super();
		this.address = address;
	}
	
	/**
	 * Contains a boolean to check if todo has been added.
	 * Loops through the array to find a spot that is null.
	 * Accepts the title, description, price, contact, and list of supplies.
	 * Doubles the array when the end is reached.
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		boolean added = false;
		for(int i = 0; i < todos.length; i++) {
			if(todos[i] == null) {
				todos[i] = new ToDo(title, description, price, contact, supplies);
				added = true;
				break;
			}
		}
		if(added == false) {
			this.todos = this.growArray(todos);
			this.addToDo(title, description, price, contact, supplies);
		}
	}
	
	/**
	 * Returns a new ToDoIterator
	 * @return
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(this.todos);
	}
	
	/**
	 * Returns the address of the project
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Returns the total cost of the project.
	 * @return
	 */
	public double getTotalCost() {
		double totalCost = 0.0;
		for(int i = 0; i < todos.length; i++) {
			if(todos[i] != null) {
				totalCost += todos[i].getPrice();
			}
		}
		return totalCost;
	}
	
	/**
	 * Returns a copy of the todos array except it is double the size.
	 * @param todos - Passes in the todos array
	 * @return
	 */
	private ToDo[] growArray(ToDo[] todos) {
		return Arrays.copyOf(todos, todos.length*2);
	}
}
