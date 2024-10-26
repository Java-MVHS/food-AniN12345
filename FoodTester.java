/* Ani N
 * 10/23/24
  FoodTester.java
  
  This program runs all the code calling methods from food which aloo has methods from pizza and deepdish via inheritance 
*/

public class FoodTester
{
	public static void main(String[] args) // passed in foodtester so i can run the method to print out three lines
    {
        FoodTester ft = new FoodTester();
        ft.newLines();
        Food food1	= new Food ("baked", "banana", "muffins");  //instance of Food
        food1.printForSale();
        Food food2	= new Food ("fried", "yam",	"fritters");  //instance of Food
        food2.printForSale();
        Pizza pizza	= new Pizza ("pepperoni"); //instance of Pizza
        pizza.printForSale();
        DeepDishPizza ddpizza = new DeepDishPizza("cheese"); //instance of DeepDishPizza
        ddpizza.printForSale();
        ft.newLines();
    }

    public void newLines()
    {
        System.out.print("\n\n\n");
    }
}