import java.util.Arrays;

public class Rule
{
    private Constances.Law[] temp = new Constances.Law[3];
    private RuleBase rb;
    private String cond;
    
   void Condition(int x1, int x2, int x3)
   {
       new Constances(x1,x2,x3);
       temp[0] = Constances.Law.values()[x1];
       temp[1] = Constances.Law.values()[x2];
       temp[2] = Constances.Law.values()[x3];
       
       cond = Arrays.toString(temp);
       
       switch (cond)
       {
           case "[TRUE, FALSE, FALSE]":
                System.out.println("a");
                break;
           case "[TRUE, TRUE, FALSE]":
                System.out.println("a");
                break;
           case "[FALSE, FALSE, FALSE]":
                System.out.println("b");
                break;
           case "[FALSE, FALSE, TRUE]":
                System.out.println("b");
                break;
           case "[TRUE, TRUE, TRUE]":
                System.out.println("b");
                break;
           case "[FALSE, TRUE, FALSE]":
                System.out.println("c");
                break;
           case "[TRUE, FALSE, TRUE]":
                System.out.println("d");
                break;
           case "[TRUE, DONTCARE, DONTCARE]":
                System.out.println("a 0.66");
                break;
           case "[FALSE, DONTCARE, DONTCARE]":
                System.out.println("b 0.75");
                break;
           case "[DONTCARE, TRUE, DONTCARE]":
                System.out.println("a 0.50");
                break;
           case "[DONTCARE, FALSE, DONTCARE]":
                System.out.println("b 0.75");
                break;
           case "[DONTCARE, DONTCARE, TRUE]":
                System.out.println("d 0.25");
                break;
           case "[DONTCARE, DONTCARE, FALSE]":
                System.out.println("c 0.25");
                break;
           default:
                System.out.println("No such case exists");
                break;
       }
    } 
}
