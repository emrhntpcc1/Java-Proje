import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month , day;
        String burc = "" ;
        boolean isError = false;
        //bilgi al
        Scanner input =new Scanner(System.in);
        System.out.print("Doğduğunuz ay:");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün:");
        day = input.nextInt();
        //aylar
        if (month <= 12){
            switch (month){
                case 1://ocak
                    if ((day >=1) && (day <=31)){
                        if (day >= 21){
                            burc = "Kova";
                        }else{
                            burc = "Oğlak";
                        }
                        break;
                    }else{
                        isError = true;
                    }
                    break;
                case 2://subat
                    if ((day >=1) && (day <=28)){
                        if (day >= 20){
                            burc = "Balık";
                        }else {
                            burc = "Kova";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 3://mart
                    if ((day >=1) && (day <=31)){
                        if (day >= 21){
                            burc = "Koç";
                        }else {
                            burc = "Balık";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 4://nisan
                    if ((day >=1) && (day <=30)){
                        if (day >= 21){
                            burc = "Boğa";
                        }else{
                            burc = "Koç";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 5://mayis
                    if ((day >=1) && (day <=31)){
                        if (day >= 22){
                            burc = "İkizler";
                        }else{
                            burc = "Boğa";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 6://haziran
                    if ((day >=1) && (day <=30)){
                        if (day >= 23){
                            burc = "Yengeç";
                        }else{
                            burc = "İkizler";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 7://temmuz
                    if ((day >=1) && (day <=31)){
                        if (day >= 23){
                            burc = "Aslan";
                        }else{
                            burc = "Yengeç";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 8://agustos
                    if ((day >=1) && (day <=31)){
                        if (day >= 23){
                            burc = "Başak";
                        }else{
                            burc = "Aslan";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 9://eylul
                    if ((day >=1) && (day <=30)){
                        if (day >= 23){
                            burc = "Terazi";
                        }else{
                            burc = "Başak";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 10://ekim
                    if ((day >=1) && (day <=31)){
                        if (day >= 23){
                            burc = "Akrep";
                        }else{
                            burc = "Terazi";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 11://kasım
                    if ((day >=1) && (day <=30)){
                        if (day >= 22){
                            burc = "Yay";
                        }else{
                            burc = "Akrep";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

                case 12://aralik
                    if ((day >=1) && (day <=31)){
                        if (day >= 22){
                            burc = "Oğlak";
                        }else{
                            burc = "Yay";
                        }
                        break;
                    }else {
                        isError = true;
                    }
                    break;

            }
            //hata blogu
            // isError = true oldugunda if blogu calisir yanlis oldugunda else blogu calisir.
            if (isError){
                System.out.println("Hatalı gün girdiniz.");
            }else {
                System.out.println("Burcunuz:" + burc);
            }

        }else{
            System.out.println("Hatalı ay girdiniz.");
        }

    }
}
