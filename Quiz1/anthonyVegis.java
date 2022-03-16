package Quiz1;
public class anthonyVegis extends Vegetable {
    private double price;
    private String vegi;

    anthonyVegis(double price, String vegi){
        super.Vegetable(price, vegi);
    }
    anthonyVegis(){
        super.Vegetable(14.99, "celery");
    }

    @Override
    public String howToEat() {      
        return "Chew";
    }
 
 
    @Override
    boolean isGoodForSalad() {      
        return true;
    }
 
    @Override
    public String toString() {
        return "Anthony's Vegi Cost: " + getPrice() ;
    }
 
 
    @Override
    public String howToGrow() {      
        return "Using water";
    }
}
