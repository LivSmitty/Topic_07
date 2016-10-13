/**
 * Created by scott_000 on 10/13/2016.
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by scott_000 on 10/7/2016.
 */
public class PrintCalendar {

    public static void checkInput(int month, int year){
        //Check for correct input: month.
        if (month < 1 || month > 12){
            System.out.println("Enter correct integer for month (1-12)");
            System.exit(1);
        }

        //Check for correct input: year.
        String checkYear = Integer.toString(year);

        if (checkYear.length() != 4) {
            System.out.println("Enter correct format for year (####).");
            System.exit(1);
        }

    }

    public static void main(String[] args) {
        //gather year and month from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit for the month (1-12): ");
        int month = input.nextInt();
        System.out.println("Enter a year (ex. 2012): ");
        int year = input.nextInt();

        checkInput(month, year);

        //create calender object
        Calendar calendar1 = new GregorianCalendar();

        //recognize that gregorian calculator starts at 0;
        month = month - 1;

        //set calender
        calendar1.set(Calendar.MONTH, month);
        calendar1.set(Calendar.YEAR, year);


        //get month and print calender heading
        String monthName = " ";
        if (month == 0)
            monthName = "January";
        if (month == 1)
            monthName = "February";
        if (month == 2)
            monthName = "March";
        if (month == 3)
            monthName = "April";
        if (month == 4)
            monthName = "May";
        if (month == 5)
            monthName = "June";
        if (month == 6)
            monthName = "July";
        if (month == 7)
            monthName = "August";
        if (month == 8)
            monthName = "September";
        if (month == 9)
            monthName = "October";
        if (month == 10)
            monthName = "November";
        if (month == 11)
            monthName = "December";

        System.out.println("         " + monthName);
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        final int START_DAY_FOR_JAN_1_1800 = 3;
        int daysInMonth = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = (daysInMonth + START_DAY_FOR_JAN_1_1800) % 7;

        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= daysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();

        }

        System.out.println();

    }
}
