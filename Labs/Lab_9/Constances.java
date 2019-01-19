import java.util.Scanner;

public class Constances
{
  public static enum Law 
  {
      FALSE(0),
      TRUE(1),
      DONTCARE(2);
      
      private final int code;
      
      private Law(int code)
      {
        this.code = code;
      }
      
      //Getter
      public int getLevelCode() 
      {
        return this.code;
      }
      
  };
  
  public static int x1, x2, x3;
  
  public Constances()
  {
      // Default
  }
  
  public Constances(int X1,int X2,int X3)
    {
       x1 = X1;
       x2 = X2;
       X3 = X3;
    }
}
