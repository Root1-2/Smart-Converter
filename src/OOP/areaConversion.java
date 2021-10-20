package OOP;
import java.util.Scanner;

public class areaConversion {

    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("1.Area of Circle");
        System.out.println("2.Area of Triangle");
        System.out.println("3.Area of Rectangle\n");
        System.out.println("Please enter any of the above option: ");

        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                System.out.println("Please enter radius of circle: ");
                double radius = sc.nextFloat();
                double areaCircle = (22 * radius * radius) / 7;
                System.out.println("Area of circle is: " + areaCircle);
                break;
            case 2:
                System.out.println("Please enter base and height of triangle: ");
                double base = sc.nextFloat();
                double height = sc.nextFloat();
                double areaTriangle = (base * height) / 2;
                System.out.println("Area of triangle is: " + areaTriangle);
                break;
            case 3:
                System.out.println("Please enter length and breadth of rectangle: ");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                int areaRectangle = length * breadth;
                System.out.println("Area of rectangle is: " + areaRectangle);
                break;
            default:
                System.out.println("Incorrect Choice");
                System.exit(0);
                break;
        }
        sc.close();
    }
}


