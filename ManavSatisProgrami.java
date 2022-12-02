import java.util.Scanner;
public class ManavSatisProgrami {
    public static void main(String[] args) {
        double elma=3.67,domates=1.11,muz=0.95,patlican=5.00,armut=2.14,tutar;
        Scanner in=new Scanner(System.in);
        int ka,kd,km,kp,ke;
        System.out.print("Armut kac kilo?:");
        ka= in.nextInt();
        System.out.print("Domates kac kilo?:");
        kd=in.nextInt();
        System.out.print("Muz kac kilo?:");
        km=in.nextInt();
        System.out.print("Patlican kac kilo?:");
        kp=in.nextInt();
        System.out.print("Elma kac kilo?:");
        ke=in.nextInt();
        tutar=armut*ka+domates*kd+muz*km+patlican*kp+elma*ke;
        System.out.println("Toplam Tutar:"+tutar);
    }

}
