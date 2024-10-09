// Represents a Dish item that will be sold at a Japanese Cuisine 

public class Dish{

  //Makes the attributes/varaibles for a Dish 
 
  private String name; //   Name of the Dish 
  private double price;  //    Price of the Dish 
  private int amount;   //  How much of the Dish is one order 

  // No-Arguement Constructor 
//   Sets name to "no name", price to 14.00, and amount to 1

  public Dish(){
  name = "No name";
    price = 14.00;
    amount = 1;
}

  // Parameterzied Constructor 
  //   Sets name to specified name, price to specified price, 
  //    and amount to specified amount 

 
  

  public Dish(String name, double price) {
  this.name = name; 
  this.price = price;
  this.amount = 1; 
} 

// Accessor Methods
// returns the value assigned to name 

  public String getName() {
    return name;
  }

  //  returns the value assigned to price

  public double getPrice(){
  return price;
}
 
  // returns the value assigned to amount 

  public int getAmount(){
  return amount;
}

  // Returns the "Order: " + name + "\nPrice: " + price + "\nAmount: " + amount

  public String toString(){
    return "Order: " + name + "\nPrice: " + price + "\nAmount: " + amount;
  
  }
}