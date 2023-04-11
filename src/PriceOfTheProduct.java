import java.util.Scanner;

public class PriceOfTheProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int quantity = sc.nextInt();

        double total = 0;
        if( item == 1){
            total = quantity * 4.0;
        }else if(item == 2){
            total = quantity * 4.50;
        } else if(item == 3){
            total = quantity * 5.00;
        } else if(item == 4){
            total = quantity * 2.00;
        } else if (item == 5){
            total = quantity * 1.50;
        }
        else{
            System.out.println("NÃO CADASTRADO");
        }
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
