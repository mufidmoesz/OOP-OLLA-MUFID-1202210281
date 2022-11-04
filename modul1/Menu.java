package modul1;

import java.util.ArrayList;

public class Menu {
    
    public static void main(String[] args) {
        Database db = new Database();
        ArrayList<String> list = db.insertMenu();
        db.showMenu();
        db.searchMenu();
    }
}
