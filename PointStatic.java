package helloWorld;
import java.util.Scanner;

public class PointStatic {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Point3d point1 = new Point3d();
		point1.writePoint();
		Point3d point2 = new Point3d(5.1, 3.32, 6.1);
		point2.writePoint();
		System.out.println(point1.equals(point2));
		System.out.println(point1.distanceTo(point2));
		Point3d[] vertex = new Point3d[3];
		for (int i = 0; i < 3; i++) {
			vertex[i] = new Point3d();
			System.out.println("Введите x-координату " + i + " вершины");
			vertex[i].setX(in.nextDouble());
			System.out.println("Введите y-координату " + i + " вершины");
			vertex[i].setY(in.nextDouble());
			System.out.println("Введите z-координату " + i + " вершины");
			vertex[i].setZ(in.nextDouble());
		}
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j <3; j++) {
				if (vertex[i].equals(vertex[j])) {
					flag = true;
				}
			}
		}
		if (!flag) {
			System.out.println("Площадь треугольника равна " + computeArea(vertex));
		}
		else {
			System.out.println("Есть совпадающие точки");
		}
		in.close();
	}
	public static double computeArea(Point3d[] a) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " Вершина xCoord = " + a[i].getX() + " ycoord = " + a[i].getY() + " zCoord = " + a[i].getZ());
		}
		
		double perimetr  = (a[0].distanceTo(a[1]) + a[0].distanceTo(a[2]) + a[1].distanceTo(a[2]))/2.0;
		System.out.println("Полупериметр равен " + perimetr);
		System.out.println("Сторона 1 = " + a[0].distanceTo(a[1]) + " Сторона 2 = " + a[0].distanceTo(a[2]) + " Сторона 3 = " + a[1].distanceTo(a[2]));
		double square;
		square = Math.sqrt(perimetr*(perimetr - a[0].distanceTo(a[1]))*(perimetr - a[0].distanceTo(a[2]))*(perimetr - a[1].distanceTo(a[2])));
		
		return square;
	}
}
