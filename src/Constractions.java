import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Constractions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Input correct number!");
                break;
        }
        if (number == 1) {
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("February");
        } else if (number == 3) {
            System.out.println("March");
        } else if (number == 4) {
            System.out.println("April");
        } else if (number == 5) {
            System.out.println("May");
        } else if (number == 6) {
            System.out.println("June");
        } else if (number == 7) {
            System.out.println("July");
        } else if (number == 8) {
            System.out.println("August");
        } else if (number == 9) {
            System.out.println("September");
        } else if (number == 10) {
            System.out.println("October");
        } else if (number == 11) {
            System.out.println("November");
        } else if (number == 12) {
            System.out.println("December");
        } else {
            System.out.println("Input correct number!");
        }

        boolean oddNumber = ((number % 2) == 0) ? true : false;
        System.out.println(oddNumber);

        if (number > -5) {
            System.out.println("Warm");
        } else if (-5 >= number && number > -20) {
            System.out.println("Normal");
        } else if (number <= -20) {
            System.out.println("Cold");
        }


        if (number == 1) {
            System.out.println("Red");
        } else if (number == 2) {
            System.out.println("Orange");
        } else if (number == 3) {
            System.out.println("Yellow");
        } else if (number == 4) {
            System.out.println("Green");
        } else if (number == 5) {
            System.out.println("Blue");
        } else if (number == 6) {
            System.out.println("Indigo");
        } else if (number == 7) {
            System.out.println("Violet");
        }
    }
}
