package com.farevee.groceries;

/**
 * Represents a quantity of a BulkFood. For example, if a tomato bulk food 
 * item was 2 dollars a pound, a bulk item could be 2 pounds of tomatoes
 * 
 * @author William Royle
 * @date 30 September 2014
 */
public class BulkItem
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The BulkFood which this object represents a quantity of
   */
  BulkFood food;

  /**
   * The units which are used to quantify our BulkItem
   */
  Units unit;

  /**
   * number of BulkFoods in this BulkItem, in terms of units. 
   */
  int amount;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Instantiate a new BulkIood object with the specified parameters
   */
  BulkItem(BulkFood food, Units unit, int amount) throws Exception
  {
    if (amount < 0)
      {
        throw new Exception("Cannot have a negative amount of a BulkItem");
      }
    if (!food.getUnits().name.equals(this.food.getUnits().name))
      {
        throw new Exception("BulkItem needs the same type of units as the BulkFood");
      }
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  }// BulkIood Constructor

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Returns the a description of the BulkItem
   */
  public String toString()
  {
    try
      {
        return (new Weight(unit, amount)).toString() + " of " + food.toString();
      }
    catch (Exception E)
      {
        return ("You cannot have a negative amount in the BulkFood object");
      }
  }// toString

  /**
   * Returns the weight of the BulkItem
   */
  public Weight getWeight()
    throws Exception
  {
    return new Weight(unit, amount);
  }// getWeight
  
  /**
   * Returns the total cost of the BulkItem (in cents)
   */
  public int getPrice()
      throws Exception
    {
      return food.getPricePerUnit()*amount;
    }// getPrice
  
  /**
   * Tells if this object is equal to other (same fields, type)
   */
  public boolean equals(Object other)
  {
    if (other instanceof BulkItem)
      {
        
      }
    return false;
  }
  

}// Package
