/* Ani N
 * 10/23/24
 * Pizza3.java
  Pizza is a subclass of food adn all value are inputed in Food tester
*/
public class Pizza3 extends Food3	 //this creates the pizza subclass and it links to the superclass using extends
{
    public Pizza3(String ingredientIn, int costIn, int countIn) //default constructor also new params are cost and count which are only in the 3s
    {	
        super("baked", ingredientIn, "pizza", costIn, countIn); // values are inputed in Food tester
    }
    public Pizza3(String ingredientIn, String nameIn, int costIn, int countIn)//overload constructor
    {
		super("baked", ingredientIn, nameIn, costIn, countIn); //passes in values from DeepDishPizza
	}
}