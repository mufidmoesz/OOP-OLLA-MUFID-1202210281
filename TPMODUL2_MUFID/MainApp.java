package TPMODUL2_MUFID;

public class MainApp {
    
    public static void main(String[] args) {
        Perangkat device = new Perangkat("Adata", 16, 4.2);
        Laptop myLaptop = new Laptop("Seagate", 16, 5.4, true);
        Handphone myHandphone = new Handphone("Sandisk", 4, 1.8, false);

        device.informasi();
        
        myLaptop.informasi();
        myLaptop.bukaGame("Genshin Impact");
        myLaptop.kirimEmail("joko@gmail.com");
        myLaptop.kirimEmail("budi@gmail.com", "nilou@gmail.com");

        myHandphone.informasi();
        myHandphone.call(123456789);
        myHandphone.kirimSMS(987654321);
        myHandphone.kirimSMS(987654321, 123456789);
        
    }
}
