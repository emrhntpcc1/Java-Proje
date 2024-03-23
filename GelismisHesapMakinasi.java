package MetotlarFonksiyonlar;
import java.util.Scanner;
public class GelismisHesapMakinasi {
    static void sum(int num1 , int num2){
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println("#######################################################");
    }
    static void subtraction(int num1 , int num2){
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        System.out.println("#######################################################");
    }
    static void multiplication(int num1 , int num2){
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        System.out.println("#######################################################");
    }
    static void division(double num1 , double num2){
        double result;
        if(num2 == 0.0){
            System.out.println("Sayılar 0'a bölünemez.");
            System.out.println("#######################################################");
        }
        else{
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            System.out.println("#######################################################");
        }
    }
    static void exponentialNumber(int num1 , int num2){
        int result = 1;
        for(int i = 1; num2 >= i; i++){
            result *= num1;
        }
        System.out.println(num1 + "**" + num2  + " = " + result);
        System.out.println("#######################################################");
    }
    static void mode(int num1 , int num2){
        int result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);
        System.out.println("#######################################################");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1-Toplama İşlemi\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üslü Sayı Hesaplama\n"
                + "6-Mod Alma\n"
                + "7-Çıkış Yap";
        while (true){
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçin:");
            int select = input.nextInt();
            if(select == 7){
                System.out.println("Güle Güle!");
                break;
            }
            else if((select > 7) || (select < 1)){
                System.out.println("Lütfen geçerli değer giriniz.");
                System.out.println("#######################################################");
                continue;
            }
            System.out.print("İlk sayıyı girin:");
            int num1 = input.nextInt();
            System.out.print("İkinci sayıyı girin:");
            int num2 = input.nextInt();
            switch (select){
                case 1:
                    sum(num1,num2);
                    break;
                case 2:
                    subtraction(num1,num2);
                    break;
                case 3:
                    multiplication(num1,num2);
                    break;
                case 4:
                    division(num1,num2);
                    break;
                case 5:
                    exponentialNumber(num1,num2);
                    break;
                case 6:
                    mode(num1,num2);
                    break;
            }
        }
    }

}
