import java.util.Scanner;
public class HarmonikSayilar {
    //Girilen sayının harmonik serisini bulan program yazdım.
    public static void main(String[] args) {
        int inpNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin:");
        inpNumber = input.nextInt();
        //harmonik hesapla
        double harmonikNum , total = 0;
        for (double i = 1 ; i <= inpNumber; i++){
            harmonikNum = 1 / i;
            total += harmonikNum;
        }
        System.out.println("Harmonik değeri = " + total);

    }
}
