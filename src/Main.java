import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Esiet sveicināti programmēšanas Chat Bot. Vai Jums patīk programmēt ?: (Jā, Nē, Nezinu)");

        String user_x = scan.next();


            if (user_x.equals("Jā")){
                System.out.println("Ļoti patīkami :)");
            } else if(user_x.equals ("Nē")){
                System.out.println("Žēl dzirdēt :( Ceru, ka iepatiksies");
            } else if(user_x.equals ("Nezinu")){
                System.out.println("Pamēģini vēl, varbūt iepatiksies!");
            } else {
                System.out.println("Nesapratu ko tu saki, bet ceru, ka iepatiksies :D");
            }


    }
}