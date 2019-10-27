package BankApplication;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Expenses {
    Payment inCafe = new Payment(1, -10.0, "Cafe", 10, 2019);
    Payment inCafe2 = new Payment(2, -30.0, "Cafe2", 9, 2019);
    Payment rentOctober = new Payment(3, -70.0, "rentOctober", 10, 2019);
    Payment rentNovember = new Payment(4, -60.0, "rentNovember", 11, 2019);
    Payment foodRewe = new Payment(5, -20.0, "foodRewe", 11, 2019);



    public void biggestPayment() {
        Map<Integer, Payment> payments = new HashMap();
        payments.put(inCafe.getId(), inCafe);
        payments.put(inCafe2.getId(), inCafe);
        payments.put(rentOctober.getId(), rentOctober);
        payments.put(rentNovember.getId(), rentNovember);
        payments.put(foodRewe.getId(), foodRewe);

        Payment biggest = null;
        for (Map.Entry<Integer, Payment> entry : payments.entrySet()) {
            if (entry.getValue().getAmount() >= 0) {
                continue;
            }
            if (biggest == null) {
                biggest = entry.getValue();
            }
            if (biggest.getAmount() > entry.getValue().getAmount()) {
                biggest = entry.getValue();
            }
        }
        System.out.println("Biggest Expense: " + biggest.printString());


    }

}
