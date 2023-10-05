package iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * An object that iterates over a stack.
 * @author Michael Pikula
 */
public class StackIterator implements Iterator<String>
{
    private Stack<String> items;
    private int position;

    /**
     * Creates an iterator for the specified stack.
     * @param items The stack to be iterated over.
     */
    public StackIterator(Stack<String> items)
    {
        this.items = items;
        position = 0;
    }

    /**
     * Retrieves the next item in the stack.
     * @return The item at the current position in the stack.
     */
    public String next()
    {
        if (!hasNext())
            return null;
        return items.get(position++);   // Return item at index position, then increment position.
    }
    /**
     * Checks to see if the current position is past the end of the stack.
     * @return Whether or not the stack has anything left to use.
     */
    public boolean hasNext()
    {
        return position < items.size();
    }
}
