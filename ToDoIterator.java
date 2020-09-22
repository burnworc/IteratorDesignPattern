/**
 * Implements the java.util iterator.
 * @author Cole
 *
 */
import java.util.Iterator;
public class ToDoIterator implements Iterator<ToDo> {
	private ToDo[] todos;
	private int position;
	
	/**
	 * Accepts an array of toDo items.
	 * @param todos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
		this.position = 0;
	}
	
	/**
	 * Returns true if there is one or more item to iterate over.
	 */
	@Override
	public boolean hasNext() {
		if(position < todos.length && todos[position] != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns the next ToDo, if there is one, and null otherwise.
	 */
	@Override
	public ToDo next() {
		if(this.hasNext()) {
			return todos[position++];
		}
		else {
			return null;
		}
	}
}
