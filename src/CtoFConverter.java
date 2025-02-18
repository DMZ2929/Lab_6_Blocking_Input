import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                double celsius = 0;
                boolean done = false;

                do {
                    System.out.print("Enter temperature in Celsius: ");
                    if (in.hasNextDouble()) {
                        celsius = in.nextDouble();
                        in.nextLine();
                        done = true;
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done);

                double fahrenheit = (9.0 / 5) * celsius + 32;
                System.out.printf("%.2f°C is equivalent to %.2f°F.%n", celsius, fahrenheit);
            }
        }
