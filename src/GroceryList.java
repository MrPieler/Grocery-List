import java.util.Arrays;

public class GroceryList
{
    private Item items[];
    private int count;

    public GroceryList()
    {
        this.items = new Item[10];
        this.count = 0;
    }

    public void add (String name, double price)
    {
        Item item = new Item(name, price);
        if (count != 10)
        {
        items[count] = item;
        count++;
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
        return "Items in store: \n" + Arrays.toString(items);
    }
}
