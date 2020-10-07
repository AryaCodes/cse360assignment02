//Name: Arya Tawde
//ASU ID: 1217536502
//Assignment02 CSE360
package cse360assignment02;

//This is a simple class which adds and subtracts.
public class AddingMachine {
  private int total;
  private String transactions;
  
//Public constructor of the class.
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    transactions = "0";
  }
  
//Public method, returns stored total value
  public int getTotal () {
    return this.total;
  }

//Adds value to total  
  public void add (int value) {
	this.total = this.total + value;
	transactions = transactions + "+" + value;
  }

//Subtracts value from total
  public void subtract (int value) { 
	this.total = this.total - value;
	transactions = transactions + "-" + value; 
 }


//Overriding toString of main.
  public String toString () {
    return transactions ;
  }

//Clears the currently stored total in the class.
  public void clear() {
    total = 0;  
    transactions = "0";
  }
}