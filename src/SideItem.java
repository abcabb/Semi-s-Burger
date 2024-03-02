public class SideItem {
    private String type;
    private double price;

    public SideItem(){}

    public SideItem(String type, double price){
        this.type = type;
        this.price = price;
    }
}

class OnionRings extends SideItem{
    public OnionRings(){
        super("Onion Rings", 4);
    }
}

class HotChicks extends SideItem{
    public HotChicks(){
        super("Hot Chicks", 3.8);
    }
}

class ChickenNuggets extends SideItem{
    public ChickenNuggets(){
        super("Chicken Nuggets", 3.5);
    }
}