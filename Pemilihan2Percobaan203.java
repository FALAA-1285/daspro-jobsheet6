
import java.util.Scanner;

public class Pemilihan2Percobaan203{
    public static void main(String[]args){
        Scanner input03=new Scanner(System.in);

        String member;
        int menu;
        double harga, total_bayar, diskon;

        System.out.println("-----------------------------");
        System.out.println("======= MENU KAFE JTI =======");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bundling (Ricebowl + Ice Tea)");
        System.out.println("------------------------------------");        
        System.out.print("Masukkan angka dari menu yanng akan di beli: ");
        menu= input03.nextInt();
        input03.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member= input03.nextLine();
        System.out.println("------------------------------------");

        if (member.equalsIgnoreCase("y")){
            diskon= 0.10;
            System.out.println("besar diskon = 10%");
            if (menu ==1) {
                harga = 14000;
                System.out.println("Harga ricebowl = "+harga);
            }
            else if(menu==2){
                harga= 3000;
                System.out.println("harga Ice Tea = "+harga);
            }
            else if (menu==3) {
                harga= 15000;
                System.out.println("Harga bundling = "+harga);
            }
            else{
                System.out.println("Masukkan menu dengan benar");
                return;
            }

            total_bayar= harga- (harga*diskon);
            System.out.println("Total bayar setelah diskon = "+total_bayar);
        }
            

        else if (member.equalsIgnoreCase("n")){
            if (menu ==1) {
                harga = 14000;
                System.out.println("Harga ricebowl = "+harga);
            }
            else if(menu==2){
                harga= 3000;
                System.out.println("harga Ice Tea = "+harga);
            }
            else if (menu==3) {
                harga= 15000;
                System.out.println("Harga bundling = "+harga);
            }
            else{
                System.out.println("Masukkan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = "+harga);
        }
        else {
            System.out.println("Member tidak valid");
        }
        System.out.println("------------------------------------");
    }
}
