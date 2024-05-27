package CepTelefonMagzasi;
import java.util.Scanner;

public class PhoneInput {

    private PhoneInfo[] phoneInfos;
    private int phoneNumber;//phoneInfos.lenght ile aynidir.

    public void getPhoneInfos(){
        Scanner input = new Scanner (System.in);
        System.out.print("Kaç adet ürün giriceksiniz:");
        this.phoneNumber = input.nextInt();
        this.phoneInfos = new PhoneInfo[this.phoneNumber + 1];
        int sayac = 0;

        while(sayac < this.phoneNumber){
            System.out.print("Marka: ");
            String marka = input.next();
            System.out.print("Model: ");
            String model = input.next();
            System.out.print("Adet: ");
            int adet = input.nextInt();
            for(int i = 0; i <= this.phoneNumber; i++){
                this.phoneInfos[i] = new PhoneInfo(marka, model,adet);
            }
            sayac++;
        }
    }
    public void printPhone(){
        for(int i = 0; i < this.phoneNumber; i++){
            System.out.println(phoneInfos[i]);
        }
    }
    public void adetDusur(int x){

    }
}
