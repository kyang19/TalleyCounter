/**
 * 
 * @author kimyang
 *TalleyCounter
 */
public class TalleyCounter 

{

	//fields 
	private int count; 
	//^declaring an instance variable
	
	//count is the instance variable/field
	
	//constructors:
	public TalleyCounter()
	{
		count = 0;
	}
	
	public TalleyCounter(int a)
	{
		count = a; 
	}
	
	//methods
	public void click()
	{
		count++; // count = count + 1
	// another option count +=1
	
	}
	
	public int getCount()
	//int because you want to return a value
	{
		return count;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public void unclick()
	//void because you're not returning anything; just performing a task
	{
		count = count - 1;
		//or count--;
	}
}
