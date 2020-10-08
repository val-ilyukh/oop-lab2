package helloWorld;

/*
* двумерный класс точки.
*/
public class Point2d {

	 /* X coordinate of the point */
	 private double xCoord;

	 /* Y coordinate of the point */
	 private double yCoord;
	 /* Constructor to initialize point to (x, y) value. */
	 public Point2d(double x, double y) {
		 this.xCoord = x;
		 this.yCoord = y;
	 }
	 /* No-argument constructor: defaults to a point at the origin. */
	 public Point2d() {
	 // Call two-argument constructor and specify the origin.
		 this(0, 0);
		 System.out.println("Point2d default initiializing");
	 }
	 /* Return the X coordinate of the point. */
	 public double getX() {
		 return this.xCoord;
	 }
	 /* Return the Y coordinate of the point. */
	 public double getY() {
		 return this.yCoord;
	 }
	 /* Set the X coordinate of the point. */
	 public void setX(double val) {
		 this.xCoord = val;
	 }
	 /* Set the Y coordinate of the point. */
	 public void setY(double val) {
		 this.yCoord = val;
	 }
}
