package com.company;

//: JavaCourse/№11_12.08_Enum/№1(Main)
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Work with Enum, Console input. 10 tasks on the related topic.
 * @author Markiyan Dmytriv
 * @author https://github.com/markissoft
 * @author t.me//dmmytriv
 * @version 1.1
 */

public class Main {

    /**
     * Main class entry point
     * @param args Array of String arguments
     * @throws WrongInputConsoleParametersException Restricts some input options
     */

    public static void main(String[] args) throws WrongInputConsoleParametersException {

        /** Filling the variable with user data */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the month: ");

        String monthName = scanner.nextLine();

        /** Check for forbidden text */
        if (monthName.equalsIgnoreCase("Trump or Biden?"))
            throw new WrongInputConsoleParametersException(monthName);

        /** Array of Months values*/
        Months[] months = Months.values();

        /**
         * Creating a new object
         * @see SelectedMonth
         */
        SelectedMonth selectedMonth = new SelectedMonth();

        /** Using foreach to loop through 'months' */
        for (Months month : months) {
            /** Whether the data is entered correctly */
            if (monthName.equalsIgnoreCase(month.toString())) {

                /**
                 * Object initialization
                 * @see SelectedMonth#setInfo(String, String, int)
                 */
                selectedMonth.setInfo(month.toString(), month.season.toString(), month.days); // юзаєм клас як структуру даних

                System.out.println(" --- No1: ");
                System.out.println("All right!");
                break;
            }

            System.out.println("404 Not found!");
            System.exit(0);
        }

        System.out.println(" --- No2: Same time of year");

        /** Using foreach to loop through 'months' */
        for (Months month : months) {
            if (selectedMonth.season.equalsIgnoreCase(month.season.toString()))
                System.out.print(month + " ");
        }

        System.out.println();
        System.out.println(" --- No3: The same number of days");
        /** Using foreach to loop through 'months' */
        for (Months month : months) {
            if (selectedMonth.days == month.days)
                System.out.print(month + " ");
        }

        System.out.println();
        System.out.println(" --- No4: Fewer days");
        /** Using foreach to loop through 'months' */
        for (Months month : months) {
            if (selectedMonth.days > month.days)
                System.out.print(" " + month);
        }

        System.out.println();
        System.out.println(" --- No5: More days");
        /** Using foreach to loop through 'months' */
        for (Months month : months) {
            if (selectedMonth.days < month.days)
                System.out.print(" " + month);
        }

        System.out.println(" --- No6: Next season");

        switch (selectedMonth.season){
            case "WINTER":
                System.out.print("SPRING");
            case "SPRING":
                System.out.print("SUMMER");
            case "SUMMER":
                System.out.print("AUTUMN");
            case "AUTUMN":
                System.out.print("WINTER");
        }

        System.out.println();
        System.out.println(" --- No7: Previous season");

        switch (selectedMonth.season){
            case "WINTER":
                System.out.print("AUTUMN");
            case "SPRING":
                System.out.print("WINTER");
            case "SUMMER":
                System.out.print("SPRING");
            case "AUTUMN":
                System.out.print("SUMMER");
        }

        System.out.println();
        System.out.println(" --- No8: Even number");
        /** Using foreach to loop through 'months' */
        for (Months month : months) {
            if ((month.days % 2) == 0)
                System.out.print(month + " ");
        }

        System.out.println();
        System.out.println(" --- No9: Odd number");

        for (Months month : months) {
            if ((month.days % 2) != 0)
                System.out.print(month + " ");
        }

        System.out.println();
        System.out.println(" --- No10: Selected month ");

        if ((selectedMonth.days % 2) == 0)
            System.out.print("Even number");
        else
            System.out.print("Odd number");


    }
}
