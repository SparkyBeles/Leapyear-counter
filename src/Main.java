import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter year? ");
        int year = in.nextInt();

        if (year % 4 ==0){
                System.out.println("Its a leap year");
        } else
        {
            System.out.println("Its not a leap year");
        }
    }
}