package MainTask;
public class Task2
{
    public static void main(String[] args)
    {
        for (int i=args.length-1; i>=0; i--)
        {
            System.out.print(args[i]);
            if (i>0)
            {
                System.out.print(" ");
            }
        }
    }
}