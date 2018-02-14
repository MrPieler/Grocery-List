import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList2
{
    private ArrayList<Item> items;

    public GroceryList2()
    {
        this.items = new ArrayList<Item>();
    }

    public void add (String name, double price)
    {
        Item item = new Item(name, price);
        if (items.size() != 10)
        {
            items.add(item);
        }
        else
        {
            System.out.println("Item list is full");
        }
    }

    public double getTotalCost ()
    {
        double total = 0;
        for (Item i:items)
        {
            total += i.getPrice();
        }
        return total;
    }

    public Item getItem(String name)
    {
        for (Item i:items)
        {
            if (i.getName().equals(name))
            {
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString()
    {
        return "Items in store: \n" + items;
    }
}
