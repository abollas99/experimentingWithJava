package Quiz1;
public abstract class Vegetable implements edible{
    private double price;
    private String vegi;
    Vegetable(double price, String vegi){
        this.price = price;
        this.vegi = vegi;
    }
    Vegetable(){
        this.price =9.99;
        this.vegi = "carrots";
    }
    abstract boolean isGoodForSalad();
    
    public String howToEat() {      
        return "Chew";
    }
    public String toString() {
        return "Vegetable cost: " + price;
    }
    public int compareTo(Vegetable o) {
        if (price > o.price) {
            return 1;
        } else if (price < o.price) {
            return -1;
        }
        return 0;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getVegi() {
        return vegi;
    }
    public void setVegi(String vegi) {
        this.vegi = vegi;
    }
    public void Vegetable(double d, String string) {
    }
}