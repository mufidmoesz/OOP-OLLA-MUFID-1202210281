package modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {


    ArrayList<String> list = new ArrayList<String>();
    public ArrayList<String> Menu() {
        list.add("Bakso (Makanan) Rp. 10000");
        list.add("Es Teh (Minuman) Rp. 5000");
        list.add("Nasi Padang (Makanan) Rp. 15000");
        return list;
    }

    public String showMenu() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        return null;
    }

    public void searchMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama menu: ");
        String menu = input.nextLine();
        // input.close();

        if (menu.equals(list.get(0))) {
            System.out.println("Menu: " + list.get(0));
            System.out.println("Harga: " + list.get(1));
            System.out.println("Kategori: " + list.get(2));
        } else {
            System.out.println("Menu tidak ditemukan");
        }
    }
}