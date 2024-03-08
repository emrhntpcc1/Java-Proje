import java.util.Scanner;
public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        double mat , fizik , kimya , biyoloji;
        //verileri al
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextDouble();

        System.out.print("Fizik Notunuz:");
        fizik = input.nextDouble();

        System.out.print("Kimya Notunuz:");
        kimya = input.nextDouble();

        System.out.print("Biyoloji Notunuz:");
        biyoloji = input.nextDouble();

        // not ortalamasını hesapla
        double toplam = mat + fizik + kimya + biyoloji ;
        double ort = toplam / 4.0 ;
        System.out.println("Ders Ortalamanız:" + ort);

        // geçti ise true kaldı ise false
        boolean x = ort >= 60;
        System.out.println(x);

    }
}
