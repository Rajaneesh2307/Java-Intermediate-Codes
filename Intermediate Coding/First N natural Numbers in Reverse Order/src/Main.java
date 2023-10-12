import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = SC.nextInt();

        //for (int i = Num; i > 0; i--)
        //{
        //    System.out.print(i + " ");
        //}

        int i = Num;
        while (i > 0)
        {
            System.out.print(i + " ");
            i--;
        }
    }
}