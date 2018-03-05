
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap)
    {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoş Geldiniz");
        System.out.println("************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("************************");
        
        int girisHakki=3;
        
        while(true)
        {
            if(login.login(hesap))
            {
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                girisHakki--;
                System.out.println("Kalan Giris Hakkınız : "+girisHakki);
            }
            if(girisHakki==0)
            {
                System.out.println("Giriş Hakkınız Bitti");
                return;
            }
        }
        System.out.println("*************************");
        String islemler = "1. Bakiye Görüntüle\n"
                + "2. Para Yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkış İçin q ya Basın\n";
        System.out.println(islemler);
        System.out.println("*************************");
        
        
        while (true) {            
            
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz");
            String islem = scanner.nextLine();
            
            if(islem.equals("q"))
            {
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("bakiyeniz = "+hesap.getBakiye());
            }
            else if(islem.equals("2"))
            {
                System.out.print("Yatırmak İstediğiniz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3"))
            {
                System.out.println("Çekmek İstediğiniz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else
            {
                System.out.println("Hatalı işlem...");
            }
            
        }
    }
    
}
