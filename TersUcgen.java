import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını girin:");
        int n = input.nextInt();
        for (int i = n ; i >= 1 ; i--){
            System.out.print("");
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
