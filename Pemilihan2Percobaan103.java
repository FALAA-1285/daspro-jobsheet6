
import java.util.Scanner;

public class Pemilihan2Percobaan103{
    public static void main(String[] args){
        Scanner input03 = new Scanner(System.in);

        System.err.print("Masukkan tahun : ");
        int thn =input03.nextInt();

        if ((thn % 4 ) == 0){
            if ((thn%100)!=0){
                System.out.println("Tahun Kabisat");
            }
        }else{
            System.err.println("Bukan tahun kabisat");
        }
    }
}