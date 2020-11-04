package javaSnackBar;

public class Snack
{
	// fields (what the object is going to know)
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;
		
		this.name = name;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// getter
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getCost()
	{
		return cost;
	}


	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	// setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	// methods (behaviors)
	public int addQuantity(int addToQuantity)
	{
		return quantity + addToQuantity;
	}

	public int buySnacks(int quantity)
	{
		// buy snack when given how many to buy
		return 
	}

	public double getTotalCost(double quantity)
	{
		// get total cost given a quantity
	}
}