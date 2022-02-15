import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String y, sbatas;
        int x, batas;
        int i = 1;
        
        System.out.println("Masukkan batas perulangan : ");
        sbatas = myObj.nextLine();
        batas = Integer.parseInt(sbatas);
        
        do {
        System.out.println("\nMasukkan bilangan : ");
        y = myObj.nextLine();
        x = Integer.parseInt(y);
        
            if (x%2==0)
                System.out.println("Bilangan " + x + " merupakan bilangan genap\n");
            else
                System.out.println("Bilangan " + x + " merupakan bilangan ganjil\n");
        
        i++;

        } while (i<=batas);
    }
}