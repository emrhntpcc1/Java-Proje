import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int taban , us , total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin:");
        taban = input.nextInt();
        System.out.print("Üs değerini girin:");
        us = input.nextInt();
        for(int sayac = 1; sayac <= us; sayac++){
            total *= taban;
        }
        System.out.println("=> " + total);
    }
}
