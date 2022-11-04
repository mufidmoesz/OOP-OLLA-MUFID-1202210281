package modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        System.out.println("Selamat Datang di restoran EAD");
        System.out.println("Silahkan registrasi terlebih dahulu");
        System.out.println("======================");

        User user = new User();
        user.regUser();

        System.out.println("======================");
        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
        System.out.println("4. Masukkan menu");
        System.out.println("======================");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan: ");
        int pilihan = Integer.parseInt(input.nextLine());
        input.close();

    
        Database db = new Database();
        if (pilihan == 1) {
            db.showMenu();
        } else if (pilihan == 2) {
            db.searchMenu();
        } else if (pilihan == 3) {
            System.out.println("Terima kasih");
        } else if (pilihan == 4) {
            db.insertMenu();
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}
