package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;
import java.util.Comparator;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;  
  // You need to add code here
  
  public boolean add( Product pr ) {
	  if (super.add(pr)) { //check if product exists
		  basketSort(); //calls basketSort function to sort any repeat products
		  for(int i = 0; i< this.size(); i++) { //loop through any and all repeating products in array
			  if(this.get(i).getQuantity() == 0) { //check if quantity == 0
				  this.remove(i); //remove item i if quantity == 0 
			  }
		  }
		  return true;
	  }
	  return false;
  }
  
  
  private void basketSort() {
	// TODO Auto-generated method stub
	Collections.sort(this, new Comparator<Product>(){
		@Override
		public int compare(Product p1, Product p2) {
            double repeat = p1.getPrice();
            double p = p2.getPrice();            
            if(repeat == p)
            {
                p2.setQuantity(p2.getQuantity() + 1);
                p1.setQuantity(0);
                return 0;
            }            
            if(repeat<p) {
            	return 1;
            }else {
            	return -1;
            }
        }
    });	
  } 
  
}
