package Diziler.MiniProjeler;
import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlariSiralama {
    /*
    Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
    Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
    */
    // Diziyi sıralayan fonksiyon
    public static void sirala(int[] dizi) {
        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Swap islemi
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //dizinin boyutu alindi
        System.out.print("Dizinin boyutu: ");
        int n = input.nextInt();
        int[] list = new int[n];


        //dizinin elemanlarini al
        int numbers;
        for(int i = 0; i < list.length; i++){
            System.out.print((i+1) + ".Elemanı:");
            numbers = input.nextInt();
            list[i] = numbers;
        }
        sirala(list);
        // Sıralanmış diziyi ekrana yazdır
        for (int sayi : list) {
            System.out.print(sayi + " ");
        }
    }
}
