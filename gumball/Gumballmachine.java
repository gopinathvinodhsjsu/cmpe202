package CMPE202_assignment1;

enum Coins_kind {quarter(25), dime(10), nickle(5);
  public int coin_value;
  Coins_kind(int v){
      this.coin_value = v;
  }
}

 class GumballMachine {
    //initiate instance variables
     private int num_gumballs;
     private int price_per_gumball;
     private Coins_kind[] coin;
     private int sum_value;
     private boolean eject_one;
     private boolean accept_coin;

     //constructor to accept variable-length arguments
     GumballMachine(int size, int price, Coins_kind... con) {
         this.num_gumballs = size;
         this.price_per_gumball = price;
         this.coin = con;
         this.sum_value = 0;
         this.eject_one = false;
         this.accept_coin = false;

     }
     // to get price_per_gumball and acceptable kinds of coins for the Gumballmachine
     void get_GumballMachine_information(){
         System.out.println("The price of per Gumball is: " + this.price_per_gumball + " cents");
         System.out.println("The acceptable coins are: ");
      // print the acceptable coins, such as quarter, dime, nickle.
         for (Coins_kind c : this.coin) System.out.print(c + " ");
         System.out.println();
         System.out.println();
     }
     void insertQuarter(int coin_v) {
         for (Coins_kind c : this.coin) {
             if (c.coin_value == coin_v) {
                 this.sum_value += coin_v;
                 accept_coin = true;
                 break;
             } else accept_coin = false;
         }
     }

     void turnCrank() {
         if (accept_coin) {
             if (this.sum_value >= this.price_per_gumball) eject_one = true;
             else eject_one = false;
             if (this.eject_one) {
                 if (this.num_gumballs > 0) {
                     this.num_gumballs--;
                     this.sum_value -= this.price_per_gumball;
                     this.eject_one = false;
                     System.out.println("Thanks for your coins.  Gumball Ejected!");
                 } else {
                     System.out.println("No More Gumballs!  Sorry, can't return your coins.");
                 }
             } else {
                 System.out.println("Please insert a coin!");
             }
         } else System.out.println("Please insert the acceptable coin!");
     }
 }


class Demo {
    public static void main(String[] args) {
        GumballMachine m2 = new GumballMachine(10, 50, Coins_kind.quarter, Coins_kind.dime, Coins_kind.nickle);
        m2.get_GumballMachine_information();
        m2.insertQuarter(25);
        m2.turnCrank();
        m2.insertQuarter(10);
        m2.turnCrank();
        m2.insertQuarter(10);
        m2.turnCrank();
        m2.insertQuarter(30);
        m2.turnCrank();
        m2.insertQuarter(5);
        m2.turnCrank();

    }
}

