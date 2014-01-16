package umm.softwaredesign.stacklab;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the StackIF interface for a basic stack.
 * 
 * @author Nic McPhee, last changed by $Author: prodgera $ on $Date: 2006/01/25
 *         19:26:03 $
 * @version $Revision: 1.16 $
 */
public class Stack<T> implements StackIF<T> {
	/**
     * Construct an empty stack.
     */
	ArrayList<T> theStack = new ArrayList<T>();


    
    public Stack() {
       // throw new UnsupportedOperationException();
    }

    /**
     * Makes a new stack containing the given items.
     * 
     * We use this to construct specific stacks to use in testing.
     * 
     * @param items
     *            the list of items to initialize the stack
     */
    public Stack(List<T> items) {
        //throw new UnsupportedOperationException();
    	
        for(int i = 0; i < items.size(); i++){
			theStack.add(items.get(i));
        }
        return;
        
    }


	/**
     * Computes the size of the stack.
     * 
     * @return the number of elements on the stack
     */
    
    
    public int size() {
        //throw new UnsupportedOperationException();
        return theStack.size();
    }

    /**
     * Determines if a stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        //throw new UnsupportedOperationException();
        return theStack.isEmpty();
    }

    /**
     * Push the specified value onto the stack.
     * 
     * @param value
     *            the value to be pushed.
     */
    public void push(T value) {
    	theStack.add(value);
    	return;
    }

    /**
     * Removes and returns the top value from the stack. If the stack is empty a
     * StackUnderflowException is thrown.
     * 
     * @return the element removed from the stack
     * @throws StackUnderflowException
     *             if the stack is empty
     */
    public T pop() {
    	if(theStack.isEmpty()) {
    		throw new StackUnderflowException();
    	} else {
    		return theStack.remove(theStack.size() - 1);
    	}
    }

    /**
     * Return the value on top of the stack. This does not change the stack in
     * any way. If the stack is empty a StackUnderflowException is thrown.
     * 
     * @return the top value on the stack
     * @throws StackUnderflowException
     *             if the stack is empty
     */
    public T top() {
        return theStack.get(theStack.size() - 1);
    }

    /**
     * Determines if this stack contains the given items in the given order.
     * 
     * @param items
     *            is a list of items to check against the items in this stack
     * @return a boolean value indicating whether this stack has the specified
     *         elements
     */
    public boolean hasElements(List<T> items) {
        return items.equals(theStack);
    }

    /**
     * Generate a string representation of our stack. A stack containing
     * elements [x0, x1, x2, ..., xn] (where x0 is the bottom of the stack and
     * xn is the top) is represented by the string "Stack[s0, s1, s2, ..., sn]",
     * where the si are the string (printed) representations of the elements xi.
     * 
     * @return a string representation of this stack
     */
    @Override
    public String toString() {
        String string = "";
        for(int i = 0; i < theStack.size(); i++) {
        	string = "" + theStack.get(i);
        }
        return string;
    }
}
