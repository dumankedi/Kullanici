import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kullaniciAdi,sifre;
        System.out.print("Kullanıcı Adınızı Giriniz:");
        kullaniciAdi=input.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        sifre=input.nextLine();
        if (kullaniciAdi.equals("Deneme")&&sifre.equals("123")){
            System.out.println("Giriş Yaptınız");
        }
        else{
            System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}