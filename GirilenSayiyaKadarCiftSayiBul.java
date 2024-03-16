import java.util.Scanner;
public class GirilenSayiyaKadarCiftSayiBul {
    public static void main(String[] args) {
        int i , InpNum;
        System.out.print("Sayı Giriniz:");
        Scanner input = new Scanner(System.in);
        InpNum =input.nextInt();
        for (i = 0; i <= InpNum; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Çift Sayılar");

        // 3 ve 4 ile tam bolunebilen sayilari yazdir.
        int k , Veri;
        System.out.print("Sayı Giriniz:");
        Veri = input.nextInt();
        for(k = 0; k <= Veri; k++){
            if((k % 3 == 0) && (k % 4 == 0)){
                System.out.print(k + " ");
            }
        }
        System.out.println();
        System.out.println("Sayılar 3 ve 4'e tam bölünür.");
    }
}
