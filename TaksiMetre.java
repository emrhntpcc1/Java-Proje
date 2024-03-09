import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        //degiskenler
        int acilis_ucreti = 10;
        double gidilen_km,km_fiyat = 2.20,tutar;

        // veriyi al
        System.out.print("Kaç Km yol gidildi:");
        Scanner input = new Scanner(System.in);
        gidilen_km = input.nextDouble();
        tutar = (km_fiyat * gidilen_km) + acilis_ucreti;

        //kontroller
        tutar = tutar < 20 ? 20 : tutar;
        System.out.println("Taksimetre Ücreti:" + tutar + " TL");

    }
}
