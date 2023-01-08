package clients.cashier;

import java.util.Observable;

import catalogue.Basket;
import catalogue.BetterBasket;
import catalogue.Product;
import debug.DEBUG;
import middle.*;

/**
 * Implements the Model of the better cashier client
 * Extends from CashierModel, inherits the attributes and methods from pre-existing class
 * @author Connor Stewart
 */

public class BetterCashierModel extends CashierModel{
	
	/**
	   * Construct the model of the Better Cashier
	   * @param mf The factory to create the connection objects
	*/
	public BetterCashierModel(MiddleFactory mf) {
		super(mf);
	}
	
	/**
	   * Override existing makeBasket
	   * return an instance of a new BetterBasket
	   * @return an instance of a new BetterBasket
	   */
	@Override 
	protected Basket makeBasket()
	  {
	    return new BetterBasket();
	  }	
}