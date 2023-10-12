import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Lower Limit: ");
        int Lower = SC.nextInt();
        System.out.println("Enter the Upper Limit: ");
        int Upper = SC.nextInt();
        int Sum = 0;

        for (int i = Lower; i <= Upper; i++)
        {
            System.out.print(i + " ");
            Sum = Sum + i;
        }
        System.out.println();
        System.out.println("Sum of Numbers in Given Range: " + Sum);
    }
}