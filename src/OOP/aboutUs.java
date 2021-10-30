package OOP;
import java.util.Scanner;

public class aboutUs extends Main
{
    static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t***ABOUT OUR PROJECT***\n"+
                "\t\t\t\t\t\t\t\t\t\t  [ SMART CONVERTER ]\n\n\n\n\t\t\t\t\t\t\tIN EARLIER YEARS"+
                "ALL THE CONVERSION OF DIFFERENT SUBJECT HAD TO BE DONE MANUALLY\n"+
                "\t\t\t\t\t\t\tPEOPLE HAD TO REMEMBER LOTS OF FORMULA TO CHANGE ONE UNITS TO ANOTHER.\n"+
                "\t\t\t\t\t\t\tBUT WITH OUR PROJECT, PEOPLE CAN EASILY MAKE THIS CHANGE WITH THEIR FINGERTIP\n"+
                "\t\t\t\t\t\t\tONLY, WITHOUT ANY MISTAKES & FASTER THAN EVER. IT HAS FEATURES LIKE TIME CONVERSION,\n"+
                "\t\t\t\t\t\t\tAREA CONVERSION, CURRENCY CONVERSION, TEMPERATURE CONVERSION WHICH IS SOMETHING WE ALL\n"+
                "\t\t\t\t\t\t\tNEED SOMETIME IN OUR DAY-TO-DAY LIFE. THE WHOLE PROJECT IS DEVELOPED IN JAVA PROGRAMMING\n"+
                "\t\t\t\t\t\t\tLANGUAGE. MANY FUNCTIONS, DIFFERENT VARIABLES, STRINGS & CLASS HAS BEEN USED\n"+
                "\t\t\t\t\t\t\tFOR THE DEVELOPMENT OF THIS PROJECT. THIS IS A MINI PROJECT SO IT CONTAINS LESS FEATURES\n"+
                "\t\t\t\t\t\t\tTHAN USUAL. BUT IT'S EASY TO OPERATE AND UNDERSTANDABLE BY THE USERS AND HAVE THE\n"+
                "\t\t\t\t\t\t\tOPTIONS TO ADD TONS OF FEATURES IN THE UPCOMING UPDATES\n\n\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\t*** ABOUT US***\n\n\n\n"+
                "\t\t\t\t  A GROUP OF FIVE MEMBERS WORKING TOGETHER FROM PLACES "+
                "BATCHES OF\n\t\t\t\t DEPARTMENT OF COMPUTER SCIENCE AND ENGINEERING (LEADING UNIVERSITY)\n");

        System.out.println("\n\t\t\t\t\t\t\t< 1 > MD. JAFRUL HAQUE RAFI         2012020259\n"+
                "\t\t\t\t\t\t\t< 2 > TASFIAH TAHSIN AHSAN          2012020258\n"+
                "\t\t\t\t\t\t\t< 3 > ABDULLAH AL MASRUR            2012020255\n"+
                "\t\t\t\t\t\t\t< 4 > ANISUR RAHMAN RIFAT           2012020229\n"+
                "\t\t\t\t\t\t\t< 5 > JANNATUL FERDOUS SABRIN       2012020251\n");

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t*** CONTACT INFO***\n");
        System.out.println("\t\t\t\t\t\tFOR ANY KIND OF HELP YOU CAN CONTRACT WITH US USING BELOW INFORMATION:\n\n"+
                "\t\t\t\t\t\t\tMAIL:\n\t\t\t\t\t\t\tcse_2012020259@lus.ac.bd\n" +
                "\t\t\t\t\t\t\tcse_2012020255@lus.ac.bd\n" +
                "\t\t\t\t\t\t\tcse_2012020251@lus.ac.bd\n" +
                "\t\t\t\t\t\t\tcse_2012020258@lus.ac.bd\n" +
                "\t\t\t\t\t\t\tcse_2012020229@lus.ac.bd\n\n" +
                "\t\t\t\t\t\t\tMOBILE : \n" +
                "\t\t\t\t\t\t\t01797224414"
        );

        System.out.println("\nWOULD YOU LIKE  BACK TO MAIN MENU ");
        System.out.println("< 1 > YES");
        System.out.println("< 2 > NO");

        int option = sc.nextInt();

        do
        {
            if (option == 1)
            {
                Main.main(null);
            }
            else if (option == 2)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("INVALID INPUT. PLEASE TRY AGAIN");
            }
        } while (option > 2);

        sc.close();
    }
}
