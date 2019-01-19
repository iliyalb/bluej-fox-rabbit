/*
 * Name: ایلیا لسانی بحری
 * Title: پاسخ نهایی کارگاه 2
 */
public class Book
{
    // Fields
    private int x;
    private int pages;
    private String author;
    private String title;
    
    // Single argument constructor
    public Book(String author)
    {
        this.author = author;
        //title = null;
    }
    
    // Dual argument constructor
    public Book(String author, String title)
    {
        this.author = author;
        this.title = title;
    }
    
    // Triple argument constructor
    public Book(String author, String title, int pages)
    {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
    
    // Default constructor
    public Book()
    {
        x = 0;
        pages = 0;
    }
    
    // Get method: author
    public String getAuthor()
    {
        return author;
    }
    
    // Set method: author
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    // Get method: title
    public String getTitle()
    {
        return title;
    }
    
    // Set method: title
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    // Get method: pages
    public int getPages()
    {
        return pages;
    }
    
    // Set method: pages
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    
    // Prints out book's information
    public void printBookInfo()
    {
        System.out.print('\u000C'); // Clears terminal
        if(pages > 0)
        {
            System.out.printf("Title: %s, Author: %s, Pages: %d",
            title, author, pages);
        }
        else
        {
            System.out.printf("Title: %s, Author: %s", title, author);
        }
        
    }
}