import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int Year = SC.nextInt();

        if (Year % 400 == 0)
        {
            System.out.println(Year + " is a Leap Year.");
        }
        else if ((Year % 4 == 0) && (Year % 100 != 0))
        {
            System.out.println(Year + " is a Leap Year.");
        }
        else
        {
            System.out.println(Year + " is not a Leap Year.");
        }

        if ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0)))
        {
            System.out.println(Year + " is a Leap Year.");
        }
        else
        {
            System.out.println(Year + " is not a Leap Year.");
        }
    }
}