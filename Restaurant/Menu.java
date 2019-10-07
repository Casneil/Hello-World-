package Restaurant;
import java.util.Scanner;

public class Menu  implements  AvailableMenues {
    static int choice;
    static Scanner scan = new Scanner(System.in);

    void speak() {
        System.out.println("Hello welcome to  Casneil Restaurant:  " + "\n" +
                "Would you like to make an order?  please enter yes or no");
        String decision = scan.nextLine();

        System.out.println("Would you like your food to be delivered to you:  please enter  yes or no: ");
        String answer = scan.next();
        if(answer.equals("yes")){
            Delivery delivery = new Delivery();

        if (decision.equals("yes")) {
            System.out.println("Please choose from our Available selections: " + "\n" + "1.  for  Starter menu" + "\n" + "2.  for Full Dishes" + "\n" + "3.  for Desserts : ");
            choice = scan.nextInt();
        } else {
            System.out.println("Thank you good bye!");
        }
        //End of if-statement
        switch(choice){
            case 1:
                Starter starter = new Starter();
                starter.speak();
                break;
            case 2:
                FullMeals fullMeals = new FullMeals();
                fullMeals.speak();
                break;
            case 3:
                Desserts desserts = new Desserts();
                desserts.speak();

            default:
                System.out.println("");
        }
        //End of switch-statemnt


            delivery.Status();
        }

    }
}

