package BankApplication;

import java.util.HashMap;
import java.util.Map;

public class Income {

    Payment salary = new Payment(6, 200.0, "salary", 11, 2019);
    Payment salary1 = new Payment(7, 600.0, "salary", 11, 2019);
    Payment salary2 = new Payment(8, 800.0, "salary", 11, 2019);

    public void totalIncome() {
        Map<Integer, Payment> payments = new HashMap();
        payments.put(salary.getId(), salary);
        payments.put(salary1.getId(), salary1);
        payments.put(salary2.getId(), salary2);

        int total = 0;
        for (Map.Entry<Integer, Payment> entry : payments.entrySet()) {
            if (entry.getValue().getAmount() >= 0) {
                total += entry.getValue().getAmount();
            }

        }
        System.out.println("Total Income: " + total);
    }

    public void highestIncome() {
        Map<Integer, Payment> payments = new HashMap();
        payments.put(salary.getId(), salary);
        payments.put(salary1.getId(), salary1);
        payments.put(salary2.getId(), salary2);

        Payment highest = null;
        for (Map.Entry<Integer, Payment> entry : payments.entrySet()) {
            if (entry.getValue().getAmount() <= 0) {
                continue;
            }
            if (highest == null) {
                highest = entry.getValue();
            }
            if (highest.getAmount() < entry.getValue().getAmount()) {
                highest = entry.getValue();
            }


        }
        System.out.println("Highest Income: " + highest.printString());


    }
}
