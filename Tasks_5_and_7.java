package OptionalTask1;
import java.util.ArrayList;
import java.util.Scanner;
public class Tasks_5_and_7
{
    private static int n,answer1=0,answer2=0,theAmountOfDigits;
    private static ArrayList<Byte> currentDigits;
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        if (n<1)
        {
            System.exit(1);
        }
        int[] numbers=new int[n];
        int index=-1;
        for (int i=0; i<n; i++)
        {
            numbers[i]=input.nextInt();
            currentDigits=new ArrayList<>();
            dividingByDigits(Math.abs(numbers[i]));
            task5();
            if (index==-1 && task7())
            {
                index=i;
            }
        }
        System.out.println("Task 5\nКоличество чисел, содержащих только чётные цифры: "+answer1+";");
        System.out.println("количество оставшихся чисел, имееющих равное количество чётных и нечётных цифр: "+answer2+".");
        System.out.println("Task 7");
        System.out.print("Число с различными цифрами: ");
        if (index==-1)
        {
            System.out.print("отсутствует.");
        }
        else
        {
            System.out.print(""+numbers[index]+".");
        }
    }
    private static void task5()
    {
        byte theAmountOfOddDigits=0;
        for (byte digit: currentDigits)
        {
            if (digit%2==1)
            {
                theAmountOfOddDigits++;
            }
        }
        theAmountOfDigits=(byte)currentDigits.size();
        if (theAmountOfOddDigits==0)
        {
            answer1++;
        }
        else
        {
            if (theAmountOfDigits==theAmountOfOddDigits*2)
            {
                answer2++;
            }
        }
    }
    private static boolean task7()
    {
        for (int i=0; i<=theAmountOfDigits-2; i++)
        {
            byte thisDigit=currentDigits.get(i);
            for (int j=i+1; j<theAmountOfDigits; j++)
            {
                if (currentDigits.get(j)==thisDigit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    private static void dividingByDigits(int number)
    {
        if (number==0)
        {
            currentDigits.add((byte)0);
        }
        while (number>0)
        {
            currentDigits.add((byte)(number%10));
            number/=10;
        }
    }
}