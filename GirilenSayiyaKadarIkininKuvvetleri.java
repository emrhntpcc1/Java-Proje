import java.util.Scanner;
public class GirilenSayiyaKadarIkininKuvvetleri {
    //Java döngüler ile girilen sayıya kadar
    //olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyorum.
    public static void main(String[] args) {

        int InpNum ,  i = 1 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin:");
        InpNum = input.nextInt();
        while (i < InpNum){
            System.out.println(i);
            i *= 2;
        }
        //Java döngüler ile girilen sayıya
        // kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyorum.
        /*
        int IntNumber;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin:");
        IntNumber = inp.nextInt();
        for (int m = 1 ; m < IntNumber ; m *= 4){
            System.out.print(m + ",");
        }
        System.out.println();
        for (int n = 1 ; n < IntNumber ; n *= 5){
            System.out.print(n + ",");
        }
        */
    }
}
