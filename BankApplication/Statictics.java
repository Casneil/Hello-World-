package BankApplication;

import java.util.HashMap;
import java.util.Map;

public class Statictics {

    Payment inCafe = new Payment(1, -10.0, "Cafe", 10, 2019);
    Payment inCafe2 = new Payment(2, -30.0, "Cafe2", 9, 2019);
    Payment rentOctober = new Payment(3, -70.0, "rentOctober", 10, 2019);
    Payment rentNovember = new Payment(4, -60.0, "rentNovember", 11, 2019);
    Payment foodRewe = new Payment(5, -20.0, "foodRewe", 11, 2019);
    Payment salary = new Payment(6, 200.0, "salary", 11, 2019);
    Payment salary1 = new Payment(7, 600.0, "salary", 11, 2019);
    Payment salary2 = new Payment(8, 800.0, "salary", 11, 2019);


    public void stats() {

        Map<Integer, Payment> payments = new HashMap();
        payments.put(inCafe.getId(), inCafe);
        payments.put(inCafe2.getId(), inCafe);
        payments.put(rentOctober.getId(), rentOctober);
        payments.put(rentNovember.getId(), rentNovember);
        payments.put(foodRewe.getId(), foodRewe);
        payments.put(salary.getId(), salary);
        payments.put(salary1.getId(), salary1);
        payments.put(salary2.getId(), salary2);

//        Map<String, Double> inCategories = new HashMap<>();
//        for(Map.Entry<Integer, Payment> entry: payments.entrySet()){
//            Payment payment = entry.getValue();
//
//            String category = payment.getCategory();
//
//            double sum = inCategories.getOrDefault(category, 0d);
//            sum += payment.getAmount();
//            inCategories.put(category, sum);
//        }
//        System.out.println("Category: " + inCategories);

        // Year
        Map<Integer, Integer> paymentsPerYear = new HashMap<>();
        for (Map.Entry<Integer, Payment> entry : payments.entrySet()){
            Payment payment = entry.getValue();
            Integer year = payment.getYear();
            Integer month = payment.getMonth();

            int  _getYear = paymentsPerYear.getOrDefault(year, 0);

            if(entry.getValue().getAmount() >= 0){
            }
            int _getMonth = paymentsPerYear.getOrDefault(month, 0);

        }



    }



}

//    int total = 0;
//        for (Map.Entry<Integer, Payment> entry : payments.entrySet()) {
//        if (entry.getValue().getAmount() >= 0) {
//        total += entry.getValue().getAmount();
//        }
