package day02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsim= scan.nextLine();
        System.out.println("Girilen isim : "+kullaniciIsim);



    }
}
