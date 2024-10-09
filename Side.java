//Represents a Side that can be sold at a Japanese Cuisine 
// Side is a type of Dish 

public class Side extends Dish{
 
  private boolean isDessert; // Whether or not Side is a Dessert 

// Sets isDessert to flase 
public Side(){
 
  isDessert = false; 
}

  // Sets the name to the specified name, price to the specified price
  // Amount to the specified amount, and isDesert to the specfied status 
 
  public Side(String name, double price, int amount, boolean isDessert) {
super(name, price, amount);
this.isDessert = isDessert; 
    

} 

  // Returns wheether or not the side is a Dessert or not 
 
  public boolean isDessert(){
   return isDessert;
  }

  // Sets isDessert to the specfied status 
  
  public void setIsDessert(boolean newIsDessert){
    isDessert = newIsDessert;
  }

  // returns the super.toString() and + "Is a dessert? " + isDessert;
 
  public String toString(){
    return super.toString() + "\nIs a dessert? " + isDessert;
  }
}