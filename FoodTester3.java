/* Ani N
 * 10/23/24
  FoodTester3.java
  
  This program runs all the code calling methods from food which aloo has methods from pizza and deepdish via inheritance
  3 is different only becuase it has 2 new things cost and count
*/

public class FoodTester3
{
	public static void main(String[] args)
    {
        FoodTester3 ft = new FoodTester3(); // passed in foodtester so i can run the method to print out three lines
        ft.newLines();
        Food3 food1	= new Food3 ("baked", "banana", "muffins", 50, 12); //instance of Food
        food1.printForSale();
        Food3 food2	= new Food3 ("fried", "yam",	"fritters", 100, 3); //instance of Food
        food2.printForSale();
        Pizza3 pizza = new Pizza3 ("pepperoni", 250, 8); //instance of Pizza
        pizza.printForSale();
        DeepDishPizza3 ddpizza = new DeepDishPizza3("cheese", 300, 10); //instance of DeepDishPizza
        ddpizza.printForSale();
        ft.newLines();
    }

    public void newLines()
    {
        System.out.print("\n\n\n");
    }
}