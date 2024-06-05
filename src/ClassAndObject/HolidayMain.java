package ClassAndObject;
/*1) The Java class called Holiday is stated below. An object of class Holiday
represents a holiday during the year.This class has three member/instance
variables:
name: String representing the name of the holiday.
        day: int representing the day of the month of the holiday.
month: String representing the month the holiday is in.
holiday: Boolean representing the status of the holiday.(which takes true
or false value)
public class Holiday {
    private String name;
    private int day;
    private String month;
    private boolean holiday;
// your code goes here
}
a) Define getters and setters for the variables of Holiday class.
b) Write a method isHoliday() , to return whether holiday has been given or
not.
        c) Write a piece of code that creates a Holiday instance. [Take user input
with the name “Constitution day”, with the day “3”, and with the month
“Ashoj” and holiday is “true”.]
Write a main function to take input and call the setters and getters methods
of Holiday class.*/

import java.util.Scanner;

class Holiday{
    private String name;
    private int day;
    private String month;
    private boolean holiday;

    // Getters and Setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getters and Setters for month
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    // Getters and Setters for holiday
    public boolean isHoliday() {
        return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }



}




public class HolidayMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Holiday holiday = new Holiday();

        //Taking input from user
        System.out.print("Name: ");
        String name = scan.nextLine();
        holiday.setName(name);

        System.out.print("Day: ");
        int day = scan.nextInt();
        holiday.setDay(day);

        System.out.print("Month ");
        String mon = scan.nextLine();
        holiday.setName(mon);

        System.out.println("It is a holiday?(true/false)");
        boolean isHoliday = scan.nextBoolean();
        holiday.setHoliday(isHoliday);




        // Displaying holiday details
        System.out.println("\nHoliday details:");
        System.out.println("Name: " + holiday.getName());
        System.out.println("Day: " + holiday.getDay());
        System.out.println("Month: " + holiday.getMonth());
        System.out.println("Is it a holiday? " + (holiday.isHoliday() ? "Yes" : "No"));
    }
}