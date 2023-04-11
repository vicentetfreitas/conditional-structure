import java.util.Locale;
import java.util.Scanner;

public class CumulativeAssignmentOperators {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();
        double count = 50.0;

        if( minutes > 100){
        // count = count + ( minutes - 100 ) * 2.0
        count += ( minutes - 100 ) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", count);
        sc.close();
    }
}
