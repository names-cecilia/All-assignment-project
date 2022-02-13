import java.util.Scanner;
class Main {
   public static void main(String[] args) {
       System.out.println("Menentukan nilai terbesar 3 bilangan");
       System.out.println("=====================================");
       
        Scanner input=new Scanner(System.in);
        System.out.println("\nMasukkan bilangan pertama : ");
        int Bil1=input.nextInt();
        System.out.println("Masukkan bilangan kedua : ");
        int Bil2=input.nextInt();
        System.out.println("Masukkan bilangan ketiga : ");
        int Bil3=input.nextInt();
        
        int terbesar;
        terbesar = Bil1;
        
        if(Bil2>terbesar){
            terbesar = Bil2;
        }
        if(Bil3>terbesar){
            terbesar = Bil3;
        }
            System.out.println("\nBilangan terbesar adalah " + terbesar);
        
        
        if (Bil1==Bil2){
            System.out.println("Bilangan pertama sama dengan bilangan kedua");
        }
        if (Bil2==Bil3){
            System.out.println("Bilangan kedua sama dengan bilangan ketiga");
        }
        if (Bil1==Bil3){
            System.out.println("Bilangan pertama sama dengan bilangan ketiga");
        }
        
    }
}    


