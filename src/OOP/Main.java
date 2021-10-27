package OOP;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) {

        System.out.println("***************************\n" +
                "*    Hello Good People    *\n" +
                "***************************\n\n");

        System.out.println("\t\t------------------------------\n" +
                "\t\t+  Welcome to our small      +\n" +
                "\t\t+  but smart project         +\n" +
                "\t\t------------------------------");


            Scanner in = new Scanner(System.in);

            System.out.println("\n\t\tWe are offering a few items :\n\t\t=============================");
            System.out.println("1.Currency conversion");
            System.out.println("2.Area conversion");
            System.out.println("3.Speed conversion");
            System.out.println("4.Temperature conversion");
            System.out.println("5. Time Conversion");
            System.out.println("6.About Us");
            System.out.println("7.Exit\n");
            System.out.println("Please enter any of the above option: ");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Currency conversion");
                    break;
                case 2:
                    System.out.println("Area conversion");
                    areaConversion.display();
                    break;
                case 3:
                    System.out.println("Speed conversion");
                    break;
                case 4:
                    System.out.println("Temperature conversion");
                    temperatureConversion.display();
                    break;
                case 5:
                    System.out.println("Time Conversoin");
                    timeConversion.display();
                    break;
                case 6:
                    System.out.println("Here you can see us: \n" +
                            "====================");
                    aboutUs.display();
                    break;
                case 7:
                    System.out.println("Thanks for using this app....Give us your feedback on....");
                    System.exit(0);
                default:
                    System.out.println("Incorrect Choice");
                    System.exit(0);
                    break;


            }
        }
}
