package Programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {
    public static String getDay(int year, int month, int date) {
        Calendar calender=Calendar.getInstance();
        calender.set(year,month-1,date);
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        return sdf.format(calender.getTime()).toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        System.out.println("Enter a month: ");
        int month=sc.nextInt();
        System.out.printf("Enter a date: ");
        int date=sc.nextInt();
        String dayOfWeek = getDay(year, month, date);
        System.out.println(dayOfWeek);
        sc.close();
    }
}
