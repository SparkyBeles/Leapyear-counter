import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter year? ");
        int year_user_input = in.nextInt();


        Year year = new Year(365,366);

        boolean is_leap_year = year.is_leap_year(year_user_input);


        if (is_leap_year){
            System.out.println("det är skott år" + is_leap_year);
        } else {
            System.out.println("Inte skott år");
        }


    }
}