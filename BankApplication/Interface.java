package BankApplication;

import java.util.Scanner;

public class Interface {

    public void speak() {
        // User Decision
        System.out.println("Please select an option to view: ");
        System.out.println("1 ->  My biggest payment " + "\n" + "2 ->  My total income " + "\n"
                + "3 -> My highest income" + "\n" + "4 -> How do I spend my money" + "\n" + "0 -> Exit");
        Scanner scan = new Scanner(System.in);
        Income inc = new Income();
        Expenses exp = new Expenses();
        try {
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    exp.biggestPayment();
                    break;
                case 2:
                    inc.totalIncome();
                    break;
                case 3:
                    inc.highestIncome();
                    break;
                case 4:
                    Statictics stats = new Statictics();
                    stats.stats();
                    break;
                case 0:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Please select a valid option");
                    speak();
            }

        } catch (Exception e) {
            System.out.println("Entry must be a  number");
            speak();
        }
    }


}
