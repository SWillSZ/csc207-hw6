package com.farevee.groceries;

/**
 * Each object represents a weight (ie, 2 lb)
 * the amount and unit fields together form this representation
 * 
 * @author William Royle
 * @date 27 September 2014
 */
public class Weight
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The units that the weight is in (i.e ounces)
   */
  Units unit;

  /**
   * The quantity of units which defines this weight
   */
  int amount;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Creates a new weight object, consisting of quantity units in terms of 
   * weight.
   * @pre quantity > 0
   */
  Weight(Units unit, int amount) throws Exception
  {
    if (amount < 0)
      {
        throw new Exception("Weight must be positive");
      }
    this.unit = unit;
    this.amount = amount;
  }// Weight Constructor

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get the units from this weight object.
   */
  public Units getUnits()
  {
    return unit;
  } // getUnits

  /**
   * Get the quantity from this weight object.
   */
  public int getQuantity()
  {
    return amount;
  } // getUnits

  /**
   * Tells if this is the same as other
   * Will return true if both the units and amounts parameters are the same
   * for both this and other, otherwise will return false
   */
  public boolean equals(Weight other)
  {
    // If the amounts are the same, We only need to check that
    // the name of the units are identical 
    return (other.amount == amount && unit.name.equals(other.unit.name));
  }// equals

  /**
   * Returns a summary of the weight
   */
  public String toString()
  {
    //We return plural case or regular, depending on amount
    if (amount == 1)
      {
        return Integer.toString(amount) + " " + unit.name;
      }
    else
      {
        return Integer.toString(amount) + " " + unit.plural;
      }
  }// toString

  /**
   * Returns an abbreviated summary of the weight
   */
  public String toAbbrevString()
  {
    return Integer.toString(amount) + " " + unit.abbrev;
  }// toAbbrevString

  /**
   * Returns the current weight multiplied by factor
   */
  public Weight multiplyWeight(int factor)
    throws Exception
  {
    return new Weight(unit, factor * amount);
  }

}// Weight
