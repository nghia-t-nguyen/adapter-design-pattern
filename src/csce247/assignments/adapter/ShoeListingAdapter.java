package csce247.assignments.adapter;

/**
 * Adapts a shoe to be a product
 * @author Nghia Nguyen
 *
 */
public class ShoeListingAdapter implements ProductListing {
  private ShoeListing shoe;
  private String title;
  private String brand;
  private double price;
  private String description;
  
  /**
   * Creates a ShoeListingAdapter
   * 
   * @param shoe - the shoe that is being adapted
   */
  public ShoeListingAdapter(ShoeListing shoe) {
    this.shoe = shoe;
    
    String info = shoe.toString();
    int start = info.indexOf("Shoe: ") + 6;
    int end = info.indexOf("\n", start);
    this.title = info.substring(start, end);
    
    int startBrand = info.indexOf("By: ") + 4;
    int endBrand = info.indexOf("\n", startBrand);
    String b = info.substring(startBrand, endBrand);
    int startDes = info.indexOf("Details: ") + 9;
    int endDes = info.indexOf("\n", startDes);
    String d = info.substring(startDes, endDes);
    this.description = "Created by " + b + ", " + d;
    
    int startPrice = info.indexOf("Cost: $") + 7;
    String priceString = info.substring(startPrice);
    this.price = Double.parseDouble(priceString);
  }
  
  @Override
  public String getTitle() {
    return this.title;
  }
  
  @Override
  public double getPrice() {
    return this.price;
  }
  
  @Override
  public String getDescription() {
    return this.description;
  }
}