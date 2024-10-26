/* Ani N
 * 10/23/24
  Food3.java
   
  This program shows our understanding of Inheritance. Two objectas are instatiated in FOodtester that are linked to Food. 
  Then Pizza is a subclass of Food and DeepDishPizza 

  3 is different only becuase it has 2 new things cost and count

*/

public class Food3
{
	protected String str = (""); //field variables d and ied
	protected String revenue = ("");
	
	public Food3 ()
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int costIn, int countIn) // new params are cost and count which are only in the 3s
	{	
		revenue = String.format("$%.2f", (double)costIn * countIn / 100.0); //uses string.format to calculate this and format properly 
		str = "At the sale: " + name + " " + prepMethod + 
		" with " + ingredient + " will be sold for " + costIn + " cents each."
		 + " With " + countIn + " " + name + " (s), " + revenue +" can be made.";
	}

	public void printForSale()
	{
		System.out.println(str); //printing method for all the code
	}
}

