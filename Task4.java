package MainTask;
public class Task4
{
    public static void main(String[] args)
    {
        long sum=0,mult=1;
        for (int i=0; i<args.length; i++)
        {
            int currentNumber=Integer.parseInt(args[i]);
            sum+=currentNumber;
            mult*=currentNumber;
        }
        System.out.print("Сумма: "+sum+";\nпроизведение: "+mult+".");
    }
}