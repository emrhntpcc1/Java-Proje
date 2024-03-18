import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName , password;
        int hak = 3 , select , bakiye = 1500;
        while (hak >0){
            //arayuz
            System.out.print("Kullanıcı adı:");
            userName = input.nextLine();
            System.out.print("Şifre:");
            password = input.nextLine();
            //kontroller
            if(userName.equals("emrhn_tpcc1") && password.equals("123emir123")){
                System.out.println("Bankamıza hoşgeldiniz.");
                //tekrarlı islemler
                do{
                    System.out.print("Lütfen yapmak istediğiniz işlemi tuşlayınız:\n" +
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap\n" +
                            "==>");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                            int yatirilanTutar = input.nextInt();
                            bakiye += yatirilanTutar;
                            System.out.println(yatirilanTutar + " TL hesabınıza yatırma işleminiz başarıyla gerçekleşmiştir.");
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı girin:");
                            int cekilenTutar = input.nextInt();
                            if (cekilenTutar > bakiye){
                                System.out.println("Yetersiz bakiye.Güncel bakiyeniz:" + bakiye + " TL");
                            }else {
                                bakiye -= cekilenTutar;
                                System.out.println(cekilenTutar + " TL para çekme işleminiz onaylanmıştır.");
                            }
                            break;

                        case 3:
                            System.out.println("Güncel bakiyeniz: " + bakiye + " TL");
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrardan görüşmek üzere iyi günler dileriz.");
                break;
            }else{
                hak--;
                if(hak == 0){
                    System.out.println("Hesabınız bloke olmuştur.\nBankamız ile iletişime geçiniz.");
                }else {
                    System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
                    System.out.println("Lütfen tekrar deneyiniz.");
                    System.out.println("Kalan deneme hakkınız:" + hak );
                }
            }
        }
    }
}
