import java.util.Scanner;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {

    /**
     * The base length
     */
    private double base;

    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }

    /**
     * Gets the Base Length
     * @return The Base Length
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the Base Length
     * @param base The Base Length of the triangle
     */
    public void setBase(double base) {
        if(base >= 1){
            this.base = base;
        }
    }

    /**
     * Calculates the area of the triangle object
     * @return The area of the triangle
     */
    public double area() {
        double height = Math.sqrt(3)/2 * base;

        return (base * height)/2;
    }

    /**
     * Calculates the perimeter of the triangle object
     * @return The perimeter of the triangle
     */
    public double perimeter() {
        return 3 * base;
    }

    /**
     * The main method for the EquilateralTriangle class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        EquilateralTriangle t = new EquilateralTriangle();
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();

        t.setBase(base);

        double area = t.area();
        double perimeter = t.perimeter();

        System.out.println("A triangle with a base length of " + t.getBase() + " has an area of: " + area);
        System.out.println("A square with side length of " + t.getBase() + " has a perimeter of: " + perimeter);
    }
}