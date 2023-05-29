package Domain;

public class Product{
    private int idProd;
    private String nameProd;
    private Double priceProd;
    private String nameProdCategory;

    public Product(int id, String name, String nameCategory, Double price){
        idProd = id;
        nameProd = name;
        nameProdCategory = nameCategory;
        priceProd = price;
    }
    public int getIdProd(){
        return idProd;
    }

    public String getName(){
        return nameProd;
    }

    public String getNameCategory(){
        return nameProdCategory;
    }

    public void setNameCategory(String nameCategory){
        nameProdCategory = nameCategory;
    }

    public Double getPrice(){
        return priceProd;
    }

    public void setPrice(Double price){
        if (price <=0){
            throw new IllegalStateException(String.format("Цена указана некорректно", null));
        }
        priceProd = price;        
    }

    public String toString(){
        return "Product{" +
        "name='" + nameProd + '\'' +
        " category='" + nameProdCategory + '\'' +
        " price='" + priceProd + '\'' +
        '}';
    }
}
