import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                double width = 0, height = 0;
                boolean done1 = false, done2 = false;

                do {
                    System.out.print("Enter the width of the rectangle: ");
                    if (in.hasNextDouble()) {
                        width = in.nextDouble();
                        in.nextLine();
                        done1 = true;
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done1);

                do {
                    System.out.print("Enter the height of the rectangle: ");
                    if (in.hasNextDouble()) {
                        height = in.nextDouble();
                        in.nextLine();
                        done2 = true;
                    } else {
                        String trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                } while (!done2);

                double area = width * height;
                double perimeter = 2 * (width + height);
                double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

                System.out.printf("Area: %.2f%n", area);
                System.out.printf("Perimeter: %.2f%n", perimeter);
                System.out.printf("Diagonal: %.2f%n", diagonal);
            }
        }
