import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        //degiskenler
        double armtKg = 2.14 , elmaKg = 3.67 , dmtsKg = 1.11 , muzKg = 0.95 ,
                ptlcnKg = 5.00 , armt, elma, dmts, muz, ptlcn, tutar;

        // veri al
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut:");
        armt = input.nextDouble();
        System.out.print("Kaç kilo elma:");
        elma = input.nextDouble();
        System.out.print("Kaç kilo domates:");
        dmts = input.nextDouble();
        System.out.print("Kaç kilo muz:");
        muz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan:");
        ptlcn = input.nextDouble();

        //hesaplama
        armt *= armtKg;
        elma *= elmaKg;
        dmts *= dmtsKg;
        muz *= muzKg;
        ptlcn *= ptlcnKg;
        tutar = armt + elma + dmts + muz + ptlcn;
        System.out.println("Tutar: " + tutar + " TL");

    }
}
