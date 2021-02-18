package OptionalTask2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Task1
{
    public static void main(String[] args)
    {
        BufferedReader число=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            Random item=new Random();
            int n=Integer.parseInt(число.readLine()); if (n<1) System.exit(1);
            int a[][]=new int[n][n];
            int M=Integer.parseInt(число.readLine()); if (M<=0) System.exit(1);
            for (int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    double x=(long)(2*M)*item.nextDouble()-M;
                    if (x<0)
                    {
                        x-=1;
                    }
                    a[i][j]=(int)(x);
                    out.print(a[i][j]+" ");
                }
                out.println();
            }
            out.println("Заданная матрица");
            int k=Integer.parseInt(число.readLine()); if (k<0 || k>=n) System.exit(1);
            for (int i=0; i<n-1; i++)
            {
                for(int j=n-1; j>i; j--)
                {
                    if (a[j][k]<a[j-1][k])
                    {
                        int[] буфер=a[j].clone(); 
                        a[j]=a[j-1].clone();
                        a[j-1]=буфер.clone();
                    }
                }
            }
            out.println("Преобразованная матрица");
            for (int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    out.print(a[i][j]+" ");
                }
                out.println();
            }   
        }
        catch (IOException ex)
        {
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE,null,ex);
        }        
    }
}