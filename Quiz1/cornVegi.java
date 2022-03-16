package Quiz1;
public class cornVegi extends Vegetable{

    private double price;
    private String vegi;
    
    cornVegi(double price) {
        Vegetable(price, "corn");
    }

    @Override
    boolean isGoodForSalad() {
        return true;
    }
 
    @Override
    public String toString() {
        return "Vegetable: corn, price: " + getPrice();
    }
 
    @Override
    public String howToGrow() {
        return "Using water";
    }
}
