import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner muObj = new Scanner(System.in);
        String y;
        int x;
        
        System.out.print(" Masukkan nilai : ");
        y = myObj.nextLine();
        x = Integer.parseInt(y);
    
         if (x>60 && x<=100) {
            if (x>80 && x<=100)
                System.out.println("Nilai anda A");
            else
                System.out.println("Nilai anda B");
                System.out.println("Keterangan : Lulus");
        }else{
            System.out.println("Nilai anda C");
            System.out.println("Keterangan : Tidak lulus");
        }
    }
}
