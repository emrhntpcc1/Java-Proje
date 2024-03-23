package MetotlarFonksiyonlar;

public class PalindromSayi {
    static String isPalindrom(int number){
        int temp , lastNumber , copyNumber = 0;
        temp = number;
        while (temp != 0){
            lastNumber = temp % 10;
            copyNumber = (copyNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (copyNumber == number){
            return number + " Palindrom sayıdır.";
        }
        else {
            return number + " Palindrom sayı değildir.";
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(145541));
    }
}
