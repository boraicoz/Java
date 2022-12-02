import java.util.Scanner;
public class VücudKitleİndeksi {
    public static void main(String[] args) {
        int a=3,b=4;

        a-=a*b;
        System.out.println(a);
     double height,weight,massindex;
      Scanner i=new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz(kg cinsinden):");
        weight=i.nextDouble();
        System.out.print("Boyunuzu Giriniz(m cinsinden):");
        height=i.nextDouble();
        massindex=weight/(height*height);
        System.out.println("Vücud kitle indeksiniz:"+massindex);
    }
}
