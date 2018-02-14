public class GroceryListOrder
{
    private String itemName;
    private int quantity;
    private double price;

    public GroceryListOrder(GroceryList list, String name, int amount)
    {
        this.itemName = list.getItem(name).getName();
        this.quantity = amount;
        this.price = list.getItem(name).getPrice();
    }

    public GroceryListOrder(GroceryList2 list, String name, int amount)
    {
        this.itemName = list.getItem(name).getName();
        this.quantity = amount;
        this.price = list.getItem(name).getPrice();
    }
    public GroceryListOrder(GroceryList list, String name)
    {
        this.itemName = list.getItem(name).getName();
        this.quantity = 1;
        this.price = list.getItem(name).getPrice();

    }

    private double getCost()
    {
        return price*quantity;
    }

    @Override
    public String toString()
    {
        return "Order: \n" +
                "Item Name: " + itemName + "\nQuantity: " + quantity +
                "\nTotal: " + getCost() + "\n";
    }
}
