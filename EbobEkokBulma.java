import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 , num2 , ebob = 1 , ekok;
        System.out.print("1.Sayı:");
        num1 = input.nextInt();
        System.out.print("2.Sayı:");
        num2 = input.nextInt();
        //sayi kontrolu
        if(num1 > num2){
            for(int i = 1; i <= num2; i++){
                if((num1 % i == 0) && (num2 % i == 0)){
                    ebob = i;
                }
            }
            System.out.println("Ebob = " + ebob);
            ekok = (num1 * num2) / ebob;
            System.out.println("Ekok = " + ekok);
        }else{
            for(int j = 1; j <= num1; j++){
                if((num1 % j == 0) && (num2 % j == 0)){
                    ebob = j;
                }
            }
            System.out.println("Ebob = " + ebob);
            ekok = (num1 * num2) / ebob;
            System.out.println("Ekok = " + ekok);
        }
    }
}
