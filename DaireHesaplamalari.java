import java.util.Scanner;
public class DaireHesaplamalari {
    public static void main(String[] args) {
        //degiskenler
        double area ,perimeter , radius , pi =  3.14 ;

        //veri al
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini cm cinsinden giriniz:");
        radius = input.nextDouble();

        // hesaplamalar
        area = pi * radius * radius;
        perimeter = 2 * pi* radius;
        System.out.println("Alan:" + area + " cm^2");
        System.out.println("Çevre:" + perimeter + " cm");

    }
}
