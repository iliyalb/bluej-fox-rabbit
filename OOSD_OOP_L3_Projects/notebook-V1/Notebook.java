import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            throw new IllegalArgumentException("not a valid index");
        }
        else if(noteNumber < numberOfNotes()) {
            String note = notes.get(noteNumber);
            System.out.println(note);
        }
        else {
            //throw new IndexOutOfBoundsException("not a valid note number");
            System.out.println(noteNumber + " is not a valid note number");
        }
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber >= 0 && noteNumber < numberOfNotes()) {
            notes.remove(noteNumber);
        }
        else {
            // This is not a valid note number.
            System.out.println(noteNumber + " is not a valid note number");
        }
    }
}