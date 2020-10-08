//Name: Arya Tawde
//ASU ID: 1217536502
//Assignment02 CSE360

package cse360assignment02;

//This is a simple class which adds and subtracts.
public class AddingMachine {
  private int total;
  private String transactions;
  
/**
 * Constructor for the class
*/
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    transactions = "0";
  }
  
/**
 * Public method, returns stored total value
 * @return the value stored in total
*/
  public int getTotal () {
    return this.total;
  }

/**
 * Adds parameter to total
 * Updates the transaction
 * @param is added to the value stored in total
*/
  public void add (int value) {
	this.total = this.total + value;
	transactions = transactions + "+" + value;
  }

/**
 * Subtracts parameter from total
 * Updates the transactions
 * @param is subtracted from the value stored in total
*/
  public void subtract (int value) { 
	this.total = this.total - value;
	transactions = transactions + "-" + value; 
 }


/**
 * Overrides parent toString
 * @returns string transactions
*/
  public String toString () {
    return transactions ;
  }

/**
 * Clears and reset object variables.
*/
  public void clear() {
    total = 0;  
    transactions = "0";
  }
}