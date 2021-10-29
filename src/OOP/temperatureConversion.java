package OOP;
import java.util.Scanner;

public class temperatureConversion
{

    public static void display ()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("< 1 > Celsius to Fahrenheit");
        System.out.println("< 2 > Fahrenheit to Celsius");
        System.out.println("< 3 > Celsius to Kelvin");
        System.out.println("< 4 > Kelvin to Celsius");
        System.out.println("< 5 > Fahrenheit to Kelvin");
        System.out.println("< 6 > Kelvin to Fahrenheit\n");

        System.out.println("Please enter any of the above option: ");

        int ch = in.nextInt();
        double ft, ct, kt;

        switch (ch)
        {
            case 1:
                System.out.print("Enter Temperature in Celsius: ");
                ct = in.nextDouble();
                ft = 9.0 / 5.0 * ct + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f", ft);
                break;

            case 2:
                System.out.print("Enter Temperature in Fahrenheit: ");
                ft = in.nextDouble();
                ct = (ft - 32) * 5 / 9.0;
                System.out.printf("Temperature in Celsius: %.2f", ct);
                break;

            case 3:
                System.out.print("Enter Temperature in Celsius : ");
                ct = in.nextDouble();
                kt = ct + 273.15;
                System.out.printf("Temperature in Kelvin : %.2f", kt);
                break;

            case 4:
                System.out.print("Enter Temperature in Kelvin : ");
                kt = in.nextDouble();
                ct = kt - 273.15;
                System.out.printf("Temperature in Celsius : %.2f", ct);
                break;

            case 5:
                System.out.printf("Enter Temperature in Fahrenheit : ");
                ft = in.nextDouble();
                kt = ((ft-32)/1.8) + 273.15;
                System.out.printf("Temperature in Kelvin : $.2f", kt);
                break;

            case 6:
                System.out.printf("Enter Temperature in Kelvin : ");
                kt = in.nextDouble();
                ft = (kt - 273.15) * 9/5 + 32;
                System.out.printf("Temperature in Fahrenheit : %.2f", ft);
                break;

            default:
                System.out.println("INCORRECT CHOICE");
                System.out.println("WOULD YOU LIKE TO TRY AGAIN");
                System.out.println("< 1 > YES");
                System.out.println("< 2 > NO");

                int option = in.nextInt();

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

        int option1 = in.nextInt();

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

        in.close();
    }

}