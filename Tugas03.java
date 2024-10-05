
import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner input03=new Scanner(System.in);

        String jnsBuku;
        int jmlBuku, harga=20_000;
        double diskon=0, totalHarga, jmldiskon;

        System.out.print("Masukkan Jenis Buku : ");
        jnsBuku =input03.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jmlBuku =input03.nextInt();

        if (jnsBuku.equalsIgnoreCase("kamus")){
            if(jmlBuku>2){
                diskon=0.12;
            }else{
                diskon=0.1;
            }
        }
        else if (jnsBuku.equalsIgnoreCase("novel")) {
            if(jmlBuku>3){
                diskon=0.09;
            }
            else if (jmlBuku<=3){
                diskon=0.08;
            }
        }
        else if(jmlBuku>3){
            diskon=0.05;
        }
        else{
            diskon=1;
        }

        jmldiskon=harga*jmlBuku*diskon;
        totalHarga=(harga*jmlBuku)-jmldiskon;

        System.out.println("Maka jumlah diskon : Rp."+jmldiskon);
        System.out.println("Total Harga : Rp. "+totalHarga);

    }    
}
