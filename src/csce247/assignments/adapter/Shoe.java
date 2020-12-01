package csce247.assignments.adapter;

/**
 * Represents a shoe in a store
 * 
 * @author Nghia Nguyen
 *
 */
public class Shoe implements ShoeListing{
  private String brand;
  private String name;
  private double cost;
  private String description;

  /**
   * Creates a shoe
   * 
   * @param brand - the brand of the shoe
   * @param name - the name of the shoe
   * @param price - the price of the shoe
   * @param description - a description of the shoe
   */
  public Shoe(String brand, String name, double price, String description) {
    this.brand = brand;
    this.name = name;
    this.cost = price;
    this.description = description;
  }

  @Override
  public String toString() {
    return "Shoe: " + this.name + "\nBy: " + this.brand + "\nDetails: " + this.description
        + "\nCost: $" + this.cost;
  }

}
