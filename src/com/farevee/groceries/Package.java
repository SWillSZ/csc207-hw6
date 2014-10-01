package com.farevee.groceries;

/**
 * A single parcel of a food item
 * 
 * @author William Royle
 * @date 27 September 2014
 */
public class Package
    implements Item
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The weight of the package
   */
  Weight weight;

  /**
   * The name of the package
   */
  String name;

  /**
   * The price of the package (in cents)
   */
  int price;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Instantiate a new package object with the parameters passed as 
   * properties
   */
  Package(String name, Weight weight, int price)
  {
    this.weight = weight;
    this.name = name;
    this.price = price;
  }// Package Constructor

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Returns a summary of the package
   */
  public String toString()
  {
    return weight.toAbbrevString() + " package of " + name;
  }// toString

  /**
   * Returns the weight of the package.
   */
  public Weight getWeight()
  {
    return weight;
  }// getWeight

  /**
   * Returns the cost of the package, in cents
   */
  public int getPrice()
  {
    return price;
  }// getPrice

  /**
   * equals will return true if this is identical to other, ie if 
   * they have the same names, prices and weights
   */
  public boolean equals(Package other)
  {
    return (other.name.equals(this.name) && other.weight.equals(this.weight) && other.price == this.price);
  }// equals

}// Package
