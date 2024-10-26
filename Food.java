/* Ani N
 * 10/23/24
  Food.java
  
  This program shows our understanding of Inheritance. Two objectas are instatiated in FOodtester that are linked to Food. 
  Then Pizza is a subclass of Food and DeepDishPizza 
*/

public class Food
{
	protected String str; //field variable is declared here
	
	public Food ()
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name) // 3 params are passed in and used for printing the values
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}

	public void printForSale()// printing method
	{
		System.out.println(str);
	}
}


