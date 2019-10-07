package Restaurant;


public class Drinks  extends Menu{
    static String[] drinks = new String[10];
    static double[] price = new double[10];


      Drinks(){
        this.drinks[0]= "1 Red Stripe" ;
        this.drinks[1]= "2 Mango Juice" ;
        this.drinks[2]= "3 Caribbean Delight" ;
        this.drinks[3]= "4 Sorrel Delight" ;
        this.drinks[4]= "5 Carrot Juice" ;
        this.drinks[5]= "6 Coffee" ;
        this.drinks[6]= "7 Hot Chocolate" ;
        this.drinks[7]= "8 Pinacalada" ;
        this.drinks[8]= "9 Apple Direct" ;
        this.drinks[9]= "10 Ice Coffee" ;

        this.price[0] = 11.98;
        this.price[1] = 10.98;
        this.price[2] = 14.98;
        this.price[3] = 8.99;
        this.price[4] = 6.87;
        this.price[5] = 4.50;
        this.price[6] = 4.50;
        this.price[7] = 12.99;
        this.price[8] = 8.99;
        this.price[9] = 8.98;


    }

    protected void list(){
        for (int i = 0;  i<= drinks.length -1; i++) {
            System.out.print(drinks[i]);
            for(int j = 0;  j<=price.length -1; j++){
            }
            System.out.println("  Price: -->" + price[i]);
        }
        System.out.print(" ");
    }

    protected void calculateDrinks(int i){
          double cost;
        switch(i){
            case 1:
                cost = 11.98;
                break;
            case 2:
                cost = 10.98;
                break;
            case 3:
                cost = 14.98;
                break;
            case 4:
                cost = 8.99;
                break;
            case 5:
                cost = 6.87;
                break;
            case 6:
                cost = 4.50;
                break;
            case 7:
                cost = 4.50;
                break;
            case 8:
                cost = 12.99;
                break;
            case 9:
                cost = 8.99;
                break;
            case 10:
                cost = 8.98;
                break;
            default:
                cost = 0;
        }
    }
}
