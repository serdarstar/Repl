package Assginment_3;

public class Magic_Date_01 {
    /*
Question 1:

The date June 10, 1960, is special because when we write it in the following format, the month times the day equals the year:  6/10/60
Write a Java Program that let user to declare a month (in numeric form), a day, and a two digit year.
The program should then determine whether the month times the day is equal to they year.
If so, it should display a message saying the date is magic. Otherwise, it should display a message saying the date is not magic.
     */
    public static void main(String[] args) {

        int month=10;int day=6;int year=60;
        if((month*day)==year) {System.out.println("Date is magic");}else {System.out.println("Date is not magic");}


    }
}
