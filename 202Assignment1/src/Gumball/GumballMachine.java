package Gumball;
import java.util.Scanner;

public class GumballMachine{
    private int num_gumballs;
    private int machine;
    private boolean has_quarter;
    private int coinValue;
    private int change;
    private boolean firstcoin = true;
    private boolean endMachine = false;
    Scanner sc = new Scanner(System.in);

    public GumballMachine( int size ){
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin){
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank(){
    	if ( this.has_quarter ){
    		if ( this.num_gumballs > 0 && firstcoin){
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
 
    			System.out.println( "Thanks for your coin. Gumball Ejected!" ) ;
    			endMachine = true;
    		}
    		else{
    			this.firstcoin = true;
    			System.out.println( "Please insert another quarter" ) ;
    		}
    	}
    	else {
    		endMachine = true;
    		System.out.println( "Coin Ejected. Please insert a quarter" ) ;
    	}        
    }
    
    public void getMachine(){
    	System.out.println("****Which machine you want to use?****");
    	//System.out.println("Gumballs in Stock: " + this.num_gumballs);
    	System.out.println("1. c25\t2. c50\t3. 50(accepts any coin)");
    	machine = sc.nextInt();
    }
    
    public void coinTracker() {
    	if (this.has_quarter) {
    		this.firstcoin = false;
    	}
    }
    
    public void getCoinsOfAllTypes() {
    	int cost = 50;
    	int value = 0;
    	while(value < cost) {
    		getCoin();
    		if(coinValue != 5 && coinValue != 10 && coinValue != 25) {
    			System.out.println("Please insert nickel or dime or quarter only");
    			continue;
    		}
    		value = value + coinValue;
    		
    	}
    	if(value > cost) {
    		this.change = value - cost;
    		System.out.println();
    	}
    	this.coinValue = value;
    	this.has_quarter = true;
    }
    
    public void machineOperation() {
    	getMachine();
    	switch(machine) {
    	case 1:{
    		firstMachine();
    		break;
    	}
    	case 2:{
    		secondMachine();
    		break;
    	}
    	case 3:{
    		thirdMachine();
    		break;
    	}
    	default:{
    		System.out.println("Invalid Input. Please try again");
    		break;
    	}
    	}
    }
    
    public void getCoin() {
    	System.out.println("Insert a coin");
    	this.coinValue = sc.nextInt();
    }
    
    public void returnChange() {
    	if(this.change > 0) {
    		System.out.println("Please collect the change: " +this.change);
    	}
    }
    
    public void firstMachine() {
    	getCoin();
    	insertQuarter(coinValue);
    	turnCrank();
    	returnChange();
    }
    
    public void secondMachine() {
    	this.endMachine = false;
    	while(!this.endMachine) {
    		getCoin();
    		insertQuarter(coinValue);
    		if(this.has_quarter) {
    			coinTracker();
    			turnCrank();
    			getCoin();
        		insertQuarter(coinValue);
        		turnCrank();
    		}
    		else {
    			this.endMachine = true;
    			System.out.println("Coin Ejected. Please try again and insert a quarter");
    		}
    	}
    }
    
    public void thirdMachine() {
    	getCoinsOfAllTypes();
    	if(this.coinValue >= 50) {
    		turnCrank();
    		returnChange();
    	}
    }
    
    public static void main(String args[]) {
    	GumballMachine gm = new GumballMachine(10);
    	while(gm.num_gumballs > 0) {
    		gm.machineOperation();
    	}
    	gm.sc.close();
    	System.out.println("Thank you! Gumballs Sold Out");
    }
}
