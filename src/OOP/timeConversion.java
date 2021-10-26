package OOP;
import java.util.Scanner;
import java.util.Date;


public class timeConversion
{
    public static void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tMENU:\n\t\t=====");
        System.out.println("1.Current Time.");
        System.out.println("2.Bangladesh -> London.");
        System.out.println("3.Bangladesh -> America.");
        System.out.println("4.Bangladesh -> Canada.");
        System.out.println("5.Bangladesh -> Italy.");

        System.out.println("\n");
        System.out.println("Please enter any of the above option: ");

        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                Date date=java.util.Calendar.getInstance().getTime();
                System.out.println(date);
                break;
            case 2:
                System.out.print("Enter Hour ");
                int h1 = sc.nextInt();
                System.out.print("Enter Minutes ");
                int m1 = sc.nextInt();
                System.out.println("Time Is: "+h1+":"+ m1);

                int londonHour = h1 - 5;

                System.out.println("London time :"+ londonHour+":"+ m1);
                break;


            case 3:
                System.out.print("Enter Hour(Internation Format) ");
                int h2 = sc.nextInt();
                System.out.print("Enter Minutes ");
                int m2 = sc.nextInt();
                System.out.println("Time Is: "+h2+":"+ m2);

                int AmericaHour = h2 + 14;
                if(AmericaHour >= 24)
                {
                AmericaHour = AmericaHour-24;
                System.out.println("America time :"+ AmericaHour+":"+ m2);
                }
                else
                {
                    System.out.println("America time :"+ AmericaHour+":"+ m2);
                }
            case 4:
                System.out.print("Enter Hour");
                int h3 = sc.nextInt();
                System.out.print("Enter Minutes ");
                int m3 = sc.nextInt();
                System.out.println("Time Is: "+h3+":"+ m3);

                int CanadaHour = h3 + 14;
                if(CanadaHour >= 24)
                {
                    CanadaHour = CanadaHour-24;
                    System.out.println("America time :"+ CanadaHour+":"+ m3);
                }
                else
                {
                    System.out.println("America time :"+ CanadaHour+":"+ m3);
                }
                break;

            case 5:
                System.out.print("Enter Hour");
                int h4 = sc.nextInt();
                System.out.print("Enter Minutes ");
                int m4 = sc.nextInt();
                System.out.println("Time Is: "+h4+":"+ m4);

                int ItalyHour = h4 + 20;
                if(ItalyHour >= 24)
                {
                    ItalyHour = ItalyHour-24;
                    System.out.println("Italy time :"+ ItalyHour+":"+ m4);
                }
                else
                {
                    System.out.println("Italy time :"+ ItalyHour+":"+ m4);
                }
                break;

            default:
                System.out.println("Incorrect Choice");
                System.exit(0);
                break;
        }
        sc.close();
    }

}