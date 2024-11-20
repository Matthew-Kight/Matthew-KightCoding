// Matthew Kight
import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to Ship Navigator!!!");

        boolean loop = true;

        while (loop == true) {
            System.out.println("Enter the name of the ship:");
            String name = key.nextLine();

            System.out.println("Enter the launch date of the ship:");
            String launchDate = key.nextLine();

            System.out.println("Is it a Cruise ship or a Cargo ship?");
            String type = key.nextLine();

            if (type.equalsIgnoreCase("Cruise ship")) {
                System.out.println("Enter the ship's passenger capacity:");
                int capacity = key.nextInt();
                key.nextLine();

                System.out.println("How many crew members are on this ship?");
                int crewSize = key.nextInt();
                key.nextLine();

                CruiseShip cruise1 = new CruiseShip(name, launchDate, capacity, crewSize);

                System.out.println("Creating a cruise ship...\n"+"Printing the ship's details:\n"+
                cruise1.toString());
            }
            else if (type.equalsIgnoreCase("Cargo ship")) {
                System.out.println("Enter the ship's tonnage(DWT):");
                double tonnage = key.nextDouble();
                key.nextLine();

                System.out.println("Enter the ship's max speed(mph):");
                double maxSpeed = key.nextDouble();
                key.nextLine();

                CargoShip cargo1 = new CargoShip(name, launchDate, tonnage, maxSpeed);

                System.out.println("Creating a cargo ship..\n"+"Printing the ship's details:\n"+
                cargo1.toString());
            }
            else {
                System.out.println("Invalid ship type entered!");
            }

            System.out.println("Would you like to create another ship object? enter yes or no");
            String response = key.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                loop = true;
            }
            else if (response.equalsIgnoreCase("no")) {
                loop = false;
            }
        }

    }
}
