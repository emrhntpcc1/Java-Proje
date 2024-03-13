import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        String zodyak = "Çin Zodyağı Burcunuz:";
        short dogumTarih ;
        int kalan;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı girin:");
        dogumTarih = input.nextShort();
        kalan = dogumTarih % 12;

        switch (kalan){
            case 0:
                System.out.println(zodyak + " Maymun");
                break;
            case 1:
                System.out.println(zodyak + " Horoz");
                break;
            case 2:
                System.out.println(zodyak + " Köpek");
                break;
            case 3:
                System.out.println(zodyak + " Domuz");
                break;
            case 4:
                System.out.println(zodyak + " Fare");
                break;
            case 5:
                System.out.println(zodyak + " Öküz");
                break;
            case 6:
                System.out.println(zodyak + " Kaplan");
                break;
            case 7:
                System.out.println(zodyak + " Tavşan");
                break;
            case 8:
                System.out.println(zodyak + " Ejderha");
                break;
            case 9:
                System.out.println(zodyak + " Yılan");
                break;
            case 10:
                System.out.println(zodyak +  " At");
                break;
            case 11:
                System.out.println(zodyak + " Koyun");
                break;

        }
    }
}
