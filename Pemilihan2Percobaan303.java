import java.util.Scanner;

public class Pemilihan2Percobaan303 {
    public static void main(String[] args) {
        Scanner input03=new Scanner(System.in);

        String ketagori;
        int gajiBersih, penghasilan;
        double pajak=0;

        System.out.print("Masukkan ketagori : ");
        ketagori=input03.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan=input03.nextInt();

        if(ketagori.equals("pekerja")){
            if(penghasilan<=2000000){
                pajak=0.1;
            }else if(penghasilan<=3000000){
                pajak=0.15;
            }else{
                pajak=0.2;
            }
            gajiBersih=(int)(penghasilan-(penghasilan*pajak));
            System.out.println("penghasilan bersih : "+gajiBersih);
        }else if (ketagori.equals("pebisnis")){
            if(penghasilan<=2500000){
                pajak=0.15;
            }else if (penghasilan<=3500000){
                pajak=0.2;
            }else{
                pajak=0.25;
            }
            gajiBersih=(int)(penghasilan-(penghasilan*pajak));
            System.out.println("Penghasilan bersih : "+gajiBersih);
        }else{
            System.out.println("Masukkan ketagori salah");
        }
    }
    
}
