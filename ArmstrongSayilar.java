import java.util.Scanner;
public class ArmstrongSayilar {
    public static void main(String[] args) {
        //kullanicidan sayiyi al
        Scanner input = new Scanner(System.in);
        int InputNumber;
        System.out.print("Sayıyı girin:");
        InputNumber = input.nextInt();

        //basamak sayisini bul
        int basNumbers = 0 , tempNumbers;
        tempNumbers = InputNumber;//sayinin yedegini al
        while (tempNumbers != 0){
            tempNumbers /=  10;
            /* 123 / 10 = 12
               12 / 10 = 1
               1 / 10 = 0
               basNumbers = 3
            */
            basNumbers++;
        }

        //sayinin basamaklarindaki sayilari al
        tempNumbers = InputNumber;
        int basValue , result = 0,basUstTotal;
        while (tempNumbers != 0){
            basValue = tempNumbers % 10;
            /* 123 % 10 = 3(basValue)
               12 % 10 = 2(basValue)
               1 % 10 = 1(basValue)
            */


            //sayilari ustlerini al
            basUstTotal = 1;//tekrardan 1 yapiyoruzki eski degerden devam etmesin.
            for (int i = 1; i <= basNumbers; i++){
                basUstTotal *= basValue;
            }
            tempNumbers /= 10;
            result += basUstTotal;
        }
        // kontrol
        if (result == InputNumber){
            System.out.println(InputNumber + " sayısı Armstrong sayıdır.");
        } else{
            System.out.println(InputNumber + " sayısı Armstrong sayı değildir.");
        }

    }
}
