package CepTelefonMagzasi;

import java.util.Scanner;
//stokta urun yokken hala urunu gir dıyor bu bır bugdur.
public class Magza {
    private PhoneInfo[] telefonBilgileri;
    public int urunSayisi = 0;
    private Scanner input = new Scanner(System.in);

    public void urunBilgiMenu(){
        String Menu = "1-Mağazaya ürün gir:\n" +
                "2-Satış yap !\n" +
                "3-Satın al !\n" +
                "4-Stok bilgilerini görüntüle !\n" +
                "5-Çıkış yapabilirsiniz !";
        System.out.println(Menu);
        System.out.print("İşlemi seçin:");
        int select = input.nextInt();
        switch (select){
            case 1:
                urunEkle();
                urunBilgiMenu();
                break;
            case 2:
                urunSatis();
                urunBilgiMenu();
                break;
            case 3:
                urunAlis();
                urunBilgiMenu();
                break;
            case 4:
                stokBilgi();
                urunBilgiMenu();
                break;
            case 5:
                System.out.println("İyi günler !");
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz !");
        }
    }
    //burasi en onemli yerdir.
    public void urunEkle(){
        System.out.print("Girmek istediğiniz ürün sayısını giriniz:");
        this.urunSayisi = input.nextInt();
        this.telefonBilgileri = new PhoneInfo[urunSayisi + 1];
        for(int i = 1 ; i < this.urunSayisi + 1; i++){
            telefonBilgileri[i] = new PhoneInfo();
            System.out.println(i + " . Telefon için bilgileri gir:");
            telefonBilgileri[i].telefonBilgisiniGir();
            System.out.println();
        }
    }
    public void urunSatis(){
        if(this.urunSayisi == 0){
            stokBilgi();
            urunBilgiMenu();
        }
        stokBilgi();
        System.out.print("Satmak istediğiniz ürün :");
        int select = input.nextInt();
        if(select > telefonBilgileri.length || this.urunSayisi == 0){
            System.out.println("Geçersiz sayı !");
            System.out.println();
        }else {
            System.out.print("Kaç adet satmak istiyorsunuz: ");
            int satilanAdet = input.nextInt();
            for(int i = 0; i < telefonBilgileri.length; i++){
                if(select == i){
                    if(satilanAdet > telefonBilgileri[select].getAdet()){
                        System.out.println("Yetersiz ürün sayısı !");
                    }else{
                        telefonBilgileri[select].setAdet(telefonBilgileri[select].getAdet() - satilanAdet);
                    }
                }
            }
        }
    }
    public void urunAlis(){
        stokBilgi();
        System.out.print("Satın almak istediğiniz ürün :");
        int select = input.nextInt();
        if(select > telefonBilgileri.length || this.urunSayisi == 0){
            System.out.println("Geçersiz sayı !");
            System.out.println();
        }else {
            System.out.print("Kaç adet almak istiyorsunuz: ");
            int buyUrun = input.nextInt();
            telefonBilgileri[select].setAdet(telefonBilgileri[select].getAdet() + buyUrun);
        }
    }

    public void stokBilgi(){
        if(this.urunSayisi == 0){
            System.out.println("Stokta ürün yok !");
            System.out.println();
        }else {
            for(int i = 1 ; i < this.urunSayisi + 1 ; i++){
                System.out.println(i + ". Ürün");
                System.out.println("Marka:" + telefonBilgileri[i].getMarka() + "\t"
                        + "Model:" + telefonBilgileri[i].getModel() + "\t"
                        + "Adet:" + telefonBilgileri[i].getAdet() + "\t");
                System.out.println();
            }
        }

    }

    public void start(){
        urunBilgiMenu();
    }
}
