package Restaurant;

import java.util.Scanner;

public class Desserts extends Menu {
    static String[] meal = new String[3];
    static double[] price = new double[3];
    static int choice;
    static double total;
    static String drinks;
    static double tip;
    static double due;
    static  int chooseDrinks;
    static Scanner scan = new Scanner(System.in);

    protected Desserts() {
        this.meal[0] = "1 Vanilla Ice-Cream  -> ";
        this.meal[1] = "2 Chocolate Cake  -> ";
        this.meal[2] = "3 Teramisu ->  ";
        this.price[0] = 6.89;
        this.price[1] = 5.78;
        this.price[2] = 7.98;
    }
    //End of Constructor

    protected   void speak(){
        System.out.println("Please select an a number to an item from our menu:   ");

        for (int i = 0;  i<= meal.length -1; i++) {
            System.out.print(meal[i]);
            for(int j = 0;  j<=price.length -1; j++){
            }
            System.out.println("  Price: -->" + price[i]);
        }
        System.out.print(" ");

        //Select Choice
        choice = scan.nextInt();
        //Switch Choice
        switch(choice){
            case 1:
                total = 6.89;
                break;
            case 2:
                total = 5.78;
                break;
            case 3:
                total = 7.98;
                break;
            default:
                total = 0;
        }

        //Choose Drinks
        System.out.println("Would you like somethign to drink?  please type yes or no: ");
        drinks= scan.next();
        if(drinks.equals("yes")){
//            Call Drinks Class
            Drinks drinks = new Drinks();
            drinks.list();
            chooseDrinks = scan.nextInt();
            drinks.calculateDrinks(chooseDrinks);
        }  else {
            System.out.println("Ok you have choosen no drinks ");
        }

        //End of choosing drinks
        System.out.println("Would you like to leave a tip?  type yes or no ");
        String decision = scan.next();
        if(decision.equals("yes")) {
            System.out.println("Please enter how much: ");
            tip = scan.nextDouble();
            due = total + tip;
            System.out.println("Thank you. Your our total amout is: " + due + "\n" +" Have a nice day!!");
        }else{
            due = total;
            System.out.println("Thank you your total amount  is: " + due + "\n" +" Have a nice day!!");
        }

    }
}
