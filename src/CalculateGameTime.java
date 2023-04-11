import java.util.Scanner;

public class CalculateGameTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hourStart, hourFinal, duration;

        hourStart = sc.nextInt();
        hourFinal = sc.nextInt();

        if(hourStart < hourFinal){
            duration =  hourFinal -  hourStart ;
        }else {
            duration = 24 - hourStart + hourFinal;
        }
        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

        sc.close();
    }
}
