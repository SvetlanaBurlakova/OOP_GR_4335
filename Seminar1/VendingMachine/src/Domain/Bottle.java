package Domain;
/**
 * Create product in VM
 * @param id
 * @param name
 * @param nameCategory
 * @param price
 * @param volume
 */
public class Bottle extends Product{
    private double volumeBottle;
    public Bottle(int id, String name, String nameCategory, Double price, double volume){
        super(id, name, nameCategory,price);
        volumeBottle = volume;
    }

    public double getVolumeBottle() {
        return volumeBottle;
    }
    public void setVolumeBottle(double volumeBottle) {
        this.volumeBottle = volumeBottle;
    }
    public String toString(){
        return "Product{" +
        "name='" + super.getName() + '\'' +
        " category='" + super.getNameCategory() + '\'' +
        " price='" + super.getPrice() + '\'' +
        " volume='" + volumeBottle + '\'' +
        '}';
    }
}
