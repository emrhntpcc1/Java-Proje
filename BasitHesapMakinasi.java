import java.util.Scanner;

public class BasitHesapMakinasi {
    public static void main(String[] args) {
        int num1, num2;
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        num1 = input.nextInt();
        System.out.print("İlk sayıyı giriniz:");
        num2 = input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapılacak işlemi tuşlayın: ");
        choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Toplam:" + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma:" + (num1 * num2));
                break;
            case 4:
                if (num2 != 0){
                    System.out.println("Bölme:" + (num1 / num2));

                }else{
                    System.out.println("Sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Lütfen tekrar deneyin.");
        }
    }
}
