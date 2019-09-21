import java.util.Scanner;

public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Which machine you want to use?");
    	System.out.println("1. c25\t2. c50\t3. 50(accepts any coin)");
    	sc.nextLine();
    }
}
