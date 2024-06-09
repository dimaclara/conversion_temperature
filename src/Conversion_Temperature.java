
import java.util.*;

public class Conversion_Temperature {
    int temperature;
    double celsius, fahrenheit;
    final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9.0/5.0 +32.0;
    final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5.0/9.0 -32.0;
    char conversionChoice;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char conversionChoice;
        char reponse ='o';

        do{
            System.out.println("Enter your conversion mode : C/F");
        conversionChoice = sc.nextLine().charAt(0);
        System.out.println("Enter your temperature :");
         int temperature = sc.nextInt();
        sc.nextLine();

        }while(reponse == 'O');
        System.out.println(" Au revoir...");




    }


}
