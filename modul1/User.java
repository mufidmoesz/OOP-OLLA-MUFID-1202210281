package modul1;

import java.util.Scanner;

public class User {
    
    public void regUser() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = myObj.nextLine();
        System.out.print("Masukkan no. Handphone: ");
        String noHp = myObj.nextLine();
        myObj.close();

        System.out.println("Registrasi berhasil");
        System.out.println("Nama : " + nama);
        System.out.println("No. Handphone : " + noHp);
    }
}
