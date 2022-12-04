package TPMODUL2_MUFID;

public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, double processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    /* (non-Javadoc)
     * @see TPMODUL2_MUFID.Perangkat#informasi()
     */
    @Override
    public void informasi() {
        System.out.println("Handphone memiliki drive tipe " + drive + " dengan ram sebesar "+ram+" GB dan processor secepat "+processor+ " Hz");
        if (fingerprint == true) {
            System.out.println("Handphone memiliki fingerprint");
        } else {
            System.out.println("Handphone tidak memiliki fingerprint");
        }
    }

    public void call(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan ke No "+no_hp);

    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp);

    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp1+ " dan No " +no_hp2+"\n");
    }
}
