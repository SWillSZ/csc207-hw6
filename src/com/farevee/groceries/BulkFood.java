package com.farevee.groceries;

/**
 * Information and inventory on a type of food kept by store
 * 
 * @author William Royle
 * @date 28 September 2014
 */
public class BulkFood
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The name of the bulk food
   */
  String name;

  /**
   * The units which are used to inventory the bulk food
   */
  Units unit;

  /**
   * Cost per unit
   */
  int pricePerUnit;

  /**
   * Units of supply
   */
  int supply;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Instantiate a new BulkFood object with the specified parameters
   */
  BulkFood(String name, Units unit, int pricePerUnit, int supply)
  {
    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;
  }// BulkFood Constructor

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  
  
  /**
   * Returns the price per unit
   */
  public int getPricePerUnit()
  {
    return pricePerUnit;
  }// getPricePerUnit
  
  /**
   * Returns the name of the food
   */
  public String toString()
  {
    return name;
  }// toString
  
  /**
   * Returns the units used
   */
  public Units getUnits()
  {
    return unit;
  }// getUnits
  


}// Package
