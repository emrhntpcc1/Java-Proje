import java.util.Scanner;
public class TekSayilarinToplami {
    //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
    // girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyorum.
    public static void main(String[] args) {

        int InpNum , sum = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Sayı Girin:");
            InpNum = input.nextInt();
            if (InpNum % 2 == 1){
                sum += InpNum;
            }

        }while (InpNum > 0);
        System.out.println("Girilen tek sayıların toplamı: " + sum);

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        //girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyorum.
        /*
        int InputNumber , SumNumber = 0;
        do{
            System.out.print("Sayı Girin:");
            Scanner input = new Scanner(System.in);
            InputNumber = input.nextInt();
            if ((InputNumber % 2 == 0) && (InputNumber % 4 ==0)){
                SumNumber += InputNumber;
            }

        }while (InputNumber % 2 == 0);
        System.out.println("Girilen 4 sayısının katlarının toplamı: " + SumNumber);
        */

    }

}
