package iterator;

import java.util.Iterator;  // TODO how do you implement this
import java.util.Stack;

public class StackIterator
{
    private Stack<String> items;
    private int position;

    public StackIterator(Stack<String> items)
    {
        this.items = items;
        position = 0;
    }

    public String next()
    {
        if (!hasNext())
        {
            position = 0;   // Reset position pointer to top of stack.
            return null;
        }
        return items.get(position++);   // Return item at index position, then increment position.
    }
    public boolean hasNext()
    {
        return position < items.size();
    }
}
