import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String y;
        int x;
        
        for (int i=1; i <= 6; i++){
        System.out.println("Masukkan bilangan: ");
        y = myObj.nextLine();
        x = Integer.parseInt(y);
        
        if (x%2==0)
            System.out.println("Bilangan " + x + " merupakan bilangan genap\n");
        else
            System.out.println("Bilangan " + x + " merupakan bilangan ganjil\n");
            
        }
    }
}