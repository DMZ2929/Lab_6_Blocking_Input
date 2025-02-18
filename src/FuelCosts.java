import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                double gallons = 0, mpg = 0, pricePerGallon = 0;
                boolean done1 = false, done2 = false, done3 = false;


                do {
                    System.out.print("Enter the number of gallons of gas in the tank: ");
                    if (in.hasNextDouble()) {
                        gallons = in.nextDouble();
                        in.nextLine();
                        done1 = true;
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done1);

                do {
                    System.out.print("Enter the fuel efficiency in miles per gallon: ");
                    if (in.hasNextDouble()) {
                        mpg = in.nextDouble();
                        in.nextLine();
                        done2 = true;
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done2);

                do {
                    System.out.print("Enter the price of gas per gallon: ");
                    if (in.hasNextDouble()) {
                        pricePerGallon = in.nextDouble();
                        in.nextLine();
                        done3 = true;
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done3);

                double costToDrive100Miles = (100 / mpg) * pricePerGallon;
                double distanceWithFullTank = gallons * mpg;

                System.out.printf("Cost to drive 100 miles: $%.2f%n", costToDrive100Miles);
                System.out.printf("Distance with a full tank: %.2f miles%n", distanceWithFullTank);
            }
        }

