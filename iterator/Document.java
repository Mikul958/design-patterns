package iterator;

import java.util.Stack;

public class Document
{
    private String title;                       // TODO not used anywhere?
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public Document(String title)
    {
        this.title = title;
        undoStack = new Stack<String>();
        redoStack = new Stack<String>();
    }

    public String makeChange(String change)     // TODO wipe redo list if it has stuff, or just leave it?
    {
        undoStack.push(change);
        return "Making Change: " + change;
    }
    public String undoChange()
    {
        String undone = undoStack.pop();
        redoStack.push(undone);
        return "Undoing: " + undone;
    }
    public boolean canUndo()
    {
        return undoStack.size() > 0;
    }
    public String redoChange()
    {
        String redone = redoStack.pop();
        undoStack.push(redone);
        return "Redoing: " + redone;
    }
    public boolean canRedo()
    {
        return redoStack.size() > 0;
    }
    public StackIterator getUndoIterator()
    {
        return new StackIterator(undoStack);
    }
    public StackIterator getRedoIterator()
    {
        return new StackIterator(redoStack);
    }
}
