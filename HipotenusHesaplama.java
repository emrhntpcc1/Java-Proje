import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        //degiskenleri tanımla
        int dik_u , yatay_u,kareler_toplami;
        double  hipo,alan,cevre;

        //kullanicidan uzunluklari al
        Scanner input = new Scanner(System.in);
        System.out.println("Dik kenar uzunluklarını girin\n(cm cinsinde olmalıdır)");
        System.out.print("=>");
        dik_u = input.nextInt();
        System.out.print("=>");
        yatay_u = input.nextInt();

        // hesaplamalar
        kareler_toplami = (dik_u*dik_u) + (yatay_u*yatay_u);
        hipo = Math.sqrt(kareler_toplami);//karekökünü aldık
        alan = dik_u * yatay_u;
        cevre = dik_u + yatay_u + hipo;

        // ekrana yazdır
        System.out.println("Hipotenüs Uzunluğu:" + hipo + " cm");
        System.out.println("Alan:" + alan + " cm^2");
        System.out.println("Çevre Uzunluğu:" + cevre + " cm");

    }
}
