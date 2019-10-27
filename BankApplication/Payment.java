package BankApplication;


public  class Payment {
     int id;
    private double amount;
    private String category;
    private int month;
    private int year;

    Payment(int id, double amount, String category, int month, int year){
        this.id = id;
        this.amount =amount;
        this.category = category;
        this.month = month;
        this.year = year;

    }

    public  String printString(){
        return  this.amount + " " +  this.category + " " +  this.month  + " "+this.year;
    }

    public String printFull(){
        return "id: " + this.id + " category " + this.category + " month "  + this.month + "  year " + this.year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
