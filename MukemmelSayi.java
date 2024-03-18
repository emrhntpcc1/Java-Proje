import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber,total = 0;
        System.out.print("Mükemmel Sayı Girin:");
        inputNumber = input.nextInt();
        for(int i = 1; i < inputNumber; i++){
            if(inputNumber % i == 0){
                total += i;
            }
        }
        if(total == inputNumber){
            System.out.println(inputNumber + " Mükemmel sayıdır.");
        }else{
            System.out.println(inputNumber + " Mükemmel sayı değildir.");
        }
    }
}
