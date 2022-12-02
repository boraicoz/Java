import java.util.Scanner;

public class AlanveCevre {


    public static void main(String[] args) {
       //Alan ve Cevre Hesabi;
       final double pi=3.14;
       double alan,cevre;
       int r;
       Scanner i=new Scanner(System.in);
        System.out.print("Yaricap uzunlugunu giriniz:");
        r=i.nextInt();
        alan=pi*r*r;
        System.out.println("Alan:"+alan);
        cevre=2*pi*r;
        System.out.println("Cevre:"+cevre);

       //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program;
        double aci,alan2;
        int r2;
        System.out.print("Yeni Yaricapi Giriniz:");
        r2=i.nextInt();
        System.out.println("Daire Diliminin Acisini Giriniz:");
         aci=i.nextDouble();
         alan2=pi*r2*r2*(aci/360);
        System.out.println("Daire Diliminin Alani:"+alan2);
    }
}
