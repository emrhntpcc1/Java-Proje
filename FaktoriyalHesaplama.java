import java.util.Scanner;
public class FaktoriyalHesaplama {
    //Java ile faktöriyel hesaplayan program yazıyoruz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = 1 , InpNum;
        System.out.print("Sayı Girin:");
        InpNum = input.nextInt();
        for(int i = 1; i <= InpNum; i++){
            fact *= i;
        }
        System.out.println( InpNum +" sayısının faktoriyeli = " + fact);

    }
}
