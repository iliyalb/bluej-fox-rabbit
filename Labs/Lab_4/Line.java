/*
 * Name: ایلیا لسانی بحری
 * Title: پاسخ نهایی کارگاه 4
 */
public class Line
{
    private Point startPoint, endPoint;
    private int startX, endX, startY, endY, y;
    private int m = ((endY - startY) / (startX - endX));
    private int b = ((startY) - (m * startX));
    
    /**
     * Constructor with parameters from Point class
     */
    public Line(Point startPoint, Point endPoint)
    {
        this.startPoint = new Point(startX,endX);
        this.endPoint = new Point(startY,endY);
    }
    
    /**
     * Changes horizontal start and end position of line
     */
    public void moveHorizontally(int move)
    {
        startPoint = new Point((startX)+move,endX);
        endPoint = new Point((startY)+move,endY);
    }
    
    /**
     * Checks point in line math expression
     */
    public void checkPoint(int u, int v)
    {
        y = ((m * u) + b)/((m * v) + b);
        if(Float.isNaN(y))
            System.out.println("Infinite Slope");
        else
            System.out.println(y);
        
    }
}
