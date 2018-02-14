import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test
{
    public static void test() throws FileNotFoundException
    {

        //opgavebeskrivelse ikke tydelig, opgave forstået som:
        // GroceryList er en liste over varer i supermarkedet
        //GroceryListOrder er en liste over de varer man gerne vil bestille fra butikken
        GroceryList list = new GroceryList();
        GroceryList list1 = new GroceryList();

        //Manuelt add
        list.add("Ting1", 1);
        list.add("Ting2", 2);
        list.add("Ting3", 3);
        list.add("Ting4", 4);
        list.add("Ting5", 5);
        list.add("Ting6", 6);
        list.add("Ting7", 7);
        list.add("Ting8", 8);
        list.add("Ting9", 9);
        list.add("Ting10", 10);
        list.add("Ting11", 11);

        //Vis samlet pris for alle tilgængelige varer
        System.out.println("Total cost of all items: " + list.getTotalCost());

        //Lav en ordre på en specifik vare
        GroceryListOrder order = new GroceryListOrder(list, "Ting5", 3);

        //Vis info om den bestilte vare
        System.out.println(order);

        //Tilføj varer ved at læse fil (pris hardcodet)
        File f = new File("Items");
        Scanner scanner = new Scanner(f);
        try
        {
            int count = 0;
            while (scanner.hasNextLine())
            {
                list1.add(scanner.next(), 5);
            }
        }
        catch (java.util.NoSuchElementException eNSEE)
        {
        }
    }
    public static void test2() throws FileNotFoundException
    {

        //opgavebeskrivelse ikke tydelig, opgave forstået som:
        // GroceryList er en liste over varer i supermarkedet
        //GroceryListOrder er en liste over de varer man gerne vil bestille fra butikken
        GroceryList2 list = new GroceryList2();
        GroceryList2 list1 = new GroceryList2();

        //Manuelt add
        list.add("Ting1", 1);
        list.add("Ting2", 2);
        list.add("Ting3", 3);
        list.add("Ting4", 4);
        list.add("Ting5", 5);
        list.add("Ting6", 6);
        list.add("Ting7", 7);
        list.add("Ting8", 8);
        list.add("Ting9", 9);
        list.add("Ting10", 10);
        list.add("Ting11", 11);

        //Vis samlet pris for alle tilgængelige varer
        System.out.println("Total cost of all items: " + list.getTotalCost());

        //Lav en ordre på en specifik vare
        GroceryListOrder order = new GroceryListOrder(list, "Ting5", 3);

        //Vis info om den bestilte vare
        System.out.println(order);

        //Tilføj varer ved at læse fil (pris hardcodet)
        File f = new File("Items");
        Scanner scanner = new Scanner(f);
        try
        {
            int count = 0;
            while (scanner.hasNextLine())
            {
                list1.add(scanner.next(), 5);
            }
        }
        catch (java.util.NoSuchElementException eNSEE)
        {
        }
    }
}
