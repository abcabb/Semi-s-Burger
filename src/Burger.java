public class Burger{
    private String type;
    private double basePrice;

    public Burger(){}

    public Burger(String type, double basePrice){
        this.type = type;
        this.basePrice = basePrice;
    }
}

class DeluxeBurger extends Burger{
    public DeluxeBurger(){
        super("Deluxe Burger", 38);
    }
}