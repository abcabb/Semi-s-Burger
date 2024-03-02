public class ExtraToppings {
    private String type;
    private double price;

    public ExtraToppings(){}

    public ExtraToppings(String type, double price){
        this.type = type;
        this.price = price;
    }
}

class BBQSauce extends ExtraToppings{
    public BBQSauce(){
        super("BBQ Sauce", 0.80);
    }
}

class CuredBeef extends ExtraToppings{
    public CuredBeef(){
        super("Cured Beef", 3);
    }
}

class Cheddar extends ExtraToppings{
    public Cheddar(){
        super("Cheddar", 1.5);
    }
}