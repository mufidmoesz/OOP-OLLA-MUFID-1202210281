package MODUL2_MUFID;

public class TransportasiAir {
    protected int jumlahKursi, biaya; 

    //constructor
    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    //public methods
    public void informasi() {
        System.out.println("Transportasi air jenis tidak diketahui dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi air jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh() {
        System.out.println("Transportasi air jenis tidak diketahui sedang berlabuh di pantai\n");
    }
}
