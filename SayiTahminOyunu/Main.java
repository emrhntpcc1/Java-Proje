package SayiTahminOyunu;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Rastgele sayı uretildi.
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        //veri girisi
        Scanner input = new Scanner(System.in);
        int right = 0;
        int inputNumber;
        while(right < 5){
            System.out.print("Sayı giriniz: ");
            inputNumber = input.nextInt();
            if((inputNumber < 0) || (inputNumber > 100)){
                System.out.println("Girilen sayı 0-100 arası olmalıdır.");
            }else {
                if(inputNumber == randomNumber){
                    System.out.println("Tebrikler tahmininiz doğru.");
                    break;
                }else{
                    if(inputNumber < randomNumber){
                        right++;
                        System.out.println("Daha büyük sayı girin.\nKalan hak: " + (5 - right));
                    }else {
                        right++;
                        System.out.println("Daha küçük sayı girin.\nKalan hak: "+ (5 - right));
                    }
                }
            }

        }

    }
}
