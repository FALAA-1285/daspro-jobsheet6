import java.util.Scanner;

public class Pemilihan2Percobaan103{
    public static void main(String[] args){
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int thn =input03.nextInt();

        if ((thn % 4 ) == 0){
            if ((thn%100)!=0){
                System.out.println("Tahun Kabisat");
            }else if ((thn%400)==0){
                System.out.println("Tahun kabisat");
            }
            else{
                System.out.println("Tahun "+thn+" bukan tahun kabisat");
            }
            
        }else{
            System.out.println("Bukan tahun kabisat");
        }
    }
}