import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        //arayüz sorulari
        String userName , password , check , NewPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı:");
        userName = input.nextLine();
        System.out.print("Şifre:");
        password = input.nextLine();
        //kontroller
        if (userName.equals("java101") && (password.equals("java1420"))){
            System.out.println("Giriş başarılı !");
        }else{
            System.out.println("Kullanıcı adı veya şifre hatalı.");
            System.out.print("Şifrenizi sıfırlamak istermisiniz:");
            check = input.nextLine();
            if (check.equals("evet")){
                System.out.print("Yeni şifrenizi girin:");
                NewPassword = input.nextLine();
                if (NewPassword.equals("java1420")){
                    System.out.println("Eski şifrenizden farklı olmalıdır.");
                }else{
                    System.out.println("Şifreniz güncellenmiştir.");
                }
            }else{
                System.out.println("İyi günler.");
            }
        }

    }
}
