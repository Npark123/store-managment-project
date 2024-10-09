// Represents Sushi that can be sold at a Japanese Cuisine 
// Sushi is a type of Dish 

public class Sushi extends Dish{


  private String ingredients; // the ingredients of the Sushi
  private boolean hasTempura; // Whether the Sushi has Tempura or not

  //Sets ingredients to Rice, Seaweed, Crab, and Cucmber
  //Sets hasTempura to false 
  
  public Sushi(){
    
   ingredients = "Rice, Seaweed, crab, cucumber";
    hasTempura = false;
    
  }

  // Sets the name to the specified name, price to the specified price
  // Amount to the specified amount, ingredients to the specified ingredints
  // and hasTempura to the specified status 

  public Sushi(String name, double price, int amount, String ingredients, boolean hasTempura ) {
super(name, price, amount);
 this.ingredients = ingredients;
  this.hasTempura = hasTempura; 
} 

  // retursn the value assigned to ingredients 
  
  public String ingredients(){
    return ingredients; 
  }
 
  // returns the value assigned to hasTempura 

  public boolean hasTempura(){
    return hasTempura;
  }

  // Sets ingredients to the specified status 

  public void setIngredients(String newIngredients){
    ingredients = newIngredients;
  }

  // Sets hasTempura to the specified status 
 
  public void setHasTempura(boolean newHasTempura){
    hasTempura = newHasTempura;
  }
  
  // returns the super.toString() and +  "What is in it: " + ingredients + "Has Tempura? " + hasTempura
 
  public String toString(){
    return super.toString() +  "\nWhat is in it: " + ingredients + "\nHas Tempura? " + hasTempura; 
  }
}



