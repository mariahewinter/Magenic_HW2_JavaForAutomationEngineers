import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [x] Update both the set method for rectangle like you did for square
 *      [ ] Write the setters for the Rectangle Class
 *      [ ] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }

    // TODO FOR HOMEWORK: Write the setLength method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero

    public void setLength(double length) {
        if(length >= 1){
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    // TODO FOR HOMEWORK: Write the setWidth method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero
    public void setWidth(double width) {
        if(width >= 1){
            this.width = width;
        }
    }

    // TODO FOR HOMEWORK: Write the method for area
    /**
     * Calculates the area of the rectangle object
     * @return The area of the rectangle
     */
    public double area() {
        return length * width;
    }

    // TODO FOR HOMEWORK: Write the method for perimeter
    /**
     * Calculates the perimeter of the rectangle object
     * @return The perimeter of the rectangle
     */
    public double perimeter() {
        return (length + width) * 2;
    }

    // TODO FOR HOMEWORK: Write a main method
    /**
     * The main method for the Rectangle class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the rectangle length: ");
        double length = scanner.nextDouble();
        r.setLength(length);

        System.out.println("Please enter the rectangle width: ");
        double width = scanner.nextDouble();
        r.setWidth(width);

        double area = r.area();
        double perimeter = r.perimeter();

        System.out.println("A rectangle with side length of " + r.getLength() +
                           " and width of " + r.getWidth() + " has an area of: " + area);
        System.out.println("A rectangle with side length of " + r.getLength() +
                           " and width of " + r.getWidth() + " has an area of: " + area);
    }
}