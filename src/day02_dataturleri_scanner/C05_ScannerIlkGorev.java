package day02_dataturleri_scanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {
    public static void main(String[] args) {


        /*
        Kullanicidan bir sayi alin ve karesini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir say giriniz");
        int sayi= scan.nextInt();

        System.out.println("Girilen sayinin karesi : "+(sayi*sayi));
    }
}
