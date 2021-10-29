package OOP;
import java.util.Scanner;

public class areaConversion {

    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("< 1 > Area of Circle");
        System.out.println("< 2 > Area of Triangle");
        System.out.println("< 3 > Area of Rectangle");
        System.out.println("< 4 > Area of Square");
        System.out.println("< 5 > Area of Trapezium");
        System.out.println("< 6 > Area of Rhombus");
        System.out.println("Please enter any of the above option: ");

        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Please enter radius of circle: ");
                double radius = sc.nextFloat();
                double areaCircle = (22 * radius * radius) / 7;
                System.out.println("Area of circle is: " + areaCircle);
                break;
            case 2:
                System.out.println("Please enter base of triangle: ");
                double base = sc.nextFloat();
                System.out.println("Please enter height of triangle: ");
                double height = sc.nextFloat();
                double areaTriangle = (base * height) / 2;
                System.out.println("Area of triangle is: " + areaTriangle);
                break;

            case 3:
                System.out.println("Please enter length of rectangle: ");
                int length = sc.nextInt();
                System.out.println("Please enter breadth of rectangle: ");
                int breadth = sc.nextInt();
                int areaRectangle = length * breadth;
                System.out.println("Area of rectangle is: " + areaRectangle);
                break;

            case 4:
                System.out.println("Please enter any side of Square: ");
                int a = sc.nextInt();
                int square = a * a;
                System.out.println("Area of Square is: " + square);
                break;

            case 5:
                System.out.println("Please enter base1 of trapezium: ");
                double base1 = sc.nextFloat();
                System.out.println("Please enter base2 of trapezium: ");
                double base2 = sc.nextFloat();
                System.out.println("Please enter height of trapezium: ");
                double h = sc.nextFloat();
                double areaTrapezium = ((base1 + base2) * h)/2;
                System.out.println("Area of triangle is: " + areaTrapezium);
                break;

            case 6:
                System.out.println("Please enter diagonal1: ");
                double d1 = sc.nextFloat();
                System.out.println("Please enter diagonal2: ");
                double d2 = sc.nextFloat();
                double areaRhombus = (d1 * d2) / 2;
                System.out.println("Area of Rhombus is: " + areaRhombus);
                break;


            default:
                System.out.println("Incorrect Choice");
                System.out.println("WOULD YOU LIKE TO TRY AGAIN");
                System.out.println("< 1 > YES");
                System.out.println("< 2 > NO");

                int option = sc.nextInt();

                do
                {
                    if (option == 1)
                    {
                        display();
                    }
                    else if (option == 2)
                    {
                        System.out.println("TATA");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
                    }
                } while (option > 2);
        }

        System.out.println("\nWOULD YOU LIKE TO TRY AGAIN");
        System.out.println("< 1 > YES");
        System.out.println("< 2 > NO");

        int option1 = sc.nextInt();

        do
        {
            if (option1 == 1)
            {
                display();
            }
            else if (option1 == 2)
            {
                Main.main(null);
            }
            else
            {
                System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
            }
        } while (option1 > 2);

        sc.close();
    }
}