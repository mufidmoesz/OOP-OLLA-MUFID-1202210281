package modul1;

import java.util.ArrayList;

public class Menu {
    
    public void menu() {
        Database db = new Database();
        ArrayList<String> list = db.Menu();
        db.showMenu();
        db.searchMenu();
    }
}
