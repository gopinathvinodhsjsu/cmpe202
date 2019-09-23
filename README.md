# assignment-1-gumball-52xiami

## Jun Zhang 013786695

## Change-1: Creating Coins_kind as emu class in which constructor is buit.
   enum Coins_kind {quarter(25), dime(10), nickle(5)
   
## Change-2: Adding some new attributes under GumballMachine
     private int price_per_gumball;
     private Coins_kind []coin;
     private int sum_value;
     private boolean eject_one;
     private boolean accept_coin;
     
## Change-3: Rebuilding the GumballMachine constructor to accept more and variable-length parameters.
     GumballMachine(int size, int price, Coins_kind...con) {
         this.num_gumballs = size;
         this.price_per_gumball = price;
         this.coin = con;
         this.sum_value = 0;
         this.eject_one = false;
         this.accept_coin = false;
## Change-4: Creating a new method void get_GumballMachine_information() to print the information of the gumball machine, such as The price of per gumball, the acceptable kinds of coins.

## Change-5: In main function, I created two gumballmachine models and call the insertQuarter() and the turnCrank() method to do the test. The test output is blow:
GumballMachine Information:
The price of per Gumball is: 25 cents
The acceptable coins are: quarter 

Thanks for your coins.  Gumball Ejected!

GumballMachine Information:
The price of per Gumball is: 50 cents
The acceptable coins are: quarter dime nickle 

Please insert a coin!
Please insert a coin!
Please insert a coin!
Please insert the acceptable coin!
Thanks for your coins.  Gumball Ejected!
