import java.util.Scanner;
public class BasamakSayilariTopla {
    //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    public static void main(String[] args) {
        //verileri al
        int IntNumber ,tempNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı girin:");
        IntNumber = input.nextInt();
        tempNumber = IntNumber;
        //basamak degerlerini yazdir
        int basValue ,total = 0 ;

        while (tempNumber != 0){
            basValue = tempNumber % 10;
            total += basValue;
            tempNumber /= 10;
        }
        System.out.println(IntNumber + " sayısının basamak toplamı = " + total);
    }
}
