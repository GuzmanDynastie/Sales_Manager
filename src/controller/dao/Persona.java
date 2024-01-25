package controller.dao;

import model.Product;

public interface Persona {
    
    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
    public Product[] readProdructs();
    public Product[] readEliminatedProdructs();
    public Object[][] readProdructsArray();
    public Object[][] readEliminatedProdructsArray();
    
}
