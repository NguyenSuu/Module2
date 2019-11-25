package Product.model;

public class Product {
    private int id;
    private String name;
    private String code;
    private float price;

    public Product(){

    }
    public Product(int id,String code,String name,float price){
        this.id=id;
        this.code=code;
        this.name=name;
        this.price=price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
