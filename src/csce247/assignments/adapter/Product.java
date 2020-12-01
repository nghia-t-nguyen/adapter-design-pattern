package csce247.assignments.adapter;

/**
 * Represents a product in a store
 * 
 * @author Nghia Nguyen
 *
 */
public class Product implements ProductListing{
  private String title;
  private double price;
  private String description;
  
  /**
   * Creates a product
   * 
   * @param title - the title of the product
   * @param price - the price of the product
   * @param description - a description of the product
   */
  public Product(String title, double price, String description) {
    this.title = title;
    this.price = price;
    this.description = description;
  }
  
  @Override
  public String getTitle() {
    return title;
  }
  
  @Override
  public double getPrice() {
    return price;
  }
  
  @Override
  public String getDescription() {
    return description;
  }
}
