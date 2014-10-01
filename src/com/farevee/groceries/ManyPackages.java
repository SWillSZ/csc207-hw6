package com.farevee.groceries;

/**
 * A collection of identical Package objects
 * 
 * @author William Royle
 * @date 27 September 2014
 */
public class ManyPackages
    implements Item
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The type of Package
   */
  Package type;

  /**
   * The number of packages
   */
  int count;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Instantiate a new ManyPackages object with the parameters passed as 
   * properties
   */
  ManyPackages(Package type, int count) throws Exception
  {
    if (count < 0)
      {
        throw new Exception("A non-negative number of packages is expected");
      }
    this.type = type;
    this.count = count;
  }// ManyPackages Constructor

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Returns a summary of the collection of packages
   */
  public String toString()
  {
    return Integer.toString(count) + " x " + type.toString();
  }// toString

  /**
   * Returns the total of all of the packages.
   */
  public Weight getWeight()
    throws Exception
  {
    return type.weight.multiplyWeight(count);
  }// getWeight

  /**
   * Returns the total cost of ManyPackages, in cents
   */
  public int getPrice()
  {
    return type.price * count;
  }// getPrice

  /**
   * equals will return true if this and other point to the same memory
   * location. Otherwise, equals will return false;
   */
  public boolean equals(ManyPackages other)
  {
    return (other == this);
  }// equals

}// ManyPackages
