package CepTelefonMagzasi;

import java.util.Scanner;

public class PhoneInfo {
    private String marka;
    private String model;
    private int adet;


    public static Scanner input = new Scanner(System.in);

    public PhoneInfo(String marka,String model ,int adet){
        this.marka = marka;
        this.model = model;
        this.adet = adet;
    }
    public PhoneInfo(){
    }
    public void telefonBilgisiniGir(){
        System.out.print("Marka: ");
        String marka = input.next();
        setMarka(marka);
        System.out.print("Model: ");
        String model = input.next();
        setModel(model);
        System.out.print("Adet: ");
        int adet = input.nextInt();
        setAdet(adet);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

}

