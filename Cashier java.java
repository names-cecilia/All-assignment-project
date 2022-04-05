import java.util.Scanner;
public class Main
{
    int price;
    
    //function
    static void disc(float totalPrice){
        if (totalPrice > 100) {
            System.out.println("\nYou just purchased more than $100!");
            System.out.println("You've got discount 15%! Now, you total is $" + totalPrice*0.85);
            System.out.println("\nTHANK YOU!");
        } else {
            System.out.println("\nTHANK YOU!");
        }
    }
    
	public static void main(String[] args) {
	    
	    int i;
	    float totalPrice;
	    String name;
	    
	    //array
	    String[] books = {"Children book", "Parenting book", "Educational book", "Science book", "Novel"};
	    int[] price = {20, 40, 30, 45, 35};
	    
		System.out.println("    BOOKSTORE CASHIER");
		System.out.println("=======================");
		System.out.println("\nBook List : ");
		
		//looping
		for ( i = 0 ; i<= 4 ; i++){
		    System.out.println("  " + books[i] + " : $" + price[i]);
		}
		
		System.out.println("\nDISCOUNT 15% IF PURCHASE MORE THAN $100");
        System.out.println("=================================\n");
		
		Scanner input=new Scanner(System.in);
        System.out.println("Input book item number [0 to 4] : ");
        int item=input.nextInt();
		
		//conditional
		if (item >= 0 && item <=4) {
            System.out.println("\nHow many book : ");
            int n=input.nextInt();
            
            name = books[item];
            totalPrice = price[item]*n;
            
            System.out.println("-----------------------------");
            System.out.println("\nYou just bought " + n + "book(s) of " + name);
            System.out.println("for $" + totalPrice);
            disc(totalPrice);
            
		} else {
		    System.out.println("\nPlease enter the number between 0 and 4");
		}
		
	}
}


