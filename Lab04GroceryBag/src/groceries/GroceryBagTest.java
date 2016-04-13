package groceries;


/**
 * @author Mykayla Fernandes
 * @version 2016.04.11
 *
 */

public class GroceryBagTest extends student.TestCase{
    
    private GroceryBag bag1;    // unordered
    private GroceryBag bag2;    // unordered with repeat items
    private GroceryBag bag3;    // ordered
    private GroceryBag bag4;    // ordered with repeat items
    private GroceryBag compare1; //testing the intersection
    private GroceryBag compare2; //testing the intersection
    private GroceryBag compare3; //testing the intersection

    
    public void setUp() {
        bag1 = new GroceryBag();
        bag1.add("apples");
        bag1.add("chips");
        bag1.add("yogurt");
        bag1.add("chicken");
        bag1.add("pasta");

        bag2 = new GroceryBag();
        bag2.add("pizza");
        bag2.add("broccoli");
        bag2.add("pasta");
        bag2.add("pasta");
        bag2.add("apples");

        bag3 = new GroceryBag();
        bag3.add("apples");
        bag3.add("chicken");
        bag3.add("chicken");
        bag3.add("pasta");
        bag3.add("pizza");
        bag3.add("soda");
        bag3.add("yogurt");
        bag3.add("wheat");

        bag4 = new GroceryBag();
        bag4.add("chicken");
        bag4.add("chicken");
        bag4.add("pasta");
        bag4.add("pasta");
        bag4.add("yogurt");
        
        GroceryBag compare1 = new GroceryBag();
        compare1.add("apples");
        compare1.add("pasta");
        
        GroceryBag compare2 = new GroceryBag();
        compare2.add("apples");
        compare2.add("pasta");
        compare2.add("pizza");
        
        GroceryBag compare3 = new GroceryBag();
        compare3.add("chicken");
        compare3.add("chicken");
        compare3.add("pasta");
        compare3.add("yogurt");
    }
    
    
    
    /**
     * test intersection method
     * @param bag grocery bag to be compared
     */ 
    public void testIntersection()
    {     
        assertEquals(compare1, bag1.intersection(bag2));
        assertEquals(compare2, bag2.intersection(bag3));
        assertEquals(compare3, bag3.intersection(bag4));
    }
    
    
    
    /**
     * test equals method
     * @param givenBag a grocery bag
     */
    public void testEquals()
    {
        assertFalse(bag1 == null);
        assertFalse(bag2 == null);
        assertFalse(bag3 == null);
        assertFalse(bag4 == null); 
        assertTrue(bag1.equals(bag1));
        assertTrue(bag2.equals(bag2));
        assertTrue(bag3.equals(bag3));
        assertTrue(bag4.equals(bag4)); 
    }
}
