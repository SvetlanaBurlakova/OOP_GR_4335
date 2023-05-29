package Domain;

public class HotDrinks extends Product{
    private int tempDrink;
    /**
     * create Hot Drink item
     * @param id
     * @param name
     * @param nameCategory
     * @param price
     * @param temp
     */
    public HotDrinks(int id, String name, String nameCategory, Double price, int temp){
        super(id, name, nameCategory,price);
        tempDrink = temp;
    }
    public int getTempDrink() {
        return tempDrink;
    }
    public void setTempDrink(int tempDrink) {
        this.tempDrink = tempDrink;
    }
    public String toString(){
        return "Product{" +
        "name='" + super.getName() + '\'' +
        " category='" + super.getNameCategory() + '\'' +
        " price='" + super.getPrice() + '\'' +
        " tempreture='" + tempDrink + '\'' +
        '}';
    }
    
}
