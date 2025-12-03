/*public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}*/

import java.util.Scanner;

public class DateFormat {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = input.nextLine();

        System.out.print("Enter month: ");
        String month = input.nextLine();

        System.out.print("Enter date: ");
        int date = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.println("\nAmerikan Formatı:");
        printAmerican(day, date, month, year);

        System.out.println("Avrupa Formatı:");
        printEuropean(day, date, month, year);

        input.close();
    }
}

