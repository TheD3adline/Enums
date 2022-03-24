package com.company;

public class Main {

    public static void main(String[] args) {

        Weekday weekday;
        weekday = Weekday.FRIDAY;

        switch(weekday) {
            case MONDAY: System.out.println("Heute ist Montag."); break;
            case TUESDAY: System.out.println("Heute ist Dienstag."); break;
            case WEDNESDAY: System.out.println("Heute ist Mittwoch."); break;
            case THURSDAY: System.out.println("Heute ist Donnerstag."); break;
            case FRIDAY: System.out.println("Heute ist Freitag."); break;
            case SATURDAY: System.out.println("Heute ist Samstag."); break;
            case SUNDAY: System.out.println("Heute ist Sonntag."); break;
            default: System.out.println("UNKNOWN ERROR");
        }
    }

    //Enums are a special sort of class that allows using a human readable term like MONDAY or FRIDAY in the same context as an integer for program flow control, reduces error proneness
}
