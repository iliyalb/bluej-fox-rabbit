import java.util.ArrayList;

public class RuleBase
{
    public int[][] a;
    public int[][] b;
    public int[][] c;
    public int[][] d;
    public RuleBase()
    {
        a = new int[2][3];
        b = new int[3][3];
        c = new int[1][3];
        d = new int[1][3];
        
        //Pre-defined truth table
        a[0][0] = 1; a[0][1] = 0; a[0][2] = 0;
        a[1][0] = 1; a[1][1] = 1; a[1][2] = 0;
        
        b[0][0] = 0; b[0][1] = 0; b[0][2] = 0;
        b[1][0] = 0; b[1][1] = 0; b[1][2] = 1;
        b[2][0] = 0; b[2][1] = 1; b[2][2] = 1;
        
        c[0][0] = 0; c[0][1] = 1; c[0][2] = 0;
        
        d[0][0] = 1; d[0][1] = 0; d[0][2] = 1;
    }
}

