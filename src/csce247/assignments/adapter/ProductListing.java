package csce247.assignments.adapter;

/**
 * Represents a product listing in a store
 * 
 * @author Nghia Nguyen
 *
 */
public interface ProductListing {
  /**
   * @return - the title of the product
   */
  public String getTitle();

  /**
   * @return - the price of the product
   */
  public double getPrice();

  /**
   * @return - the description of the product
   */
  public String getDescription();
}
