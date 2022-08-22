import java.util.Scanner;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Minute value: ");
        long minute= scanner.nextLong();
        scanner.nextLine();
        printYearsAndDays(minute);
    }
    public static void printYearsAndDays(long minutes)
    {
        long xx=0;
        long yy=0;
        long zz=0;
        if(minutes<0)
        {
            System.out.println("Invalid Value");

        }
        else
        {
            xx=minutes;
            yy=minutes/(365*24*60);
            zz=(minutes/(60*24))%365;
            System.out.println(xx+" min = "+yy+" y and "+zz+" d");
        }
    }
}
