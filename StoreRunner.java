import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
//Instantiates the Udon Object 
Dish Udon = new Dish("Udon", 12.50 );
System.out.println(Udon);
    System.out.println("---------");
//Instantiates the CaliforniaRoll Object 
    Sushi CaliforniaRoll = new Sushi ("California Roll", 13.00, 8, "Rice, Seaweed, Avocado, Cucumber, Crab Meat", false);
  //Prints out the attribute and info for the California Roll Object 
    System.out.println(CaliforniaRoll);
   System.out.println("---------");
    //Instantiates the MisoSoup Object 
Side MisoSoup = new Side("Miso Soup", 3.50, 1, false);
System.out.println(MisoSoup);
   System.out.println("---------");

    // Closes the Scanner object
    input.close();
    
  }
}