
import java.util.*;

public class Conversion_Temperature {
    int temperature;


    char conversionChoice;


    public static void main(String[] args){

        char conversionChoice;
        char reponse = 'O';

        Scanner sc = new Scanner(System.in);
        final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9.0/5.0 +32.0;
        final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5.0/9.0 -32.0;

        do{
            System.out.println("Enter your conversion mode : C/F");
        conversionChoice = sc.nextLine().charAt(0);

        System.out.println("Enter your temperature :");
         int temperature = sc.nextInt();
         sc.nextLine();
            switch (conversionChoice){

                case 'C':

                   double celsius = temperature;
                    double fahrenheit = celsius*FAHRENHEIT_TO_CELSIUS_FACTOR +32;
                    System.out.println(temperature + "correspond à" + fahrenheit + "°F");
                    System.out.println("Voulez-vous faire une autre conversion ? O/N");

                   reponse= sc.nextLine().charAt(0);
                   if (reponse == 'O' || reponse =='o');{

                }

                break;
                case 'F':
                     fahrenheit = temperature;
                     celsius = (fahrenheit-32)*FAHRENHEIT_TO_CELSIUS_FACTOR ;
                    System.out.println(temperature  + "correspond à" + celsius + "°C");
                    System.out.println("Voulez-vous faire une autre conversion ? O/N");
                   reponse= sc.nextLine().charAt(0);
                   if (reponse == 'O' || reponse =='o');{

                }
               break;
                default:
                    System.out.println("Invalide veuillez entrer votre mode de conversion C/F");
            }



        }while(reponse == 'O');
        System.out.println(" Au revoir...");




    }


}
