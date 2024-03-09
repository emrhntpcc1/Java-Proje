import java.util.Scanner;
public class VucutKitleIndeks {
    public static void main(String[] args) {
        //degiskenler
        double height , weight , indeks;

        //veri al
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz:");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        weight = input.nextDouble();

        //indeks
        indeks = weight / height * height;
        System.out.println("Vücut kitle indeksiniz: " + indeks);

    }
}
