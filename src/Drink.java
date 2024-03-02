public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(){}

    public Drink(String type, String size, double price){
        this.type = type;
        this.size = size;
        if(size.toUpperCase().charAt(0) == 'S') {
            this.price = price;
        }else if(size.toUpperCase().charAt(0) == 'M'){
            this.price = price*2;
        }else if(size.toUpperCase().charAt(0) == 'L'){
            this.price = price*3;
        }
    }
}

class IceTea extends Drink{
    public IceTea(String size, double price){
        super("IceTea", size, 3);
    }
}

class Coke extends Drink{
    public Coke(String size){
        super("Coke", size, 3);
    }
}

class Lemonade extends Drink{
    public Lemonade(String size){
        super("Lemonade", size, 6);
    }
}