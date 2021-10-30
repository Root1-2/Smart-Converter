package OOP;
import java.util.Scanner;

public class currencyConversion extends Main
{
    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tCURRENCY CONVERSION:\n\t\t====================");
        System.out.println("< 1 >  DOLLAR -> TK ");
        System.out.println("< 2 >  EURO -> TK");
        System.out.println("< 3 >  RUPEE -> TK");
        System.out.println("< 4 >  CANADIAN DOLLAR -> TK");
        System.out.println("< 5 >  BRAZILIAN REAL -> TK");
        System.out.println("< 6 >  SAUDIAN REAL -> TK ");
        System.out.println("< 7 >  ARGENTINE PESO -> TK");
        System.out.println("< 8 >  AUSTRALIAN DOLLAR -> TK");
        System.out.println("< 9 >  QATARI RIYAL -> TK");
        System.out.println("< 10 > OMANI RIAL -> TK\n");


        System.out.println("PLEASE ENTER ANY OF THE OPTIONS ABOVE: ");

        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("ENTER DOLLAR : ");
                float x1 = sc.nextFloat();
                double y1 = (x1 * 85.61);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y1);
                break;

            case 2:
                System.out.println("ENTER EURO: ");
                float x2 = sc.nextFloat();

                double y2 = (x2 * 99.42);
                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y2);
                break;

            case 3:
                System.out.println("ENTER RUPEE: ");
                float x3 = sc.nextFloat();
                double y3 = (x3*1.14);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y3);
                break;

            case 4:
                System.out.println("ENTER CANADIAN DOLLAR: ");
                float x4 = sc.nextFloat();
                double y4 = (x4*69.3);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y4);
                break;

            case 5:
                System.out.println("BRAZILIAN REAL: ");
                float x5 = sc.nextFloat();
                double y5 = (x5*15.36);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y5);
                break;

            case 6:
                System.out.println("SAUDIAN REAL: ");
                float x6 = sc.nextFloat();
                double y6 = (x6*22.83);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y6);
                break;

            case 7:
                System.out.println("ARGENTINE PESO: ");
                float x7 = sc.nextFloat();
                double y7 = (x7*64.41);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y7);
                break;

            case 8:
                System.out.println("AUSTRALIAN DOLLAR: ");
                float x8 = sc.nextFloat();
                double y8 = (x8*64.42);
                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y8);
                break;

            case 9:
                System.out.println("QATARI RIYAL: ");
                float x9 = sc.nextFloat();
                double y9 = (x9*23.52);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y9);
                break;

            case 10:
                System.out.println("OMANI RIAL: ");
                float x10 = sc.nextFloat();
                double y10 = (x10*222.444);

                System.out.printf("YOUR CURRENCY IN TAKA IS: %.2f ৳\n", y10);
                break;

            default:
                System.out.println("INCORRECT CHOICE");
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
                        Main.main(null);
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

    }
}
