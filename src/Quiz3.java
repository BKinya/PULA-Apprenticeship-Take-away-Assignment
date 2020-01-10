/**
 * A cylinder has the following properties:
 *      Radius
 *      Height
 *      Open or Closed
 * Model a class with methods that can calculate the following accurately:
 *       Surface area of a cylinder
 *       Volume of a cylinder
 */
public class Quiz3 {
    static final double PIE = 3.142;

    /**
     * @param radius
     * @param height
     * @return surface area
     *  The formula to find surface area of a open cylinder is as follows
     *  A=2πrh+πr2
     */
    public static double areaOfCylinderOpen(double radius, double height){
        return ((2 * PIE * radius * height )+( PIE * radius * radius));
    }

    /**
     * @param radius
     * @param height
     * @return surface area
     * The formula to find surface area of a closed cylinder is as follows
     * A=2πrh+2πr2
     */
    public static double areaOfCylinderClosed(double radius, double height){
        return ((2 * PIE * radius * height )+( 2* PIE * radius * radius));
    }

    /**
     * @param radius
     * @param height
     * @return volume
     * The formula of finding volume of a cylinder is
     * V = π*r*r*h
     */
    public static double volumeOfCylinder(double radius, double height){
        return PIE * radius * radius * height;
    }
}
