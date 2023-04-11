import java.util.Scanner;

public class ConditionalStructureIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour;

        System.out.print("What time? ");
        hour = sc.nextInt();

        if( hour < 12) {
            System.out.println("Good morning!");
        }
        else if(hour < 18) {
            System.out.println("Good afternoon!");
        }
        else {
            System.out.println("Good evening!");
        }
        sc.close();
    }
}
