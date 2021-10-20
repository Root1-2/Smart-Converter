package OOP;
import java.util.Scanner;

public class temperatureConversion {

        public static void display () {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("3.Celsius to Kelvin");
        System.out.println("4.Kelvin to Celsius");
        System.out.println("5.Fahrenheit to Kelvin");
        System.out.println("6.Kelvin to Fahrenheit\n");

        System.out.println("Please enter any of the above option: ");

        int ch = in.nextInt();
        double ft = 0.0, ct = 0.0, kt = 0.0;

        switch (ch) {
            case 1:
                System.out.print("Enter Temperature in Celsius: ");
                ct = in.nextDouble();
                ft = 9.0 / 5.0 * ct + 32;
                System.out.println("Temperature in Fahrenheit: " + ft);
            case 2:
                System.out.print("Enter Temperature in Fahrenheit: ");
                ft = in.nextDouble();
                ct = (ft - 32) * 5 / 9.0;
                System.out.println("Temperature in Celsius: " + ct);
                break;
            case 3:
                System.out.print("Enter Temperature in Celsius : ");
                ct = in.nextDouble();
                kt = ct + 273.15;
                System.out.println("Temperature in Kelvin : " + kt);
                break;
            case 4:
                System.out.print("Enter Temperature in Kelvin : ");
                kt = in.nextDouble();
                ct = kt - 273.15;
                System.out.println("Temperature in Celsius : " + ct);
                break;
            case 5:
                System.out.print("Enter Temperature in Fahrenheit : ");
                ft = in.nextDouble();
                kt = ((ft-32)/1.8) + 273.15;
                System.out.println("Temperature in Kelvin : " + kt);
                break;
            case 6:
                System.out.print("Enter Temperature in Kelvin : ");
                kt = in.nextDouble();
                ft = (kt - 273.15) * 9/5 + 32;
                System.out.println("Temperature in Fahrenheit : " + ft);
                break;

            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }
}



