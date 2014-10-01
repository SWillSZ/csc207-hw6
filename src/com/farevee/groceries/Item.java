package com.farevee.groceries;

/**
 * Represents an item
 * 
 * @author William Royle
 * @date September 27, 2014
 */
public interface Item
{
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get weight of item
   */
  public Weight getWeight()
    throws Exception;

  /**
   * Get cost of item
   */
  public int getPrice();

  /**
   * Get quick summary of item
   */
  public String toString();

}// interface Item
