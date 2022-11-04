package modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {


    ArrayList<String> list = new ArrayList<String>();
    public ArrayList<String> insertMenu() {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama menu: ");
        String menu = input.nextLine();
        System.out.print("Masukkan harga menu: ");
        String harga = input.nextLine();
        System.out.print("Masukkan kategori: ");
        String kategori = input.nextLine();

        input.close();

        list.add(menu);
        list.add(harga);
        list.add(kategori);

        System.out.println("Menu berhasil ditambahkan");

        return list;
    }

    public void showMenu() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void searchMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama menu: ");
        String menu = input.nextLine();
        input.close();

        if (menu.equals(list.get(0))) {
            System.out.println("Menu: " + list.get(0));
            System.out.println("Harga: " + list.get(1));
            System.out.println("Kategori: " + list.get(2));
        } else {
            System.out.println("Menu tidak ditemukan");
        }
    }
}