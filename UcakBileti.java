import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        double normalTutar , indirimliTutar , yasIndirimi, toplamTutar, gdIndirimi;
        int mesafe  ;
        byte yolculukTipi, yas;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextByte();
        System.out.print("Yolculuk tipini giriniz\n1 => Tek Yön , 2 => Gidiş Dönüş:");
        yolculukTipi = input.nextByte();
        normalTutar = mesafe * 0.10;
        if (mesafe > 0){
            if (yolculukTipi == 1){
                if (yas < 12 && yas >= 0){
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.println("Tutar:" + indirimliTutar + " TL");

                }
                else if (yas >= 12 && yas <= 24){
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.println("Tutar:" + indirimliTutar + " TL");

                }
                else if (yas > 65) {
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.println("Tutar:" + indirimliTutar + " TL");

                }
                else if (yas > 24 && yas <= 65){
                    System.out.println("Tutar:" + normalTutar + " TL");
                }
                else if (yas < 0) {
                    System.out.println("Hatalı veri girdiniz !");
                }

            }
            else if (yolculukTipi == 2){
                if (yas < 12 && yas >= 0){
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    gdIndirimi = indirimliTutar * 0.20;
                    toplamTutar = indirimliTutar - gdIndirimi;
                    System.out.println("Tutar:" + (2*toplamTutar) + " TL");

                }
                else if (yas >= 12 && yas <= 24){
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    gdIndirimi = indirimliTutar * 0.20;
                    toplamTutar = indirimliTutar - gdIndirimi;
                    System.out.println("Tutar:" + (2*toplamTutar) + " TL");

                }
                else if (yas > 65) {
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    gdIndirimi = indirimliTutar * 0.20;
                    toplamTutar = indirimliTutar - gdIndirimi;
                    System.out.println("Tutar:" + (2*toplamTutar) + " TL");
                }
                else if (yas > 24 && yas <= 65){
                    gdIndirimi = normalTutar * 0.20;
                    indirimliTutar = normalTutar - gdIndirimi;
                    System.out.println("Tutar:" + (2*indirimliTutar) + " TL");
                }
                else if (yas < 0) {
                    System.out.println("Hatalı veri girdiniz !");
                }

            }
            else{
                System.out.println("Hatalı veri girdiniz !");
            }

        }
        else{
            System.out.println("Hatalı veri girdiniz ! ");
        }

    }
}
