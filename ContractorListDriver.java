
import java.util.ArrayList;

public class ContractorListDriver {
	public void run() {
		ContractorToDoList jeffryHouse = new ContractorToDoList("123 Market St.");
		
		ArrayList<String> excavatingSupplies = new ArrayList<String>();
		excavatingSupplies.add("Skid Steer");
		excavatingSupplies.add("Chain Saw");
		excavatingSupplies.add("Track Hoe");
		jeffryHouse.addToDo("Grading and Site Preparation", "Tree removal and excavation", 4000, "Fred Berry",excavatingSupplies);
		
		ArrayList<String> foundationSupplies = new ArrayList<String>();
		foundationSupplies.add("Concrete");
		jeffryHouse.addToDo("Foundation Construction", "Install Footings, and Stem Walls", 8000, "Tom Law",foundationSupplies);
		
		ArrayList<String> framingSupplies = new ArrayList<String>();
		framingSupplies.add("Wood");
		framingSupplies.add("Nails");
		framingSupplies.add("Hammer");
		jeffryHouse.addToDo("Framing", "Fram houses exterior and interior", 20000, "Jim Johnson",framingSupplies);
		
		//Note: There are more steps, but this is sufficient for this exercise.
		System.out.println("Details for: " + jeffryHouse.getAddress());
		System.out.println("Total project price: $" + jeffryHouse.getTotalCost());
		
		ToDoIterator todoIterator = jeffryHouse.createIterator();
		
		System.out.println("\nContractor ToDo List:");
		while(todoIterator.hasNext()) {
			ToDo todo = todoIterator.next();
			System.out.println(todo);
		}
	}
	
	public static void main(String[] args) {
		ContractorListDriver driver = new ContractorListDriver();
		driver.run();
	}
}
