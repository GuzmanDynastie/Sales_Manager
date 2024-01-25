package model;

public class Product extends Presentation {

    private int idProduct;
    private String name;
    private String type;
    private int idPresentation;
    private double price;

    public Product() {
    }

    public Product(int idProduct, String name, String type, int idPresentation, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.type = type;
        this.idPresentation = idPresentation;
        this.price = price;
    }

    public Product(int idProduct, String name, String type, double price, String presentation, String volume) {
        super(presentation, volume);
        this.idProduct = idProduct;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdPresentation() {
        return idPresentation;
    }

    public void setIdPresentation(int idPresentation) {
        this.idPresentation = idPresentation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Object[] toArray() {
        Object[] superClassArray = super.toArrayPresentation();
        Object[] thisArray = new Object[]{idProduct, name, type, price};
        Object[] combinedArray = new Object[thisArray.length + 2];

        combinedArray[4] = superClassArray[0];
        combinedArray[5] = superClassArray[1];

        System.arraycopy(thisArray, 0, combinedArray, 0, thisArray.length);

        return combinedArray;
    }

}
