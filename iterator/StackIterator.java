package iterator;

import java.util.Iterator;
import java.util.Stack;

public class StackIterator implements Iterator<String>
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
            return null;
        return items.get(position++);   // Return item at index position, then increment position.
    }
    public boolean hasNext()
    {
        return position < items.size();
    }
}
