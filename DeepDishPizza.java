/* Ani N
 * 10/23/24
  DeepDishPizza.java
  
  Subclass of Pizza
*/
public class DeepDishPizza extends Pizza // final subclass has a super class of pizza and pizza sueprclass is food
{
	public DeepDishPizza(String ingredientIn) // constructor passes in one parameter
	{
		super(ingredientIn, "deep dish pizza"); // second one is inputed via string
	}
}