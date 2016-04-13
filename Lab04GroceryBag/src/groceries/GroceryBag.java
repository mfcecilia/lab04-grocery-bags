package groceries;

//-------------------------------------------------------------------------
/**
 * The Grocery Bag class is a bag data structure that holds String objects 
 * that represent grocery store items.
 *
 * @author Mykayla Fernandes
 * @version 2016.04.12
 */
public class GroceryBag extends ArrayBasedBag
{
    //Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates an empty bag using the default capacity.
     */
    public GroceryBag()
    {
        super(10);
    }

    //Public methods ........................................................
    /**
     * If an element is in both bags, then it will be in the 
     * intersection.  If there are multiple occurrences of that
     * element, then the number of occurrences of that element
     * in the intersection will equal the minimum number of occurrences
     * in either set.
     * 
     * Examples:
     * intersection of 
     * ({"apple","apple","cereal","chips"},
     * {"chips", "apple","apple","chips","cake"}) 
     * = {"apple","apple","chips"} 
     * 
     * @param bag Bag to be intersected with.
     * @return The intersection of the two bags.
     */
    public GroceryBag intersection(GroceryBag bag) //GroceryBag is in the name because you're returning an object
    {
        //bag is ^this param and contents is from the arraybasedbag class
        String[] stuff = bag.contents;
        String[] moreStuff = bag.contents;
        
        GroceryBag intersection = new GroceryBag();
        
        
        for (int i = 0; i < stuff.length; i++)
        {
            if (stuff[i] == null)
            {
                continue;
            }
            for (int j = 0; j < moreStuff.length; j++)
            {
                if (stuff[i].equals(moreStuff[j]))
                {
                    intersection.add(stuff[i]);              
                }
            }
        }
       return null;
    }
   

    /**
     * For two bags to be equal they need to contain items 
     * with the exact same value (but not the same item, so 
     * equality not identity).  Order does not matter, but 
     * number of occurrences does.
     * 
     * @param givenBag Other GroceryBag to be compared with for equality.
     * @return Returns true if the two bags have the same items.
     */
    @Override
    public boolean equals(Object givenBag)
    {
        //Implement this method
        if(givenBag == null) //base case
        {
            return false;
        }
        if (givenBag == this) //base case
        {
            return true;
        }
        if (givenBag.getClass() == this.getClass()) //base case
        {
            GroceryBag bag = (GroceryBag)givenBag; //this is casting from an obj to a grocery bag
            
            //comparing the contents array in arraybasedbag to this entire grocerybag object/class (which was
            //just casted to become a more specific bag object)
            //yes, grocerybag.java is a hybrid class object thing
            if (bag.size() == this.size())  
            {
                for (int k = 0; k < contents.length; k++)
                {
                  //because it extends arraybasedbag, we can also 
                  //use .contents but it'll be in reference to this particular bag
                    if (this.contents[k] != bag.contents[k]) 
                    {
                        return false;
                    }           
                }
                return true;
            }
            else
            {
                return false;
            }
            
        }
        else
        {
            return false; //adding an else statement to ensure method returns a boolean
        }
        
    }
}
