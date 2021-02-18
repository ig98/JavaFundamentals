package MainTask;
public class Task3
{
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        int[] numbers=new int[n];
        for (int i=0; i<n; i++)
        {
            numbers[i]=(int)(Math.random()*100);
            System.out.println(""+numbers[i]);
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(""+numbers[i]);
            if (i<n-1)
            {
                System.out.print(" ");
            }
        }
    }
}