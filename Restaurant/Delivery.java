package Restaurant;
import  java.util.Scanner;

public class Delivery{
    Scanner scan = new Scanner(System.in);
    String name;
    String address;
    String number;


            Delivery(){
                System.out.println("Please enter your name");
                this.name = scan.nextLine();
                System.out.println("Please enter your address");
                this.address = scan.nextLine();
                System.out.println("Please enter your number");
                this.number = scan.nextLine();
            }

            void Status (){
                System.out.println("Thanks :  " + this.name  + " for your order.  " + "\n" +
                        "  is on its way to: "+  this.address +  " .We will contact you  at this number : " + this.number +  "\n"
                         + "\n" + "Guten Appitite!!");
            }

        }
