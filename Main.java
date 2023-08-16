// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                Circle circle = new Circle(6);
                double circlePerimeter = circle.getPerimeter();
                System.out.println("Perimeter of the circle: " + circlePerimeter);

                Rectangle rectangle = new Rectangle(8, 10);
                double rectanglePerimeter = rectangle.getPerimeter();
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

                Triangle triangle = new Triangle(3, 4, 5);
                double trianglePerimeter = triangle.getPerimeter();
                System.out.println("Perimeter of the triangle: " + trianglePerimeter);

                Square square = new Square(4);
                double squarePerimeter = square.getPerimeter();
                System.out.println("Perimeter of the square: " + squarePerimeter);

                Pentagon pentagon = new Pentagon(5);
                double pentagonPerimeter = pentagon.getPerimeter();
                System.out.println("Perimeter of the pentagon: " + pentagonPerimeter);
            }
        }
