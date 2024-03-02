public class Burger{
    private String type;
    private double basePrice;
    private double totalPrice;
    private ExtraToppings toppings;

    public Burger(){}

    public Burger(String type, double basePrice, ExtraToppings toppings){
        this.type = type;
        this.basePrice = basePrice;
        this.toppings = toppings;
        this.totalPrice = totalPrice+ toppings.getPrice();
    }
}

class DoubleMeatBurger extends Burger{
    public DoubleMeatBurger(ExtraToppings toppings){
        super("Double Meat Burger", 14, toppings);
    }
}

class TripleBurger extends Burger{
    public TripleBurger(ExtraToppings toppings){
        super("Triple Burger", 21, toppings);
    }
}