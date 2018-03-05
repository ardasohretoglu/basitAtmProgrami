/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ardas
 */
public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Arda Sohretoglu", "12345", 2000);
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor ... ");
    }
    
}
