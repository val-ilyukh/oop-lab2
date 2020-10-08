package helloWorld;

public class Point3d extends Point2d {
	private double zCoord;
	
	public Point3d (double x, double y, double z) {
		super(x, y);
		this.zCoord = z;
		System.out.println("Initial x=" + this.getX() + " y=" + this.getY() + " z=" + this.getZ());
	}
	public Point3d() {
		this(0, 0, 0);
		System.out.println("Point3d default initiializing");
	}

	public double getZ() {
		return zCoord;
	}

	public void setZ(double val) {
		this.zCoord = val;
	}
	public void writePoint() {
		System.out.println("super x = " + super.getX() + " super y = " + super.getY());
	}
	public boolean equals(Point3d obj) {
		if(this.getX() == obj.getX() && this.getY() == obj.getY() && this.zCoord == obj.getZ()) {
			return true;
		}
		else {
			return false;
		}
	}
	public double distanceTo(Point3d obj) {
		return Math.sqrt(Math.pow(this.getX() - obj.getX(), 2) + Math.pow(this.getY() - obj.getY(), 2) + Math.pow(this.zCoord - obj.getZ(), 2));
	}
	
}
