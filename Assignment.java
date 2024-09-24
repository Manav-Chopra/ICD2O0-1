   // Variable Dictionary:
// - radius: the radius of the circle (in cm)
// - radiusCylinder: the radius of the cylinder (in cm)
// - heightCylinder: the height of the cylinder (in cm)
// - lengthPendulum: the length of the pendulum (in cm)
// - areaCircle: the area of the circle (in square cm)
// - surfaceAreaCylinder: the surface area of the cylinder (in square cm)
// - volumeCylinder: the volume of the cylinder (in cubic cm)
// - periodPendulum: the period of the pendulum (in seconds)

import java.lang.Math; // Import the Math library for mathematical operations
import java.util.Scanner; // Import the Scanner library for user input

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.println("Welcome to the Circle and Cylinder Area/Surface Area Calculator!"); // Welcome message
        System.out.println("This program will calculate the area of a circle, the volume and surface area of a cylinder, and the period of a pendulum."); // Print description

        System.out.println("Let's calculate the area of a circle:"); // Print a message to start calculations
        System.out.print("Enter radius of the circle (cm): "); // Ask to input the radius of the circle
        double Radius = scanner.nextDouble(); // Read the user's input for the radius
        double Area = Math.PI * Math.pow(Radius, 2); // How to calculate the area of the circle
        System.out.printf("The area of the circle with radius %.2f cm is: %.2f square cm%n", Radius, Area); // Print result with two decimal places

        System.out.println("Let's calculate the volume and surface area of a cylinder:"); // Print a message for the start of the cylinder calculations
        System.out.print("Enter radius of the cylinder (in cm): "); // Ask to input the radius of the cylinder
        double radiusCylinder = scanner.nextDouble(); // Read the input for the radius
        System.out.print("Enter height of the cylinder (in cm): "); // Ask to input the height of the cylinder
        double heightCylinder = scanner.nextDouble(); // Read the user's input for the height
        double surfaceAreaCylinder = 2 * Math.PI * radiusCylinder * (radiusCylinder + heightCylinder); // Calculate the surface area of the cylinder using the formula A = 2πr(r + h)
        double volumeCylinder = Math.PI * Math.pow(radiusCylinder, 2) * heightCylinder; // Calculate the volume of the cylinder using the formula V = πr^2h
        System.out.printf("The surface area of the cylinder with radius %.2f cm and height %.2f cm is: %.2f square cm%n", radiusCylinder, heightCylinder, surfaceAreaCylinder); // Print the surface area result with two decimal places
        System.out.printf("The volume of the cylinder with radius %.2f cm and height %.2f cm is: %.2f cubic cm%n", radiusCylinder, heightCylinder, volumeCylinder); // Print the volume result with two decimal places

        // Calculate period of pendulum
        System.out.println("\nLet's calculate the period of a pendulum:"); // Print a message to indicate the start of the pendulum calculation
        System.out.print("Enter length of the pendulum (in cm): "); // Ask the user to input the length of the pendulum
        double lengthPendulum = scanner.nextDouble(); // Read the user's input for the length
        double periodPendulum = 2 * Math.PI * Math.sqrt(lengthPendulum / 980); // Calculate the period of the pendulum using the formula T = 2π√(L/g)
        System.out.printf("The period of the pendulum with length %.2f cm is: %.2f seconds%n", lengthPendulum, periodPendulum); // Print the period result with two decimal places

        // Farewell message
        System.out.println("Thank you for using the Geometry and Physics Calculator!"); // Print a farewell message
    }
} 
