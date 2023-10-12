import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Number = SC.nextInt();
        int Sum = 0;

        //for (int i = 1; i <= Number; i++)
        for (int i = Number; i > 0; i--)
        {
            System.out.print(i + " ");
            Sum = Sum + i;
        }
        System.out.println();
        System.out.print("Sum of N Natural Number is: " + Sum);

        Number = (Number * (Number + 1) / 2);
        System.out.println();
        System.out.println("Sum of N Natural Number is: " + Number);
    }
}