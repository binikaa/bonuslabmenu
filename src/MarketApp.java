import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MarketApp {
	
	static List <String> fruits = new ArrayList<>();
	static List <Double> prices = new ArrayList<>();

	public static void main(String[] args) {
		try {
		
		Map<String, Double> items = new HashMap<>();
		items.put("apple", 0.99);
		items.put("banana", 0.59);
		items.put("cauliflower", 1.59);
		items.put("dragonfruit", 2.19);
		items.put("Elderberry", 1.79);
		items.put("figs", 2.09);
		items.put("grapefruit", 1.99);
		items.put("honeydew", 3.49);
		display();
		String choice;
		do
		{
			
		System.out.println("Would you like to order?(y/n)");
		Scanner scr = new Scanner(System.in);
		 choice = scr.nextLine();
		display();
		if (choice.equals("n"))
		{
			System.out.println("\n\nThanks for your order!");
			System.out.println("Here's what you got\n");
			for(int i=0;i<fruits.size();i++)
				System.out.println(fruits.get(i)+"\t\t\t\t$"+prices.get(i));
			System.out.println();
			
			average();
			double num1 = highest();
			lowest(num1);
			System.exit(0);
			
		}	
				
		System.out.println("What item would you like to order?");	
		String fruit = scr.nextLine();
		System.out.println("Adding " +fruit+ " to cart at $"+items.get(fruit));
		
		orderedItems(fruit,items.get(fruit));
		//}
		}while(choice.equals("y"));
				
	
	
	}
		catch(NullPointerException e)
	{
		System.out.println("Sorry we don't have that item");
	}
	}	
	public static void average()
	{
		double sum=0,avg=0;
		for(int i=0;i<prices.size();i++)
		{
			sum= sum+ prices.get(i);
		}
		avg=sum/prices.size();
		System.out.println("Average price per item in order was $"+ avg);
		
	}
	public static void lowest(double high)
	{
		double low=high;
		for(int i=0;i<prices.size();i++)
		{
			if(prices.get(i)<low)
				low=prices.get(i);
		}
		System.out.println("The lowest price is $ "+low);
	}
	public static double highest()
	{
		double high=0;
		for(int i=0;i<prices.size();i++)
		{
			if(prices.get(i)>high)
				high=prices.get(i);
		}
		System.out.println("the highest price is $"+ high);
		return high;
	}
	public static void orderedItems(String fruit,double price)
	{
		fruits.add(fruit);
		prices.add(price);
		
		
		//System.out.println(fruit+"\t\t\t\t"+ price);
	}
	public static void display()
	{
		System.out.println("Welcome to Guenther's Market!");
		System.out.println("Items\t\t\t\tPrice");
		System.out.println("==========================================");
		System.out.println("apple\t\t\t\t $0.99");
		System.out.println("banana\t\t\t\t $0.59");
		System.out.println("cauliflower\t\t\t $1.59");
		System.out.println("dragonfruit\t\t\t $2.19");
		System.out.println("Elderberry\t\t\t $1.79");
		System.out.println("figs\t\t\t\t $2.09");
		System.out.println("grapefruit\t\t\t $1.99");
		System.out.println("honeydew\t\t\t $3.49");
		
		
	}

}
