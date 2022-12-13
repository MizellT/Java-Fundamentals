package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        // formula for volume of a cylinder π * radius^2 * height
        double π = 3.14;
        double radius = 3.14;
        double height = 5;
        double radius_squared = radius * radius;
        double result_volume = π * radius_squared * height;
        System.out.println("The volume is: " + result_volume);

        // formula for surface area of a cylinder is 2 * π * radius * (radius + height)
        double result_surface_area = 2 * π * radius * (radius + height);
        System.out.println("The surface area is: " + result_surface_area);


    }
}