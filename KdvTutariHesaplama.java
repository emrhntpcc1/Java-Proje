import java.util.Scanner;
public class KdvTutariHesaplama {
    public static void main(String[] args) {
        //kullanicidan para degerini al
        double paragiris ,kdv_tutar;
        kdv_tutar = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün fiyatini giriniz:");
        paragiris = input.nextDouble();

        // kdv'li fiyat,kdv'siz fiyat göster.
        double kdvli = (paragiris * kdv_tutar) + paragiris;
        System.out.println("Ürünün KDV'li fiyatı:" + kdvli + " TL");
        System.out.println("KDV oranı:" + kdv_tutar);

    }
}
