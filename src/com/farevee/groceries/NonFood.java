package com.farevee.groceries;

/**
 * An item which is not a food
 * 
 * @author William Royle
 * @date 27 September 2014
 */
public class NonFood
    implements Item
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The weight of the item
   */
  Weight weight;

  /**
   * The name of the item
   */
  String name;

  /**
   * The price of the item (in cents)
   */
  int price;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Instantiate a new non-food object with the parameters passed as 
   * properties
   */
  NonFood(String name, Weight weight, int price) throws Exception
  {
    this.weight = weight;
    this.name = name;
    this.price = price;
  }

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  
  /**
   * Returns the name of the item.
   */
  public String toString()
  {
    return name;
  }

  /**
   * Returns the weight of the item.
   */
  public Weight getWeight()
  {
    return weight;
  }

  /**
   * Returns the cost of the item, in cents
   */
  public int getPrice()
  {
    return price;
  }

  /**
   * equals will return true if this is identical to other, ie if 
   * they have the same names, prices and weights
   */
  public boolean equals(NonFood other)
  {
    return (other.name.equals(this.name) && other.weight.equals(this.weight) && other.price == this.price);
  }

}
