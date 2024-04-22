package public_pack;
import java.util.Objects;
import java.util.Scanner;
import private_pack.*;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("WELCOME TO STOCK MANAGEMENT SYSTEM");
        System.out.println("==================================================");

        System.out.println("                                                  ");
        System.out.println("LOGIN:");

        main_menu m1=new main_menu();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (Objects.equals(str, "Twinkle.N.Bhimani"))
        {
            System.out.println("You Have Successfully Entered");
            m1.dashboard();
        }
        else { System.out.println("Wrong Password"); }
    }
}
class main_menu
{
    void dashboard() {
        while (true)    {
            System.out.println("============================");
            System.out.println("DASH-BOARD");
            System.out.println("============================");
            System.out.println("1.ADD");
            System.out.println("2.REMOVE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("============================");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            Dashboard d = new Dashboard();
            switch (ch) {
                case 1:
                    d.ADD();
                    break;
                case 2:
                    d.REMOVE();
                    break;
                case 3:
                    d.DISPLAY();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
