package MainTask;
import java.util.Scanner;
enum Months {January,February,March,April,May,June,July,August,September,October,November,December}
public class Task5
{
    public static void main(String[] args)
    {
        Scanner number=new Scanner(System.in);
        int n=number.nextInt();
        if (n<1 || n>12)
        {
            System.out.print("Введенное число некорректно. Требуется номер месяца.");
            System.exit(0);
        }
        System.out.print(Months.values()[n-1]);
    }
}