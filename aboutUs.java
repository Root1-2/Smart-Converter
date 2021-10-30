package OOP;
import java.util.Scanner;

public class aboutUs extends Main
{
    static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("We all are students of Leading University, Dept. of science and engineering.\n" +
                   "We are very proud to have AR Rifat as the team leader, other staffs are: Abdullah,Rafi," +
                "Sabrin,Tasfiah.\nRemember we all are at the beginner stage. If you like our team work give" +
                " a thumbs up, opps... no way for that. Just kidding.....\n" +
                "Contract details: \n" +
                "E-mail: cse_2012020229@lus.ac.bd,\n" +
                "Mobile: 0101010101");

        System.out.println("\t\t\t\t\t\t\t\t\t** ABOUT US**\n\n\n\n"+
                "\t\tA GROUP OF FIVE MEMBERS WORKING TOGETHER FROM DIFFERENT"+
                "BATCHES OF DEPARTMENT OF COMPUTER SCIENCE AND ENGINEERING (LEADING UNIVERSITY)\n");

        System.out.println("\n\n\n\t\t\t\t\t\t\t< 1 > MD. JAFRUL HAQUE RAFI         2012020259\n"+
                "\t\t\t\t\t\t\t< 2 > TASFIAH TAHSIN AHSAN          2012020258\n"+
                "\t\t\t\t\t\t\t< 3 > ABDULLAH AL MASRUR            2012020255\n"+
                "\t\t\t\t\t\t\t< 4 > ANISUR RAHMAN RIFAT           2012020229\n"+
                "\t\t\t\t\t\t\t< 5 > JANNATUL FERDOUS SABRIN       2012020251");

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
