package iterator;

import java.util.Stack;

/**
 * A class representing an editable document that contains an undo stack and redo stack.
 */
public class Document
{
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Creates a document with the specified title, as well as a new undo stack and redo stack.
     * @param title The title of the document.
     */
    public Document(String title)
    {
        this.title = title;
        undoStack = new Stack<String>();
        redoStack = new Stack<String>();
    }

    /**
     * Adds the specified change to the document's undo stack.
     * @param change The change to be made.
     * @return A string confirming that the change is being made.
     */
    public String makeChange(String change)
    {
        undoStack.push(change);
        return "Making Change: " + change;
    }
    /**
     * Pops the topmost change off of the undo stack and adds it to the redo stack.
     * @return A string confirming that the change is being undone.
     */
    public String undoChange()
    {
        String undone = undoStack.pop();
        redoStack.push(undone);
        return "Undoing: " + undone;
    }
    /**
     * Checks to see if there are any changes to undo.
     * @return Whether or not the undo stack has anything in it.
     */
    public boolean canUndo()
    {
        return undoStack.size() > 0;
    }
    /**
     * Pops the topmost change off of the redo stack and adds it to the undo stack.
     * @return A string confirming that the change is being redone.
     */
    public String redoChange()
    {
        String redone = redoStack.pop();
        undoStack.push(redone);
        return "Redoing: " + redone;
    }
    /**
     * Checks to see if there are any changes to redo.
     * @return Whether or not the redo stack has anything in it.
     */
    public boolean canRedo()
    {
        return redoStack.size() > 0;
    }
    /**
     * Creates a new StackIterator to iterate over the undo stack.
     * @return The created iterator for the undo stack.
     */
    public StackIterator getUndoIterator()
    {
        return new StackIterator(undoStack);
    }
    /**
     * Creates a new StackIterator to iterate over the redo stack.
     * @return The created iterator for the redo stack.
     */
    public StackIterator getRedoIterator()
    {
        return new StackIterator(redoStack);
    }
}
