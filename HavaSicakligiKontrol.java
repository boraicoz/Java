import java.util.Scanner;
public class HavaSicakligiKontrol {

    public static void main(String[] args) {
        int sicaklik;
        Scanner in=new Scanner(System.in);
        System.out.print("Hava Sicakligini Giriniz(°C cinsinden):");
        sicaklik=in.nextInt();
       if(sicaklik<5)
           System.out.println("Kayaga gidebiirsiniz.");
      else if(sicaklik>=5 && sicaklik<15)
           System.out.println("Sinemaya gidebilirsiniz.");
      else if (sicaklik>=15&&sicaklik<25)
           System.out.println("Piknige gidebilirsiniz.");
      else
           System.out.println("Yüzmeye gidebilirsiniz");
    }





}
