/* Ani N
 * 10/23/24
  Pizza.java
  
*/
public class Pizza extends Food	 //this creates the pizza subclass and it links to the superclass using extends
{
    public Pizza(String ingredientIn) // this params value is inputted in FoodTester
    {
        super("baked", ingredientIn, "pizza");
    }
    public Pizza(String ingredientIn, String nameIn) // this overloaded constructor is for DeepDish
    {
		super("baked", ingredientIn, nameIn);
	}
}