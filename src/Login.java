
import java.util.Scanner;


public class Login {
    
    public boolean login(Hesap hesap)
    {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        
        System.out.print("Kullanıcı adınızı giriniz :");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Parolanızı giriniz : ");
        parola = scanner.nextLine();
        
        if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola))
        {
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
