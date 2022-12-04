package TPMODUL2_MUFID;

public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, double processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    /* (non-Javadoc)
     * @see TPMODUL2_MUFID.Perangkat#informasi()
     */
    @Override
    public void informasi() {
        
        System.out.println("Laptop memiliki drive tipe " + drive + " dengan ram sebesar "+ram+" GB dan processor secepat "+processor+ " Hz");
        if (webcam == true) {
            System.out.println("Laptop memiliki webcam");
        } else {
            System.out.println("Laptop tidak memiliki webcam");
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop sedang membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " +email);

    }
    
    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " +email1+ " dan " +email2+"\n");
    }
    
}
