import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of triangles: ");
        int numTriangles = read.nextInt();

        Triangle[] triangles = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            Point[] vertices = new Point[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the x_coordinate for vertex:- " + (j + 1) + ": ");
                double x = read.nextDouble();
                System.out.print("Enter the y_coordinate for vertex:- " + (j + 1) + ": ");
                double y = read.nextDouble();
                vertices[j] = new Point(x, y);
            }
            triangles[i] = new Triangle(vertices);
        }

        for (int i = 0; i < numTriangles; i++) {
            double perimeter = triangles[i].calc_perimeter();
            System.out.println("Triangle " + (i + 1) + " is " + triangles[i].get_type());
            System.out.println("Perimeter: " + perimeter);
        }
    }
}
